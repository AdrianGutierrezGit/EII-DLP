package ast.definitions;

import ast.statements.Statement;
import ast.types.Type;
import visitor.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition{

    private List<Statement> statements;
    private int totalBytes;
    public FunctionDefinition(int line, int column, String name, Type type, List<Statement> statements) {
        super(line, column, name, type);
        this.statements = statements;
    }

    public int getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(int totalBytes) {
        this.totalBytes = totalBytes;
    }

    public List<Statement> getStatements(){
        return statements;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public String toString() {
        return "FunctionDefinition{" +
                "statements=" + statements +
                '}';
    }
}
