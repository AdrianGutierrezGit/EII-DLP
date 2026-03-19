package visitor;


import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.expressions.binaryOperations.Arithmetic;
import ast.expressions.binaryOperations.Comparison;
import ast.expressions.binaryOperations.Logic;
import ast.statements.*;
import ast.types.*;

public class LValueVisitor implements Visitor<Void,Void>{

    @Override
    public Void visit(Variable v, Void param) {
        v.setLValue(true);
        return param;
    }

    @Override
    public Void visit(Comparison c, Void param) {
        c.getLeft().accept(this,param);
        c.getRight().accept(this,param);
        c.setLValue(false);
        return param;
    }

    @Override
    public Void visit(Arithmetic a, Void param) {
        a.getLeft().accept(this,param);
        a.getRight().accept(this,param);
        a.setLValue(false);
        return param;
    }

    @Override
    public Void visit(Logic l, Void param) {
        l.getLeft().accept(this,param);
        l.getRight().accept(this,param);
        l.setLValue(false);
        return param;
    }

    @Override
    public Void visit(ArrayAccess a, Void param) {
        a.getArray().accept(this,param);
        a.getIndex().accept(this,param);
        a.setLValue(true);
        return param;
    }

    @Override
    public Void visit(Cast c, Void param) {
        c.getCastType().accept(this,param);
        c.getExpression().accept(this,param);
        c.setLValue(false);
        return param;
    }

    @Override
    public Void visit(CharLiteral c, Void param) {
        c.setLValue(false);
        return param;
    }

    @Override
    public Void visit(FieldAccess f, Void param) {
        f.getField().accept(this,param);
        f.setLValue(true);
        return param;
    }

    @Override
    public Void visit(IntLiteral i, Void param) {
        i.setLValue(false);
        return param;
    }

    @Override
    public Void visit(Invocation i, Void param) {
        i.getFunction().accept(this,param);
        for(Expression e:i.getArguments()){
            e.accept(this,param);
        }
        i.setLValue(false);
        return param;
    }

    @Override
    public Void visit(NumberLiteral n, Void param) {
        n.setLValue(false);
        return param;
    }

    @Override
    public Void visit(UnaryMinus u, Void param) {
        u.getOperand().accept(this,param);
        u.setLValue(false);
        return param;
    }

    @Override
    public Void visit(UnaryNot u, Void param) {
        u.getOperand().accept(this,param);
        u.setLValue(false);
        return param;
    }

    @Override
    public Void visit(FunctionDefinition f, Void param) {
        f.getType().accept(this,param);
        for(Statement s:f.getStatements()){
            s.accept(this,param);
        }
        return param;
    }

    @Override
    public Void visit(VarDefinition v, Void param) {
        v.getType().accept(this,param);
        return param;
    }

    @Override
    public Void visit(Assignment a, Void param) {
        a.getLeft().accept(this,param);
        a.getRight().accept(this,param);
        if(!a.getLeft().isLValue()){
            new ErrorType("La asignación no es válida",a);
        }
        return param;
    }

    @Override
    public Void visit(IfElse i, Void param) {
        i.getCondition().accept(this,param);
        for(Statement s: i.getIfStatements()){
            s.accept(this,param);
        }
        if (i.getElseStatements() != null) {
            for(Statement s: i.getElseStatements()){
                s.accept(this,param);
            }
        }
        return param;
    }

    @Override
    public Void visit(Input i, Void param) {
        i.getExpression().accept(this,param);
        if(!i.getExpression().isLValue()){
            new ErrorType("La expresión del input no es correcta",i);
        }
        return param;
    }

    @Override
    public Void visit(Log l, Void param) {
        l.getExpression().accept(this,param);
        return param;
    }

    @Override
    public Void visit(Return r, Void param) {
        if (r.getExpression() != null) {
            r.getExpression().accept(this,param);
        }
        return param;
    }

    @Override
    public Void visit(While w, Void param) {
        w.getCondition().accept(this,param);
        for(Statement s: w.getStatements()){
            s.accept(this,param);
        }
        return param;
    }

    @Override
    public Void visit(ArrayType a, Void param) {
        a.getElementsType().accept(this,param);
        return param;
    }

    @Override
    public Void visit(CharType c, Void param) {
        return param;
    }

    @Override
    public Void visit(DoubleType d, Void param) {
        return param;
    }

    @Override
    public Void visit(ErrorType e, Void param) {
        return param;
    }

    @Override
    public Void visit(FunctionType f, Void param) {
        f.getReturnType().accept(this,param);
        for(VarDefinition v: f.getParameters()){
            v.accept(this,param);
        }
        return param;
    }

    @Override
    public Void visit(IntType i, Void param) {
        return param;
    }

    @Override
    public Void visit(RecordType r, Void param) {
        for(RecordField f : r.getFields()) {
            f.accept(this, param);
        }
        return param;
    }

    @Override
    public Void visit(VoidType v, Void param) {
        return param;
    }

    @Override
    public Void visit(Program p, Void param) {
        for(Definition d:p.getProgramDefinitions()){
            d.accept(this,param);
        }
        return param;
    }

    @Override
    public Void visit(RecordField recordField, Void param) {
        return param;
    }
}
