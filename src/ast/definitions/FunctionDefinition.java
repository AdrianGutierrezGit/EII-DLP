package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition{

    private List<Statement> statements;
    public FunctionDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);
    }

    public List<Statement> getStatements(){
        return statements;
    }
}
