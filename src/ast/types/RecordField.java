package ast.types;

import ast.AbstractLocatable;

public class RecordField implements Type  {

    private String name;
    private Type type;
    public RecordField(String name, Type type) {
        this.name = name;
        this.type = type;
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
}
