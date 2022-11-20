package com.example.patterns.creational.factoryMethod;

/** Проблема. Как не надо делать */
public class Problem {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.writeJavaCode();

        CppDeveloper cppDeveloper = new CppDeveloper();
        cppDeveloper.writeCppCode();
        // т.е для каждого придётся создавать классы
    }
}
class JavaDeveloper {
    void writeJavaCode() {
        System.out.println("Java Developer writes code");
    }
}
class CppDeveloper {
    void writeCppCode() {
        System.out.println("Cpp Developer writes code");
    }
}
