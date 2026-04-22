package ast.types;

import errorHandler.ErrorHandler;
import ast.Locatable;
import visitor.Visitor;

import java.util.List;

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
        return "Error: '" + message + '\'' + ", " +
                "Line:" + locatable.getLine() + ", Column:" + locatable.getColumn();
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public void mustBeLogical(Locatable locatable) {

    }

    @Override
    public Type arithmetic(Type other, Locatable locatable) {
        return this;
    }

    @Override
    public Type comparison(Type other, Locatable locatable) {
        return this;
    }

    @Override
    public Type logical(Type other, Locatable locatable) {
        return this;
    }

    @Override
    public Type arithmetic(Locatable locatable) {
        return this;
    }

    @Override
    public void mustPromotes(Type other, Locatable locatable) {

    }

    @Override
    public void mustBeBuildIn(Locatable locatable) {

    }

    @Override
    public Type squareBrackets(Type other, Locatable locatable) {
        return this;
    }

    @Override
    public Type dot(String field, Locatable locatable) {
        return this;
    }

    @Override
    public Type parenthesis(List<Type> types, Locatable locatable) {
        return this;
    }

    @Override
    public Type canBeCast(Type other, Locatable locatable) {
        return this;
    }

    @Override
    public int numberOfBytes() {
        throw  new UnsupportedOperationException("Se ha producido un error con la variable");
    }

    @Override
    public Character suffix() {
        throw new UnsupportedOperationException("No se puede obtener el sufijo del tipo " + this.toString());
    }
}
