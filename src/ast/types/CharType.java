package ast.types;

import ast.Locatable;
import visitor.Visitor;

public class CharType extends AbstractType {

    private static CharType charType = new CharType();

    private CharType(){

    }

    @Override
    public String toString() {
        return "Char";
    }

    public static CharType getInstance(){
        return charType;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public Type arithmetic(Type other, Locatable locatable) {
        if(other.equals(IntType.getInstance()) || other.equals(CharType.getInstance())){
            return IntType.getInstance();
        }else if(other.equals(DoubleType.getInstance())){
            return other;
        }
        return super.arithmetic(other,locatable);
    }

    @Override
    public Type comparison(Type other, Locatable locatable) {
        if (other.equals(IntType.getInstance()) || other.equals(DoubleType.getInstance()) || other.equals(CharType.getInstance())) {
            return IntType.getInstance();
        }
        return super.comparison(other, locatable);
    }

    @Override
    public Type arithmetic(Locatable locatable){
        return IntType.getInstance();
    }

    @Override
    public void mustPromotes(Type other, Locatable locatable) {
        if (other.equals(IntType.getInstance()) || other.equals(DoubleType.getInstance()) || other.equals(CharType.getInstance())) {
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
        return 1;
    }
}
