package com.example.patterns.structural.decorator;

import com.example.patterns.Program;

public class DecoratorProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("DecoratorProgram is starting");

        Developer teamLeadDev = new TeamLeadDev(new SeniorDev(new JavaDeveloper()));
        System.out.println("TeamLeadDev make a job: \n" + teamLeadDev.makeJob());

        Developer seniorDev = new SeniorDev(new JavaDeveloper());
        System.out.println("SeniorDev make a job: \n" + seniorDev.makeJob());

        Developer dev = new JavaDeveloper();
        System.out.println("Dev make a job: \n" + dev.makeJob());

        System.out.println("DecoratorProgram is finishing \n");
    }

    public DecoratorProgram() {
        startProgram();
    }
}
