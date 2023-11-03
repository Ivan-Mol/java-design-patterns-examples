package org.example.creational.builder;

public abstract class WebsiteBuilder {
    protected WebSite webSite;

    public void createWebsite(){
        webSite = new WebSite();
    }

    abstract void buildName();
    abstract void buildCMS();
    abstract void buildPrice();

    public WebSite getWebSite(){
        return webSite;
    }
}
