package com.example.patterns.structural.decorator;

public class TeamLeadDev extends DeveloperDecorator {

    public TeamLeadDev(Developer developer) {
        super(developer);
    }

    public String makeReport() {
        return "Make report. \n";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeReport();
    }
}
