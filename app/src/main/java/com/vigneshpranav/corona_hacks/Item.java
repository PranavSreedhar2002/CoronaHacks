package com.vigneshpranav.corona_hacks;

public class Item {

    private int level;
    private String name;
    private String subject;
    private String date;
    private String cost;

    public Item(int level, String name, String subject, String date, double cost) {
        this.level = level;
        this.name = name;
        this.subject = subject;
        this.date = date;
        this.cost = (cost == 0.00) ? ("Free") : ("$" + cost);
    }
    public Item(int level, String name, String subject, String date, String cost) {
        this.level = level;
        this.name = name;
        this.subject = subject;
        this.date = date;
        this.cost = cost;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
