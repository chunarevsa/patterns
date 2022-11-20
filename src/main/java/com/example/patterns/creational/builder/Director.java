package com.example.patterns.creational.builder;

public class Director {
    AWebsiteBuilder builder;

    Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        return builder.getWebsite();
    }

    public void setBuilder(AWebsiteBuilder builder) {
        this.builder = builder;
    }
}
