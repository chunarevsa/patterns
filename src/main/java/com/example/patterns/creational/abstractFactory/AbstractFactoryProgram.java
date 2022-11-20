package com.example.patterns.creational.abstractFactory;

import com.example.patterns.creational.Program;
import com.example.patterns.creational.abstractFactory.banking.BankingProject;
import com.example.patterns.creational.abstractFactory.website.WebsiteProject;

public class AbstractFactoryProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("AbstractFactoryProgram is starting");
        BankingProject bankingProject = new BankingProject();
        bankingProject.start();

        WebsiteProject websiteProject = new WebsiteProject();
        websiteProject.start();
        System.out.println("AbstractFactoryProgram is finishing");
    }

    public AbstractFactoryProgram() {
        startProgram();
    }
}
