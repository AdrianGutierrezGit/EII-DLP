package ast.statements;

import ast.expressions.Expression;

public class Log extends AbstractStatement {

    private Expression expression;

    public Log(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}