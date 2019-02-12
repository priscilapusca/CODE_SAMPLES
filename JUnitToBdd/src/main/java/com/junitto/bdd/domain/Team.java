package com.junitto.bdd.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

    private static final int TEAM_SIZE = 18;
    private String name;
    private Coach coach;
    private List<Player> players;

    public Team(String name, Coach coach) {
        this.name = name;
        this.coach = coach;
        this.players = new ArrayList<>();
    }

    public static int getTeamSize() {
        return TEAM_SIZE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    public void addPlayer(Player player){

        if(players.size() < TEAM_SIZE) {
            players.add(player);
        }
    }

    public void addPlayers(List<Player> boughtPlayers){

        players.addAll(boughtPlayers);
    }

    public float getTeamOverallQuality(){

        return 0.0f;
    }
}
