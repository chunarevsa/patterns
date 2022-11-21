package com.example.patterns.structural.bridge;

import com.example.patterns.creational.factoryMethod.Developer;

public class StockExchange extends EnterpriseProgram{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("StockExchange development in progress");
        developer.writeCode();
    }
}
