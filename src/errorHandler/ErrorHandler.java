package errorHandler;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private static ErrorHandler errorHandler = new ErrorHandler();
    private static List<ErrorType> errors = new ArrayList<>();

    private ErrorHandler(){

    }

    public static ErrorHandler getInstance(){
        return errorHandler;
    }

    public boolean anyError(){
        return !errors.isEmpty();
    }

    public void addError(ErrorType error){
        errors.add(error);
    }


    public void showErrors(PrintStream err) {
        for(ErrorType error: errors){
            err.println(error);
        }
    }
}
