package ast.types;

import visitor.Visitor;

public class VoidType implements Type {
    private static VoidType voidType = new VoidType();

    private VoidType(){

    }

    public static VoidType getInstance(){
        return voidType;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }
}
