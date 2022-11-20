package com.example.patterns.creational.builder;

public class VisitCardWebsiteBuilder extends AWebsiteBuilder {
    @Override
    void buildName() {
        website.setName("VisitCard");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(2000);
    }
}
