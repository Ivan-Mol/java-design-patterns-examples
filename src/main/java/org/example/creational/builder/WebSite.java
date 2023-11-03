package org.example.creational.builder;

public class WebSite {
    private String name;
    private Enum CMS;
    private int cost;

    public void setName(String siteName) {
        this.name = siteName;
    }

    public void setCMS(Enum cms){
        this.CMS = cms;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", CMS='" + CMS + '\'' +
                ", cost=" + cost +
                '}';
    }
}
