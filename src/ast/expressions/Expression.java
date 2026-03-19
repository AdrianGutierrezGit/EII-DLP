package ast.expressions;

import ast.Locatable;

public interface Expression extends Locatable {
    boolean isLValue();
    void setLValue(boolean LValue);
}
