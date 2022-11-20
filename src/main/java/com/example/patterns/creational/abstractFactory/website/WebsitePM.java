package com.example.patterns.creational.abstractFactory.website;

import com.example.patterns.creational.abstractFactory.managers.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manage project");
    }
}
