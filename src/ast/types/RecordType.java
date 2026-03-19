package ast.types;

import visitor.Visitor;

import java.util.List;

public class RecordType implements Type {
    private List<RecordField> fields;
    public RecordType(List<RecordField> fields) {
        this.fields = fields;
    }

    public List<RecordField> getFields(){
        return fields;
    }

    @Override
    public String toString() {
        return "RecordType{" +
                "fields=" + fields +
                '}';
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }
}
