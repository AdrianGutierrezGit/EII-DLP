package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;

import java.util.List;

public class VarDefinition extends AbstractDefinition implements Statement {

    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    @Override
    public String toString() {
        return "VarDefinition{}";
    }
}
