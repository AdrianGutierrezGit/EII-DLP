package ast.expressions;

public class FieldAccess extends AbstractExpression {

    private Expression field;
    private String fieldName;

    public FieldAccess(int line, int column, Expression field, String fieldName) {
        super(line, column);
        this.field = field;
        this.fieldName = fieldName;
    }

    public Expression getField() {
        return field;
    }
    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String toString() {
        return "FieldAccess{" +
                "field=" + field +
                ", fieldName='" + fieldName + '\'' +
                '}';
    }
}