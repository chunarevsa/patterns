package com.example.patterns.structural.adapter;

public class AdapterJavaToDateBase extends JavaProgram implements DataBase {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        reloadObject();
    }

    @Override
    public void select() {
        getObject();
    }

    @Override
    public void delete() {
        removeObject();
    }
}
