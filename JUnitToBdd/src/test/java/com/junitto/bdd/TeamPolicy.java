package com.junitto.bdd;

import com.junitto.bdd.domain.Coach;
import com.junitto.bdd.domain.Player;
import com.junitto.bdd.domain.Team;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamPolicy {

    private Team team;
    private Coach coach;
    private List<Player> players;
    private int actualTeamSize;

    private static final String TEAM_NAME = "Manchester City";
    private static final String COACH_NAME = "Guardiola";
    private static final int COACH_AGE = 43;
    private static final String COACH_REPUTATION = "GREAT";

    @Given("^there is a team$")
    public void thereIsATeam(){

        team = new Team(TEAM_NAME, null);
    }

    @When("^there is a coach without team$")
    public void thereIsACoachWithoutTeam(){

        coach = new Coach(COACH_NAME, COACH_AGE, COACH_REPUTATION);
    }

    @Then("^we can assign the coach to our team$")
    public void weCanAssignTheCoachToOurTeam(){

        team.setCoach(coach);
        assertEquals(coach, team.getCoach());
    }

    @When("^we have an empty players list assigned to the team$")
    public void weHaveAnEmptyPlayersListAssignedToTheTeam(){

        players = new ArrayList<>();
        actualTeamSize = 0;

    }

    @Then("^the team should have no players$")
    public void theTeamShouldHaveNoPlayers(){

        assertEquals(players, team.getPlayers());
    }

    @When("^we add a player to the team$")
    public void weAddAPlayerToTheTeam(){

        Player player = new Player("De Bruyne", 25, 89);
        team.addPlayer(player);
    }

    @Then("^the team size should increase")
    public void theTeamSizeShouldIncrease(){

        assertEquals(actualTeamSize + 1, team.getPlayers().size());
    }

    @When("^we add more players to the team$")
    public void addMorePlayersToTheTeam(){

        Player player1 = new Player("Sane", 22, 85);
        Player player2 = new Player("Aguero", 30, 90);
        Player player3 = new Player("Gundogan", 29, 80);
        List<Player> boughtPlayers = Arrays.asList(player1, player2, player3);
        team.addPlayers(boughtPlayers);
    }

    @Then("^the team should contain them")
    public void theTeamShouldContainThem(){

        assertAll("Verify the players were added to the team",
                () -> assertEquals("Sane", team.getPlayers().get(0).getName()),
                () -> assertEquals("Aguero", team.getPlayers().get(1).getName()),
                () -> assertEquals("Gundogan", team.getPlayers().get(2).getName())
                );
    }
}
