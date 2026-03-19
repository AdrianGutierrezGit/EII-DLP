package ast.types;

import visitor.Visitor;

public class DoubleType implements Type {

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
}
