package com.example.patterns.creational.abstractFactory.website;

import com.example.patterns.creational.abstractFactory.Project;
import com.example.patterns.creational.abstractFactory.TeamFactory;
import com.example.patterns.creational.abstractFactory.dev.Developer;
import com.example.patterns.creational.abstractFactory.managers.ProjectManager;
import com.example.patterns.creational.abstractFactory.testers.Tester;

public class WebsiteProject implements Project {

    @Override
    public void start() {
        TeamFactory teamFactory = new WebsiteTeamFactory();
        Tester tester = teamFactory.createTester();
        Developer dev = teamFactory.createDev();
        ProjectManager pm = teamFactory.createPM();

        pm.manageProject();
        dev.writeCode();
        tester.testCode();
    }
}
