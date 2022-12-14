package com.example.patterns.creational.sigleton;

import com.example.patterns.Program;

public class SingletonProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("SingletonProgram is starting");
        ProgramLogger logger = ProgramLogger.getProgramLogger();
        logger.addLogInfo("First logInfo");
        logger.addLogInfo("Second logInfo");
        logger.addLogInfo("Third logInfo");
        logger.showLogFile();
        System.out.println("SingletonProgram is finishing \n");

    }

    public SingletonProgram() {
        startProgram();
    }
}
