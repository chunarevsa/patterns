package com.example.patterns.structural.bridge;

import com.example.patterns.creational.factoryMethod.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Dev writes C++ code");
    }
}
