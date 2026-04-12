package visitor;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void,Void>{//aqui mirar lo del error creando una vardefinition de tipo errotType
    SymbolTable st = new SymbolTable();
    @Override
    public Void visit(Variable v, Void param) {
        Definition d = st.find(v.getName());
        if(d != null) {
            v.setDefinition(d);
        }else{
            v.setDefinition(new VarDefinition(v.getLine(),v.getColumn(),"varArtificial",new ErrorType("La variable llamada '" + v.getName() + "' a la que se intenta acceder, no está declarada",v)));
        }
        return param;
    }

    @Override
    public Void visit(FunctionDefinition f, Void param) {
        if(!st.insert(f)){
            new ErrorType("Ya existe otra función con el mismo nombre que la que se intenta declarar",f);
        }
        st.set();
        super.visit(f,param);
        st.reset();
        return param;
    }

    @Override
    public Void visit(VarDefinition v, Void param) {
        super.visit(v,param);
        if(!st.insert(v)){
            new ErrorType("Ya existe otra variable con el mismo nombre que la que se intenta declarar",v);
        }
        return param;
    }
    @Override
    public Void visit(Invocation i, Void param) {
        Definition d = st.find(i.getFunction().getName());
        if(d != null) {
            i.getFunction().setDefinition(d);
        }else{
            new ErrorType("La función llamada '" + i.getFunction().getName() + "' a la que se intenta invocar, no está declarada",i);
        }
        for (Expression arg : i.getArguments()) {
            arg.accept(this, param);
        }
        return param;

    }

}
