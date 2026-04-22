package generator;

import ast.types.Type;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {
    private PrintWriter out;

    public CodeGenerator(String outputFilename, String sourceFilename) {
        try {
            this.out = new PrintWriter(new FileWriter(outputFilename));
            source(sourceFilename);
        } catch (IOException e) {
            System.err.println("Error abriendo el fichero de salida: " + e.getMessage());
        }
    }

    private void source(String sourceFilename) {
        out.println("#source \"" + sourceFilename + "\"\n");
    }

    public void line(int line) {
        out.println("\n#line\t" + line);
    }

    public void label(String id) {
        out.println("\n " + id + ":");
    }

    public void comment(String text) {
        out.println("\t' * " + text);
    }

    public void callMain() {
        out.println("\n' Invocation to the main function");
        out.println("call main");
    }

    public void halt() {
        out.println("halt");
    }

    public void enter(int bytes) {
        out.println("\tenter\t" + bytes);
    }

    public void ret(int returns, int locals, int params) {
        out.println("\tret\t" + returns + ", " + locals + ", " + params);
    }

    public void pusha(int offset) {
        out.println("\tpusha\t" + offset);
    }

    public void pushbp() {
        out.println("\tpush\tbp");
    }

    public void pushi(int value) {
        out.println("\tpushi\t" + value);
    }

    public void pushf(double value) {
        out.println("\tpushf\t" + value);
    }

    public void pushb(int value) {
        out.println("\tpushb\t" + value);
    }

    public void load(Type type) {
        out.println("\tload" + type.suffix());
    }

    public void store(Type type) {
        out.println("\tstore" + type.suffix());
    }

    public void out(Type type) {
        out.println("\tout" + type.suffix());
    }

    public void in(Type type) {
        out.println("\tin" + type.suffix());
    }

    public void add(Type type) { out.println("\tadd" + type.suffix()); }
    public void sub(Type type) { out.println("\tsub" + type.suffix()); }
    public void mul(Type type) { out.println("\tmul" + type.suffix()); }
    public void div(Type type) { out.println("\tdiv" + type.suffix()); }
    public void mod(Type type) { out.println("\tmod" + type.suffix()); }

    public void addi() { out.println("\taddi"); }

    public void gt(Type type) { out.println("\tgt" + type.suffix()); }
    public void lt(Type type) { out.println("\tlt" + type.suffix()); }
    public void ge(Type type) { out.println("\tge" + type.suffix()); }
    public void le(Type type) { out.println("\tle" + type.suffix()); }
    public void eq(Type type) { out.println("\teq" + type.suffix()); }
    public void ne(Type type) { out.println("\tne" + type.suffix()); }

    public void and() { out.println("\tand"); }
    public void or()  { out.println("\tor"); }
    public void not() { out.println("\tnot"); }


    public void convertTo(Type from, Type to) {
        if (from.suffix() == to.suffix()) {
            return;
        }

        if (from.suffix() == 'b' && to.suffix() == 'f') {
            out.println("\tb2i");
            out.println("\ti2f");
            return;
        }

        out.println("\t" + from.suffix() + "2" + to.suffix());
    }

    public Type promotedType(Type t1, Type t2) {
        if (t1.suffix() == 'f' || t2.suffix() == 'f') {
            return t1.suffix() == 'f' ? t1 : t2;
        }
        if (t1.suffix() == 'i' || t2.suffix() == 'i') {
            return t1.suffix() == 'i' ? t1 : t2;
        }
        return t1;
    }

    public void close() {
        if (out != null) {
            out.flush();
            out.close();
        }
    }
}