package com.example.patterns.structural.bridge;

import com.example.patterns.Program;

public class BridgeProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("BridgeProgram is starting");

        System.out.println("============= First programs =============");
        EnterpriseProgram [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper()),
        };

        for (EnterpriseProgram enterpriseProgram : programs) {
            enterpriseProgram.developProgram();
        }
        System.out.println("============= Second programs =============");
        EnterpriseProgram [] programs2 = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper()),
        };

        for (EnterpriseProgram enterpriseProgram : programs2) {
            enterpriseProgram.developProgram();
        }

        System.out.println("BridgeProgram is finishing \n");
    }

    public BridgeProgram() {
        startProgram();
    }
}
