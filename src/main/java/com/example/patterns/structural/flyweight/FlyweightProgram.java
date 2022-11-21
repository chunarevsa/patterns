package com.example.patterns.structural.flyweight;

import com.example.patterns.Program;

import java.util.ArrayList;
import java.util.List;

public class FlyweightProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("FlyweightProgram is starting");

        DeveloperFactory factory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("java"));
        developers.add(factory.getDeveloperBySpeciality("cpp"));

        for (Developer dev : developers) {
            dev.writeCode();
        }
        System.out.println("FlyweightProgram is finishing \n");
    }

    public FlyweightProgram() {
        startProgram();
    }
}
