package com.example.patterns.structural.proxy;

import com.example.patterns.Program;

public class ProxyProgram implements Program {
    @Override
    public void startProgram() {
        System.out.println("ProxyProgram is starting");
        Project project = new ProxyProject("https://github.com/chunarevsa");
        project.run();

        Project project2 = new ProxyProject("https://github.com");
        //project2.run();

        System.out.println("ProxyProgram is finishing \n");
    }

    public ProxyProgram() {
        startProgram();
    }
}
