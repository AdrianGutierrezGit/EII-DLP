package generator;

import ast.Program;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.expressions.binaryOperations.Arithmetic;
import ast.expressions.binaryOperations.Comparison;
import ast.expressions.binaryOperations.Logic;
import ast.statements.*;
import ast.types.*;
import visitor.Visitor;

public class AbstractCGVisitor<PT,RT> implements Visitor<PT,RT> {
    @Override
    public RT visit(Variable v, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(Comparison c, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(Arithmetic a, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(Logic l, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(ArrayAccess a, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(Cast c, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(CharLiteral c, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(FieldAccess f, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(IntLiteral i, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(Invocation i, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(NumberLiteral n, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(UnaryMinus u, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(UnaryNot u, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(FunctionDefinition f, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(VarDefinition v, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(Assignment a, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(IfElse i, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(Input i, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(Log l, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(Return r, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(While w, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(ArrayType a, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(CharType c, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(DoubleType d, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(ErrorType e, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(FunctionType f, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(IntType i, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(RecordType r, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(VoidType v, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(Program p, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }

    @Override
    public RT visit(RecordField recordField, PT param) {
        throw new UnsupportedOperationException("La plantilla realizada no es la adecuada");
    }
}
