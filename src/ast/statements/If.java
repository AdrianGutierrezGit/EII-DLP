package ast.statements;

import ast.expressions.Expression;

import java.util.List;

public class If extends AbstractStatement{
    private Expression condition;
    private List<Statement> ifStatements;
    private List<Statement> elseStatements;

    public If(int line, int column, Expression condition, List<Statement> ifStatements, List<Statement> elseStatements) {
        super(line, column);
        this.condition = condition;
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;
    }

    public Expression getCondition() {
        return condition;
    }
    public List<Statement> getIfStatements() {
        return ifStatements;
    }
    public List<Statement> getElseStatements() {
        return elseStatements;
    }
}
