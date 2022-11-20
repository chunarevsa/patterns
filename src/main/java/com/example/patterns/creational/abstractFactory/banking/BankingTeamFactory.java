package com.example.patterns.creational.abstractFactory.banking;

import com.example.patterns.creational.abstractFactory.*;
import com.example.patterns.creational.abstractFactory.dev.Developer;
import com.example.patterns.creational.abstractFactory.dev.JavaDeveloper;
import com.example.patterns.creational.abstractFactory.managers.ProjectManager;
import com.example.patterns.creational.abstractFactory.testers.QATester;
import com.example.patterns.creational.abstractFactory.testers.Tester;

public class BankingTeamFactory implements TeamFactory {

    @Override
    public Developer createDev() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProjectManager createPM() {
        return new BankingManager();
    }
}
