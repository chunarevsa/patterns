package com.example.patterns.creational.builder;

public class EnterpriseWebsiteBuilder extends AWebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
