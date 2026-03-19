package ast.types;

import visitor.Visitor;

public class CharType implements Type {

    private static CharType charType = new CharType();

    private CharType(){

    }

    public static CharType getInstance(){
        return charType;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }
}
