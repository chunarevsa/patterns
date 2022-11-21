package com.example.patterns.structural.facade;

public class WorkFlow {
    Job job = new Job();
    Developer developer = new Developer();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        developer.makeJob(bugTracker);
        bugTracker.finishSprint();
    }

    public void turnBugTracker() {
        bugTracker.startSprint();
    }

}
