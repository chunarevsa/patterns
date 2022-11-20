package com.example.patterns.creational.abstractFactory.website;

import com.example.patterns.creational.abstractFactory.TeamFactory;
import com.example.patterns.creational.abstractFactory.dev.Developer;
import com.example.patterns.creational.abstractFactory.dev.PythonDeveloper;
import com.example.patterns.creational.abstractFactory.managers.ProjectManager;
import com.example.patterns.creational.abstractFactory.testers.QATester;
import com.example.patterns.creational.abstractFactory.testers.Tester;

public class WebsiteTeamFactory implements TeamFactory {
    @Override
    public Developer createDev() {
        return new PythonDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProjectManager createPM() {
        return new WebsitePM();
    }
}
