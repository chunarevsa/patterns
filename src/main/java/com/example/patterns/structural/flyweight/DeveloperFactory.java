package com.example.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private final static Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer dev = developers.get(speciality);

        if (dev == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring new Java Developer");
                    dev = new JavaDeveloper();
                    break;
                case "cpp":
                    System.out.println("Hiring new Cpp Developer");
                    dev = new CppDeveloper();
                    break;
            }
            developers.put(speciality, dev);

        }
        return dev;
    }
}
