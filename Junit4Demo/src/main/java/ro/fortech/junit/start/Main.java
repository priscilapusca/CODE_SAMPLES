package ro.fortech.junit.start;

import ro.fortech.junit.domain.Coach;
import ro.fortech.junit.domain.Player;
import ro.fortech.junit.domain.Team;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Coach coach = new Coach("Guardiola", 43, "GREAT");
        Team team = new Team("Manchester City", coach);

        System.out.println("Players: " + team.getPlayers());
        Player player = new Player("De Bruyne", 25, 89);
        team.addPlayer(player);
        System.out.println("Players: " + team.getPlayers().toString());

    }
}
