package generator;

import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.RecordType;
import visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Boolean,Void> {
    private int totalGlobalBytes = 0;
    private int totalLocalBytes = 0;
    private int totalParametersBytes = 4;

    @Override
    public Void visit(VarDefinition v, Boolean param) {
        v.getType().accept(this,param);
        if(v.getScope() == 0){
            v.setOffset(totalGlobalBytes);
            totalGlobalBytes += v.getType().numberOfBytes();
        }else if (param){
            totalLocalBytes -= v.getType().numberOfBytes();
            v.setOffset(totalLocalBytes);
        }else if(!param){
            v.setOffset(totalParametersBytes);
            totalParametersBytes += v.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(RecordType r, Boolean param) {
        int totalFieldsBytes = 0;
        for (RecordField field : r.getFields()) {
            field.setOffset(totalFieldsBytes);
            field.getType().accept(this,param);
            totalFieldsBytes += field.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(FunctionType f, Boolean param){
        for(int i = f.getParameters().size() - 1;i>=0; i--){
            f.getParameters().get(i).accept(this,false);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition f, Boolean param){
        totalLocalBytes = 0;
        totalParametersBytes = 4;
        f.getType().accept(this,param);
        for(int i = 0; i < f.getStatements().size(); i++){
            f.getStatements().get(i).accept(this, true);
        }
        f.setTotalBytes(-totalLocalBytes);
        return null;
    }
}
