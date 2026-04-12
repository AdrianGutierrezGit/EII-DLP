package ast.expressions;

import ast.AbstractLocatable;
import ast.types.Type;
import visitor.Visitor;

public abstract class AbstractExpression extends AbstractLocatable implements Expression {

    private boolean lValue;
    private Type type;
    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    public boolean isLValue() {
        return lValue;
    }

    public void setLValue(boolean LValue) {
        this.lValue = LValue;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }
}
