package ast.types;

public class VoidType implements Type {
    private static VoidType voidType = new VoidType();

    private VoidType(){

    }

    public static VoidType getInstance(){
        return voidType;
    }
}
