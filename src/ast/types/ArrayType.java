package ast.types;

import ast.Locatable;
import visitor.Visitor;

public class ArrayType extends AbstractType {

    private int size;
    private Type elementsType;
    public ArrayType(int size, Type elementsType) {
        this.size = size;
        this.elementsType = elementsType;
    }

    public int getSize(){
        return size;
    }

    public Type getElementsType(){
        return elementsType;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public String toString() {
        return "Array";
    }
    @Override
    public Type squareBrackets(Type other, Locatable locatable) {
       if(other.equals(IntType.getInstance())){
           return this.getElementsType();
       }
        return new ErrorType("El índice para acceder al array debe ser de tipo entero, pero se ha encontrado el tipo " + other.toString(), locatable);
    }

    @Override
    public int numberOfBytes(){
        return this.size * this.getElementsType().numberOfBytes();
    }

}
