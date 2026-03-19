package visitor;

import ast.Program;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.expressions.binaryOperations.Arithmetic;
import ast.expressions.binaryOperations.Comparison;
import ast.expressions.binaryOperations.Logic;
import ast.statements.*;
import ast.types.*;

public interface Visitor<PT,RT> {
    RT visit(Variable v,PT param);
    RT visit(Comparison c,PT param);
    RT visit(Arithmetic a,PT param);
    RT visit(Logic l,PT param);
    RT visit(ArrayAccess a,PT param);
    RT visit(Cast c,PT param);
    RT visit(CharLiteral c,PT param);
    RT visit(FieldAccess f,PT param);
    RT visit(IntLiteral i,PT param);
    RT visit(Invocation i,PT param);
    RT visit(NumberLiteral n,PT param);
    RT visit(UnaryMinus u,PT param);
    RT visit(UnaryNot u,PT param);
    RT visit(FunctionDefinition f, PT param);
    RT visit(VarDefinition v, PT param);
    RT visit(Assignment a, PT param);
    RT visit(IfElse i, PT param);
    RT visit(Input i, PT param);
    RT visit(Log l, PT param);
    RT visit(Return r, PT param);
    RT visit(While w,PT param);
    RT visit(ArrayType a, PT param);
    RT visit(CharType c , PT param);
    RT visit(DoubleType d,PT param);
    RT visit(ErrorType e, PT param);
    RT visit(FunctionType f, PT param);
    RT visit(IntType i, PT param);
    RT visit(RecordType r,PT param);
    RT visit(VoidType v,PT param);
    RT visit(Program p,PT param);
    RT visit(RecordField recordField, PT param);



}
