package com.example.patterns.structural.facade;

public class BugTracker {
    boolean active = false;

    public boolean isActive() {
        return active;
    }

    void startSprint() {
        this.active = true;
    }

    void finishSprint() {
        this.active = false;
    }

}
