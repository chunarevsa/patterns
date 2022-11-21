package com.example.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer {
    private final List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("Start development");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
