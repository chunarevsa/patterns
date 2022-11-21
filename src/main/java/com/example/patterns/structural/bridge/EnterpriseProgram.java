package com.example.patterns.structural.bridge;

import com.example.patterns.creational.factoryMethod.Developer;

public abstract class EnterpriseProgram {
    protected Developer developer;

    protected EnterpriseProgram(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
