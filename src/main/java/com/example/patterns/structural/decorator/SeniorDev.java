package com.example.patterns.structural.decorator;

public class SeniorDev extends DeveloperDecorator {

    public SeniorDev(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Make code review. \n";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
