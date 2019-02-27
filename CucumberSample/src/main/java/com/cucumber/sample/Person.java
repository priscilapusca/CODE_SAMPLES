package com.cucumber.sample;

public class Person {

    private String name;
    private int age;
    private Wallet wallet;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Wallet wallet) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
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

    Wallet getWallet() {
        return wallet;
    }

    void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    void buyProduct(Shopping shopping) {

        wallet.addShopping(shopping);
    }
}
