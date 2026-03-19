package ast.expressions;

import visitor.Visitor;

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
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public String toString() {
        return "FieldAccess{" +
                "field=" + field +
                ", fieldName='" + fieldName + '\'' +
                '}';
    }
}