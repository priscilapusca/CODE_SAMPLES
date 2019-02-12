package com.junitto.bdd.domain;

public class Player {

    private String name;
    private int age;
    private int overallQuality;

    public Player(String name, int age, int overallQuality) {
        this.name = name;
        this.age = age;
        this.overallQuality = overallQuality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOverallQuality() {
        return overallQuality;
    }

    public void setOverallQuality(int overallQuality) {
        this.overallQuality = overallQuality;
    }

    @Override
    public String toString() {

        return "Player " + name + " has an overall quality of " + overallQuality + " at the age of " + age;
    }
}