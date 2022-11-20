package com.example.patterns.creational.sigleton;

public class ProgramLogger {
    public static ProgramLogger programLogger;
    public static String logFile = "This is log file. \n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public ProgramLogger() {
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }
    public void showLogFile() {
        System.out.println(logFile);
    }
}
