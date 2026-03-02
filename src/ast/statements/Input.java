package ast.statements;

import ast.expressions.Expression;

public class Input extends AbstractStatement {

    private Expression expression;

    public Input(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Input{" +
                "expression=" + expression +
                '}';
    }
}
