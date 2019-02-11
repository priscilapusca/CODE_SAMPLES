package com.cucumber.example;

import com.cucumber.example.airport.Passenger;
import com.cucumber.example.milage.Mileage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class BonusPolicy {

    private Passenger mike;
    private Mileage mileage;

    private Passenger john;

    @Given("^we have a usual passenger with a mileage$")
    public void weHaveAUsualPassengerWithAMileage() {

        mike = new Passenger("Mike", false);
        mileage = new Mileage();
    }

    @When("^the usual passenger travels (\\d+) and (\\d+) and (\\d+)$")
    public void theUsualPassengerTravelsMileageAndMileageAndMileage(int mileage1, int mileage2, int mileage3) {

        mileage.addMileage(mike, mileage1);
        mileage.addMileage(mike, mileage2);
        mileage.addMileage(mike, mileage3);
    }

    @Then("^the bonus points of the usual passenger should be (\\d++)$")
    public void theBonusPointsOfTheUsualPassengerShouldBePoints(int points) {

        mileage.calculateGivenPoints();
        assertEquals(points, mileage.getPassengerPointsMap().get(mike).intValue());
    }

    @Given("^we have a VIP passenger with a mileage$")
    public void weHaveAVIPPassengerWithAMileage() throws Throwable {

        john = new Passenger("John", true);
        mileage = new Mileage();
    }

    @When("^the VIP passenger travels (\\d+) and (\\d+) and (\\d+)$")
    public void theVIPPassengerTravelsAndAnd(int mileage1, int mileage2, int mileage3) throws Throwable {

        mileage.addMileage(john, mileage1);
        mileage.addMileage(john, mileage2);
        mileage.addMileage(john, mileage3);
    }

    @Then("^the bonus points of the VIP passenger should be (\\d+)$")
    public void theBonusPointsOfTheVIPPassengerShouldBe(int points) throws Throwable {

        mileage.calculateGivenPoints();
        assertEquals(points, mileage.getPassengerPointsMap().get(john).intValue());
    }
}
