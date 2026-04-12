package ast.expressions;

import ast.Locatable;
import ast.types.Type;

public interface Expression extends Locatable {
    boolean isLValue();
    void setLValue(boolean LValue);
    Type getType();
    void setType(Type type);
}
