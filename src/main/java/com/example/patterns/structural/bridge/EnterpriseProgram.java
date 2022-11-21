package com.example.patterns.structural.bridge;

public abstract class EnterpriseProgram {
    protected Developer developer;

    protected EnterpriseProgram(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
