package com.example.patterns.structural.decorator;

public class DeveloperDecorator extends JavaDeveloper {
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
