package ast.types;

import ast.ASTNode;
import ast.Locatable;

import java.util.List;

public interface Type extends ASTNode {
    void mustBeLogical(Locatable locatable);
    Type arithmetic(Type other, Locatable locatable);
    //errorType tiene que sobreescribir todos los metodos devolviendose siempre a si mismo
    //mucho cuidado con no duplicar errores
    Type comparison(Type other,Locatable locatable);
    Type logical(Type other,Locatable locatable);
    Type arithmetic(Locatable locatable);
    void mustPromotes(Type other,Locatable locatable);
    void mustBeBuildIn(Locatable locatable);
    Type squareBrackets(Type other,Locatable locatable);
    Type dot(String field,Locatable locatable);
    Type parenthesis(List<Type> types, Locatable locatable);
    Type canBeCast(Type other, Locatable locatable);
    int numberOfBytes();
}
