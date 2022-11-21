package com.example.patterns.structural.proxy;

public class RealProject implements Project{
    private final String url;

    public RealProject(String url) {
        this.url = url;
        loadProject();
    }

    void loadProject() {
        System.out.println("Load project form :" + url);
    }

    @Override
    public void run() {
        System.out.println("Run project from :" + url);
    }
}
