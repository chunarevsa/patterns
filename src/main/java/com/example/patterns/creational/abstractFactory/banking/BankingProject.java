package com.example.patterns.creational.abstractFactory.banking;

import com.example.patterns.creational.abstractFactory.TeamFactory;
import com.example.patterns.creational.abstractFactory.dev.Developer;
import com.example.patterns.creational.abstractFactory.managers.ProjectManager;
import com.example.patterns.creational.abstractFactory.testers.Tester;

public class BankingProject {
    public void start() {
        TeamFactory teamFactory = new BankingTeamFactory();

        Developer dev = teamFactory.createDev();
        ProjectManager pm = teamFactory.createPM();
        Tester tester = teamFactory.createTester();

        System.out.println("Creating banking system");
        pm.manageProject();
        dev.writeCode();
        tester.testCode();
        System.out.println("completed");
    }

    public BankingProject() {
    }
}
