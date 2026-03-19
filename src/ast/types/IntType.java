package ast.types;

import visitor.Visitor;

public class IntType implements Type {
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
}
