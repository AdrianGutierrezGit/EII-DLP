package ast.types;

import ast.definitions.VarDefinition;

import java.util.List;

public class FunctionType implements Type {
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
}
