package com.example.patterns.structural.bridge;

import com.example.patterns.creational.factoryMethod.Developer;

public class BankSystem extends EnterpriseProgram {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("BankSystem development in progress");
        developer.writeCode();
    }
}
