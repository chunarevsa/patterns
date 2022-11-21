package com.example.patterns.structural.bridge;

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
