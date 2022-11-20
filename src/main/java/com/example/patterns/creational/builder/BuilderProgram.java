package com.example.patterns.creational.builder;

import com.example.patterns.Program;

public class BuilderProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("BuilderProgram is starting");

        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        Website visitCardWebsite = director.buildWebsite();
        System.out.println(visitCardWebsite);

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website enterpriseWebsite = director.buildWebsite();
        System.out.println(enterpriseWebsite);

        System.out.println("BuilderProgram is finishing \n");

    }

    public BuilderProgram() {
        startProgram();
    }
}
