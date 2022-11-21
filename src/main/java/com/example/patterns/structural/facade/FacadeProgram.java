package com.example.patterns.structural.facade;

import com.example.patterns.Program;

public class FacadeProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("FacadeProgram is starting");

        WorkFlow workFlow = new WorkFlow();
        workFlow.turnBugTracker();
        workFlow.solveProblems();

        System.out.println("===== bug tracker is off =====");
        workFlow.solveProblems();

        System.out.println("FacadeProgram is finishing \n");
    }

    public FacadeProgram() {
        startProgram();
    }
}
