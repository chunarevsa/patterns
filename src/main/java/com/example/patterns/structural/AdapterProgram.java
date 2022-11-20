package com.example.patterns.structural;

import com.example.patterns.Program;

public class AdapterProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("SingletonProgram is starting");

        DataBase dataBase = new AdapterJavaToDateBase();
        dataBase.select();
        dataBase.update();
        dataBase.insert();
        dataBase.delete();

        System.out.println("SingletonProgram is finishing \n");
    }

    public AdapterProgram() {
        startProgram();
    }
}
