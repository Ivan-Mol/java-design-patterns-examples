package org.example.creational.builder;

public class LandingBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        webSite.setName("LandingPageName");
    }

    @Override
    void buildCMS() {
        webSite.setCMS(CMS.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setCost(200);
    }
}
