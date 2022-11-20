package com.example.patterns.creational.abstractFactory.banking;

import com.example.patterns.creational.abstractFactory.managers.ProjectManager;

public class BankingManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking manager manage project");
    }
}
