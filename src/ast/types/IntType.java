package ast.types;

import ast.Locatable;
import visitor.Visitor;

public class IntType extends AbstractType {
    private static IntType intType = new IntType();

    private IntType(){

    }

    public static IntType getInstance(){
        return intType;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public String toString() {
        return "Int";
    }

    @Override
    public Type arithmetic(Type other, Locatable locatable) {
        if(other.equals(IntType.getInstance()) || other.equals(CharType.getInstance())){
            return this;
        }else if(other.equals(DoubleType.getInstance())){
            return other;
        }
        return super.arithmetic(other,locatable);
    }

    @Override
    public void mustBeLogical(Locatable locatable){

    }

    @Override
    public Type comparison(Type other, Locatable locatable) {
        if (other.equals(IntType.getInstance()) || other.equals(DoubleType.getInstance()) || other.equals(CharType.getInstance())) {
            return this;
        }
        return super.comparison(other, locatable);
    }

    @Override
    public Type logical(Type other, Locatable locatable) {
        if (other.equals(IntType.getInstance())) {
            return this;
        }
        return super.logical(other, locatable);
    }

    @Override
    public Type arithmetic(Locatable locatable){
        return this;
    }

    @Override
    public void mustPromotes(Type other, Locatable locatable) {
        if (other.equals(IntType.getInstance()) || other.equals(DoubleType.getInstance())) {
            return;
        }
        super.mustPromotes(other,locatable);
    }

    @Override
    public void mustBeBuildIn(Locatable locatable) {
    }

    @Override
    public Type canBeCast(Type other, Locatable locatable) {
        if (other.equals(IntType.getInstance()) || other.equals(DoubleType.getInstance()) || other.equals(CharType.getInstance())) {
            return other;
        }
        return super.comparison(other, locatable);
    }

    @Override
    public int numberOfBytes(){
        return 2;
    }

    @Override
    public Character suffix(){
        return 'i';
    }
}
