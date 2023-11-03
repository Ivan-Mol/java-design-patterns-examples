package org.example.creational.builder;

public class builderExample {
    public static void main(String[] args) {
        WebsiteBuilder websiteBuilder = new LandingBuilder();
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildPrice();
        websiteBuilder.buildCMS();

        WebSite landing = websiteBuilder.getWebSite();
        System.out.println(landing);
    }
}
