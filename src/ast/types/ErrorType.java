package ast.types;

import errorHandler.ErrorHandler;
import ast.Locatable;
import visitor.Visitor;

public class ErrorType implements Type{
    private String message;
    private Locatable locatable;

    public ErrorType(String message, Locatable locatable) {
        this.message = message;
        this.locatable = locatable;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "Error: '" + message + '\'' + "\n" +
                "Line:" + locatable.getLine() + "\nColumn:" + locatable.getColumn();
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }
}
