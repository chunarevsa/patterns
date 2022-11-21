package com.example.patterns.structural.facade;

public class Developer {
    public void makeJob(BugTracker bugTracker) {
        if (bugTracker.isActive()) {
            System.out.println("Dev is solving problems. ");
        } else {
            System.out.println("Dev is watching Habr. ");
        }
    }
}
