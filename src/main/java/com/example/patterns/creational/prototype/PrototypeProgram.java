package com.example.patterns.creational.prototype;

import com.example.patterns.Program;

public class PrototypeProgram implements Program {

    @Override
    public void startProgram() {
        System.out.println("PrototypeProgram is starting");

        Project project = new Project(1, "newProject", "source");
        ProjectFactory factory = new ProjectFactory(project);
        Project clone = factory.cloneProject();
        System.out.println("master: " + project);
        System.out.println("clone: " + clone);

        System.out.println("PrototypeProgram is finishing \n");
    }

    public PrototypeProgram() {
        startProgram();
    }
}
