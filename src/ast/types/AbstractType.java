package ast.types;

import ast.Locatable;

import java.util.List;

public abstract class AbstractType implements Type{
    @Override
    public void mustBeLogical(Locatable locatable) {
        new ErrorType("La condición debe ser de un tipo que promocione a un entero",locatable);
    }

    @Override
    public Type arithmetic(Type other, Locatable locatable) {
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType("El tipo " + this.toString() + " no se puede operar junto con el tipo " + other.toString() + " en una operación aritmética",locatable);
    }

    @Override
    public Type comparison(Type other,Locatable locatable){
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType("El tipo " + this.toString() + " no se puede operar junto con el tipo " + other.toString() + " en una operación de comparación",locatable);
    }

    @Override
    public Type logical(Type other,Locatable locatable){
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType("El tipo " + this.toString() + " no se puede operar junto con el tipo " + other.toString() + " en una operación lógica",locatable);
    }

    @Override
    public Type arithmetic(Locatable locatable){
        return new ErrorType("El tipo " + this.toString() + " no soporta la operación aritmética unaria",locatable);
    }

    @Override
    public void mustPromotes(Type other, Locatable locatable) {
        if(other instanceof ErrorType){
            return;
        }
        new ErrorType("No se puede asignar o convertir el tipo " + this.toString() + " al tipo " + other.toString(),locatable);
    }

    @Override
    public void mustBeBuildIn(Locatable locatable) {
        new ErrorType("Se esperaba un tipo simple (int, number o char), pero se encontró " + this.toString(),locatable);
    }

    @Override
    public Type squareBrackets(Type other, Locatable locatable) {
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType("El tipo " + this.toString() + " no soporta el acceso mediante corchetes",locatable);
    }

    @Override
    public Type dot(String field, Locatable locatable) {
        return new ErrorType("El tipo " + this.toString() + " no soporta el operador punto '.'",locatable);
    }

    @Override
    public Type parenthesis(List<Type> types, Locatable locatable) {
        return new ErrorType("El tipo " + this.toString() + " no es invocable (no es una función)",locatable);
    }

    @Override
    public Type canBeCast(Type other, Locatable locatable) {
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType("No se puede castear el tipo " + this.toString() + " al tipo " + other.toString(),locatable);
    }

    @Override
    public int numberOfBytes(){
        throw new UnsupportedOperationException("Una variable no puede ser de tipo " + this.toString());
    }

}
