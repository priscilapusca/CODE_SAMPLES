package com.cucumber.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wallet {

    private float budget;
    private List<Shopping> shoppings = new ArrayList<Shopping>();

    Wallet(){}

    Wallet(float budget) {
        this.budget = budget;
        this.shoppings = new ArrayList<Shopping>();
    }

    float getBudget() {
        return budget;
    }

    void setBudget(float budget) {
        this.budget = budget;
    }

    public List<Shopping> getShoppings() {
        return Collections.unmodifiableList(shoppings);
    }

    public void setShoppings(List<Shopping> shoppings) {
        this.shoppings = shoppings;
    }

    void addShopping(Shopping shopping) {

        float newBudget = budget - shopping.getPrice();
        if (newBudget > 0) {
            shoppings.add(shopping);
            setBudget(newBudget);
        }
    }
}
