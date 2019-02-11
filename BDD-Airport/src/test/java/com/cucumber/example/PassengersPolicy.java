package com.cucumber.example;

import com.cucumber.example.airport.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengersPolicy {

    private Flight economyFlight;
    private Flight businessFlight;
    private Flight premiumFlight;
    private Passenger mike;
    private Passenger john;

    @Given("^there is an economy flight$")
    public void thereIsAnEconomyFlight() {

        economyFlight = new EconomyFlight("1");
    }

    @When("^we have a usual passenger$")
    public void weHaveAUsualPassenger() {

        mike = new Passenger("Mike", false);
    }

    @Then("^you can add and remove him from an economy flight$")
    public void youCanAddAndRemoveHimFromEconomyFlight() {

        assertAll("Verify all conditions for a usual passenger and a economy flight",
                () -> assertEquals("1", economyFlight.getId()),
                () -> assertTrue(economyFlight.addPassenger(mike)),
                () -> assertEquals(1, economyFlight.getPassengersSet().size()),
                () -> assertEquals("Mike", new ArrayList<>(economyFlight.getPassengersSet()).get(0).getName()),
                () -> assertTrue(economyFlight.removePassenger(mike)),
                () -> assertEquals(0, economyFlight.getPassengersSet().size())
        );
    }

    @When("^we have a VIP passenger$")
    public void weHaveAVIPPassenger() {

        john = new Passenger("John", true);
    }

    @Then("^you can add him but cannot remove him from an economy flight$")
    public void youCanAddHimButNotRemoveHimFromAnEconomyFlight() {

        assertAll("Verify all conditions for a VIP passenger and economy flight",
                () -> assertEquals("1", economyFlight.getId()),
                () -> assertTrue(economyFlight.addPassenger(john)),
                () -> assertEquals(1, economyFlight.getPassengersSet().size()),
                () -> assertEquals("John", new ArrayList<>(economyFlight.getPassengersSet()).get(0).getName()),
                () -> assertFalse(economyFlight.removePassenger(john)),
                () -> assertEquals(1, economyFlight.getPassengersSet().size())
        );
    }

    @Given("^there is a business flight$")
    public void thereIsABusinessFlight() {

        businessFlight = new BusinessFlight("2");
    }

    @Then("^you cannot add or remove him from a business flight$")
    public void youCannotAddOrRemoveHimFromABusinessFlight() {

        assertAll("Verify all conditions for a usual passenger and business flight",
                () -> assertEquals("2", businessFlight.getId()),
                () -> assertFalse(businessFlight.addPassenger(mike)),
                () -> assertEquals(0, businessFlight.getPassengersSet().size()),
                () -> assertFalse(businessFlight.removePassenger(mike)),
                () -> assertEquals(0, businessFlight.getPassengersSet().size())
        );
    }

    @Then("^you can add him but not remove him from a business flight")
    public void youCanAddHimButNotRemoveHimFromABusinessFlight() {

        assertAll("Verify all conditions for a VIP passenger and business flight",
                () -> assertEquals("2", businessFlight.getId()),
                () -> assertTrue(businessFlight.addPassenger(john)),
                () -> assertEquals(1, businessFlight.getPassengersSet().size()),
                () -> assertFalse(businessFlight.removePassenger(john)),
                () -> assertEquals(1, businessFlight.getPassengersSet().size())
        );
    }

    @Given("^there is a premium flight$")
    public void thereIsAPremiumFlight() {

        premiumFlight = new PremiumFlight("3");
    }

    @Then("^you cannot add him or remove him from a premium flight")
    public void youCannotAddHimOrRemoveHimFromAPremiumFlight() {

        assertAll("Verify all conditions for a usual passenger and a premium flight",
                () -> assertEquals("3", premiumFlight.getId()),
                () -> assertFalse(premiumFlight.addPassenger(mike)),
                () -> assertEquals(0, premiumFlight.getPassengersSet().size()),
                () -> assertFalse(premiumFlight.removePassenger(mike)),
                () -> assertEquals(0, premiumFlight.getPassengersSet().size())
        );
    }

    @Then("^you can add him or remove him from a premium flight")
    public void youCanAddHimOrRemoveHimFromAPremiumFlight() {

        assertAll("Verify all conditions for a VIP passenger and a premium flight",
                () -> assertEquals("3", premiumFlight.getId()),
                () -> assertTrue(premiumFlight.addPassenger(john)),
                () -> assertEquals(1, premiumFlight.getPassengersSet().size()),
                () -> assertTrue(premiumFlight.removePassenger(john)),
                () -> assertEquals(0, premiumFlight.getPassengersSet().size())
        );

    }

    @And("you cannot add a usual passenger to an economy flight more than once$")
    public void youCannotAddAUsualPassengerToAnEconomyFlightMoreThanOnce() {

        for (int i = 0; i < 10; i++) {
            economyFlight.addPassenger(mike);
        }

        assertAll("Verify a usual passenger cannot be added to an economy flight more than once",
                () -> assertEquals(1, economyFlight.getPassengersSet().size()),
                () -> assertTrue(economyFlight.getPassengersSet().contains(mike)),
                () -> Assert.assertEquals("Mike", new ArrayList<>(economyFlight.getPassengersSet()).get(0).getName())
        );
    }


    @And("^you cannot add a VIP passenger to an economy flight more than once$")
    public void youCannotAddAVIPPassengerToAnEconomyFlightMoreThanOnce() {

        for (int i = 0; i < 10; i++) {
            economyFlight.addPassenger(john);
        }

        assertAll("Verify a VIP passenger can be added to an economy flight only once",
                () -> assertEquals(1, economyFlight.getPassengersSet().size()),
                () -> assertTrue(economyFlight.getPassengersSet().contains(john)),
                () -> assertTrue(new ArrayList<>(economyFlight.getPassengersSet()).get(0).getName().equals("John"))
        );
    }

    @And("^you cannot add a VIP passenger to a business flight more than once$")
    public void youCannotAddAVIPPassengerToABusinessFlightMoreThanOnce() {

        for (int i = 0; i < 10; i++) {
            businessFlight.addPassenger(john);
        }

        assertAll("Verify a VIP passenger can be added to a business flight only once",
                () -> assertEquals(1, businessFlight.getPassengersSet().size()),
                () -> assertTrue(businessFlight.getPassengersSet().contains(john)),
                () -> Assert.assertEquals("John", new ArrayList<>(businessFlight.getPassengersSet()).get(0)
                        .getName())
        );
    }

    @And("^you cannot add a VIP passenger to a premium flight more than once$")
    public void youCannotAddAVIPPassengerToAPremiumFlightMoreThanOnce() {

        for (int i = 0; i < 10; i++) {
            premiumFlight.addPassenger(john);
        }

        assertAll("Verify a VIP passenger can be added to a premium flight only once",
                () -> assertEquals(1, premiumFlight.getPassengersSet().size()),
                () -> assertTrue(premiumFlight.getPassengersSet().contains(john)),
                () -> assertEquals("John", new ArrayList<>(premiumFlight.getPassengersSet()).get(0).getName())
        );

    }

}
