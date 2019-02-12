package com.junitto.bdd;

import com.junitto.bdd.domain.Coach;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoachPolicy {

    private Coach coach;
    private int profile;

    @Given("^we have a football coach$")
    public void weHaveACoach(){

        coach = new Coach();
    }

    @When("^the coach profile is evaluated with (\\d+) and (.*)$")
    public void theCoachProfileIsEvaluatedWithAgeAndReputation(int age, String reputation){

        profile = coach.obtainCoachProfile(age, reputation);
    }

    @Then("^the profile of the coach should be (\\d+)$")
    public void theProfileOfTheCoachShouldBe(int points){

        assertEquals(profile, points);
    }

}
