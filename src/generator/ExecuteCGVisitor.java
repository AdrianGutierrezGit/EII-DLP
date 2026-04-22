package generator;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.statements.Assignment;
import ast.statements.Input;
import ast.statements.Log;
import ast.statements.Statement;
import ast.types.FunctionType;
import ast.types.Type;
import ast.types.VoidType;

import java.util.List;
import java.util.ArrayList;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,Void>{
    //se instancian en el constructuor, y recibe el codegeneratior
    private ValueCGVisitor value;
    private AddressCGVisitor address;
    private CodeGenerator cg;

    public ExecuteCGVisitor(CodeGenerator cg){
        this.cg = cg;
        this.value = new ValueCGVisitor(cg);
        this.address = new AddressCGVisitor(cg);
        //setearlas entre ellas
        this.value.setAddress(address);
        this.address.setValue(value);
    }

    @Override
    public Void visit(Program p, Void param) {
        for (Definition def : p.getProgramDefinitions()) {
            if (def instanceof VarDefinition) {
                def.accept(this, param);
            }
        }

        cg.callMain();
        cg.halt();

        for (Definition def : p.getProgramDefinitions()) {
            if (def instanceof FunctionDefinition) {
                def.accept(this, param);
            }
        }
        cg.close();
        return null;
    }

    @Override
    public Void visit(FunctionDefinition f, Void param) {
        cg.line(f.getLine());
        cg.label(f.getName());

        Type returnType = f.getType();
        List<VarDefinition> parameters = new ArrayList<>();

        if (f.getType() instanceof FunctionType) {
            FunctionType ft = (FunctionType) f.getType();
            parameters = ft.getParameters();
            returnType = ft.getReturnType();
        }

        cg.comment("Parameters");
        for (VarDefinition p : parameters) {
            p.accept(this, param);
        }

        cg.comment("Local variables");
        for (Statement s : f.getStatements()) {
            if (s instanceof VarDefinition) {
                s.accept(this, param);
            }
        }

        cg.enter(f.getTotalBytes());

        for (Statement s : f.getStatements()) {
            if (!(s instanceof VarDefinition)) {
                s.accept(this, param);
            }
        }

        if (returnType instanceof VoidType) {
            int paramsBytes = 0;
            for (VarDefinition p : parameters) {
                paramsBytes += p.getType().numberOfBytes();
            }
            cg.ret(0, f.getTotalBytes(), paramsBytes);
        }

        return null;
    }

    @Override
    public Void visit(VarDefinition v, Void param) {
        String typeName = "";
        if (v.getType() instanceof ast.types.IntType) typeName = "int";
        else if (v.getType() instanceof ast.types.CharType) typeName = "char";
        else if (v.getType() instanceof ast.types.DoubleType) typeName = "real"; // Double a real
        else typeName = v.getType().toString();

        cg.comment(typeName + " " + v.getName() + " (offset " + v.getOffset() + ")");
        return null;
    }

    @Override
    public Void visit(Assignment a, Void param) {
        cg.line(a.getLine());
        cg.comment("Assignment");

        a.getLeft().accept(address, null);
        a.getRight().accept(value, null);
        cg.convertTo(a.getRight().getType(), a.getLeft().getType());
        cg.store(a.getLeft().getType());
        return null;
    }

    @Override
    public Void visit(Log l, Void param) {
        cg.line(l.getLine());
        cg.comment("Write");

        l.getExpression().accept(value, null);
        cg.out(l.getExpression().getType());

        return null;
    }

    @Override
    public Void visit(Input i, Void param) {
        cg.line(i.getLine());
        cg.comment("Read");

        i.getExpression().accept(address, null);
        cg.in(i.getExpression().getType());
        cg.store(i.getExpression().getType());
        return null;
    }
}
