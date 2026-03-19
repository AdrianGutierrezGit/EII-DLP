package ast.expressions;

import ast.AbstractLocatable;
import visitor.Visitor;

public abstract class AbstractExpression extends AbstractLocatable implements Expression {

    private boolean lValue;
    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    public boolean isLValue() {
        return lValue;
    }

    public void setLValue(boolean LValue) {
        this.lValue = LValue;
    }


}
