package com.example.patterns.creational.builder;

public abstract class AWebsiteBuilder {
    Website website;

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    public void createWebsite() {
        website = new Website();
    }

    public Website getWebsite() {
        return website;
    }
}
