package com.cucumber.sample;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingSteps {

    private Person person;
    private Wallet wallet;

    @Given("^there is a person$")
    public void initializePersonAttributes(){

        person = new Person("Ionel", 45);
    }

    @When("^I want to assess a wallet to this person$")
    public void assessWalletToPerson(){

        wallet = new Wallet(400);
        person.setWallet(wallet);
    }

    @Then("^the person should have a new wallet$")
    public void checkPersonWallet(){

        assertEquals(person.getWallet(), wallet);
    }

    @Given("^the person has \"([^\"]*)\" in his wallet$")
    public void setPersonBudget(int budget){

        wallet.setBudget(budget);
        person.setWallet(wallet);
    }

    @When("^he wants to make a shopping with (\\d+) and (.*)")
    public void buyAProduct(int price, String name){

        Shopping shopping = new Shopping(name, price);
        person.buyProduct(shopping);
    }

    @Then("^he should have a new (\\d+) in wallet$")
    public void checkNewBudget(int budget){

        assertEquals(person.getWallet().getBudget(),budget);
    }

    @Given("^person has not bought any products yet")
    public void initializePersonShoppingList(){

        wallet.setShoppings(new ArrayList<Shopping>());
        person.setWallet(wallet);
    }

    @When("^he buys two products$")
    public void personBuysProducts(){

        person.buyProduct(new Shopping("milk", 10));
        person.buyProduct(new Shopping("water", 15));

    }

    @Then("^the shopping list should be updated$")
    public void checkSizeOfShoppingList(){

        assertEquals(person.getWallet().getShoppings().size(), 2);
    }
}
