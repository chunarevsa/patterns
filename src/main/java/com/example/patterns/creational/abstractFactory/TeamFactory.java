package com.example.patterns.creational.abstractFactory;

import com.example.patterns.creational.abstractFactory.dev.Developer;
import com.example.patterns.creational.abstractFactory.managers.ProjectManager;
import com.example.patterns.creational.abstractFactory.testers.Tester;

public interface TeamFactory {
    Developer createDev();
    Tester createTester();
    ProjectManager createPM();
}
