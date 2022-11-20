package com.example.patterns.creational.factoryMethod;

import com.example.patterns.creational.Program;

public class FactoryMethodProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("FactoryMethodProgram is starting");
        DeveloperFactory javaDeveloperFactory = new JavaDeveloperFactory();
        Developer javaDeveloper = javaDeveloperFactory.createDeveloper();
        javaDeveloper.writeCode();

        DeveloperFactory cppDeveloperFactory = new CppDeveloperFactory();
        Developer cppDeveloper = cppDeveloperFactory.createDeveloper();
        cppDeveloper.writeCode();
        System.out.println("FactoryMethodProgram is finishing \n");

    }

    public FactoryMethodProgram() {
        startProgram();
    }
}
