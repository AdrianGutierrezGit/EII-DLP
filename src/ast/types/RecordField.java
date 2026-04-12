package ast.types;

import ast.AbstractLocatable;
import ast.Locatable;
import visitor.Visitor;

public class RecordField implements Locatable {

    private String name;
    private Type type;
    private int offset;
    private int line;
    private int column;
    public RecordField(int line,int column, String name, Type type) {
        this.name = name;
        this.type = type;
        this.line = line;
        this.column = column;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "RecordField{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
        return v.visit(this,param);
    }
}
