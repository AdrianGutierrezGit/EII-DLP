package ast.types;

import ast.Locatable;
import ast.definitions.VarDefinition;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {
    private Type returnType;
    private List<VarDefinition> parameters;

    public FunctionType(List<VarDefinition> parameters, Type returnType) {
        this.parameters = parameters;
        this.returnType = returnType;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<VarDefinition> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "Función";
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public Type parenthesis(List<Type> types, Locatable locatable) {
        if(types.size() != this.parameters.size()){
            return new ErrorType("Invocación incorrecta. Se esperaban " +
                    this.parameters.size() + " argumentos, pero se pasaron " + types.size(), locatable);
        }
        for (int i = 0; i < types.size(); i++) {
            Type type = types.get(i);
            Type paramType = this.parameters.get(i).getType();
            type.mustPromotes(paramType, locatable);
        }
        return this.returnType;
    }
}
