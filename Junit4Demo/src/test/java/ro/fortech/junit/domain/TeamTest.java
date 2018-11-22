package ro.fortech.junit.domain;

import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TeamTest {

    private static Team team;
    private static Coach coach;
    private static List<Player> teamPlayers;

    private static final String TEAM_NAME = "Manchester City";
    private static final String COACH_NAME = "Guardiola";
    private static final int COACH_AGE = 43;
    private static final String COACH_REPUTATION = "GREAT";


    @BeforeClass
    public static void initializeTeam() {

        System.out.println("[Executed before all test methods]: Initialize team");
        coach = new Coach(COACH_NAME, COACH_AGE, COACH_REPUTATION);
        team = new Team(TEAM_NAME, coach);
        teamPlayers = new ArrayList<Player>();
    }

    @Before
    public void getPlayersList() {

        System.out.println("[Executed before each test method]: Get actual players list");
        teamPlayers = team.getPlayers();
        System.out.println("Actual players list is: " + teamPlayers);
    }

    @After
    public void updatePlayersList() {

        System.out.println("[Executed after each test method]: Get updated players list");
        teamPlayers = team.getPlayers();
        System.out.println("Updated players list: " + teamPlayers);
    }

    @Test
    public void getPlayers() {

        assertEquals(teamPlayers, team.getPlayers());
        System.out.println("Get players test");
    }

    @Test
    public void getCoach() {

        System.out.println("Coach test");
        assertEquals(coach, team.getCoach());
    }


    @Test
    public void addPlayer() {

        System.out.println("Add players test");
        Player player = new Player("De Bruyne", 25, 89);
        team.addPlayer(player);
        assertEquals(teamPlayers, team.getPlayers());
    }

    @Ignore
    @Test
    public void getTeamOverallQuality() {

        System.out.println("Not implemented yet");
    }

    @Test
    public void addPlayers() {

        List<Player> boughtPlayers = buyPlayers();
        team.addPlayers(boughtPlayers);
        assertEquals(teamPlayers, team.getPlayers());
        System.out.println("Add more players test");
    }

    private List<Player> buyPlayers() {

        Player player1 = new Player("Sane", 22, 85);
        Player player2 = new Player("Aguero", 30, 90);
        Player player3 = new Player("Gundogan", 29, 80);

        List<Player> boughtPlayers = new ArrayList<>();
        boughtPlayers.add(player1);
        boughtPlayers.add(player2);
        boughtPlayers.add(player3);

        return boughtPlayers;

    }
}