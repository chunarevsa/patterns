package com.example.patterns.structural.bridge;

import com.example.patterns.creational.factoryMethod.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Dev writes java code");
    }
}
