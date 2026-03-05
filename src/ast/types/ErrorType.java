package ast.types;

import ast.AbstractLocatable;
import ast.ErrorHandler;
import ast.Locatable;

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
}
