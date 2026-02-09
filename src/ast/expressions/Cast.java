package ast.expressions;

import ast.types.Type;

public class Cast extends AbstractExpression {
    private Type castType;
    private Expression expression;

    public Cast(int line, int column, Type castType, Expression expression) {
        super(line, column);
        this.castType = castType;
        this.expression = expression;
    }

    public Type getCastType() {
        return castType;
    }
    public Expression getExpression() {
        return expression;
    }
}