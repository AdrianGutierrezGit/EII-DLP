package ast.types;

import ast.Locatable;
import visitor.Visitor;

import java.util.List;

public class RecordType extends AbstractType {
    private List<RecordField> fields;
    public RecordType(List<RecordField> fields) {
        this.fields = fields;
    }

    public List<RecordField> getFields(){
        return fields;
    }

    @Override
    public String toString() {
        return "Record";
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public Type dot(String field, Locatable locatable) {
        for(RecordField r: fields){
            if(r.getName().equals(field)){
                return r.getType();
            }
        }
        return new ErrorType("El record no contiene el campo '" + field + "'", locatable);
    }

    @Override
    public int numberOfBytes(){
        int totalBytes = 0;
        for(RecordField r: fields){
            totalBytes += r.getType().numberOfBytes();
        }
        return totalBytes;
    }
}
