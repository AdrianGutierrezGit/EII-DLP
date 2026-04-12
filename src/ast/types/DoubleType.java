package ast.types;

import ast.Locatable;
import visitor.Visitor;

public class DoubleType extends AbstractType {

    private static DoubleType doubleType = new DoubleType();

    private DoubleType(){

    }

    public static DoubleType getInstance(){
        return doubleType;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public String toString() {
        return "Double";
    }

    @Override
    public Type arithmetic(Type other, Locatable locatable) {
        if(other.equals(DoubleType.getInstance()) || other.equals(CharType.getInstance()) || other.equals(IntType.getInstance())){
            return this;
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
        return this;
    }

    @Override
    public void mustPromotes(Type other, Locatable locatable) {
        if (other.equals(DoubleType.getInstance())) {
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
        return 4;
    }
}
