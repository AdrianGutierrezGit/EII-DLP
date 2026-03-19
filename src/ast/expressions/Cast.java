package ast.expressions;

import ast.types.Type;
import visitor.Visitor;

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

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public String toString() {
        return "Cast{" +
                "castType=" + castType +
                ", expression=" + expression +
                '}';
    }
}