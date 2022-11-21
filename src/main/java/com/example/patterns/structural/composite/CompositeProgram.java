package com.example.patterns.structural.composite;

import com.example.patterns.Program;

public class CompositeProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("CompositeProgram is starting");

        Team team = new Team();
        Developer javaDev = new JavaDeveloper();
        Developer javaDev2 = new JavaDeveloper();
        Developer cppDev = new CppDeveloper();

        team.addDeveloper(javaDev);
        team.addDeveloper(javaDev2);
        team.addDeveloper(cppDev);

        team.createProject();
        System.out.println("CompositeProgram is finishing \n");
    }

    public CompositeProgram() {
        startProgram();
    }
}
