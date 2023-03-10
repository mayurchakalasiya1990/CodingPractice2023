package restassure.gpathtestcases;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import restassure.config.FootBallConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class GpathJsonTests extends FootBallConfig {

    @Test
    public void extractMapOfElementWithFind(){
        Response response=get("competitions/2021/teams");
        Map<String,?> allTeamDataForSingleTeam = response.path("teams.find{it.name == \'Manchester United FC\'}");
        System.out.println(allTeamDataForSingleTeam);
    }

    @Test
    public void extractSingleValueWithFind(){
        Response response=get("teams/57");
        String certainPlayerName = response.path("squad.find{it.id == 7784}.name");
        System.out.println("Player name is:"+certainPlayerName);
    }

    @Test
    public void extractListOfPlayerWithFindAll(){
        Response response=get("teams/57");
        List<String> listOfNames = response.path("squad.findAll {it.id >= 7784}.name");
        System.out.println("List of Player Names:"+listOfNames);
    }

    @Test
    public void extractSingleValueWithHighestId(){
        Response response=get("teams/57");
        String playerName = response.path("squad.max {it.id }.name");
        System.out.println("Player Names:"+playerName);
    }

    @Test
    public void extractSingleValueWithMinId(){
        Response response=get("teams/57");
        String playerName = response.path("squad.min {it.id }.name");
        System.out.println("Player Names:"+playerName);
    }
    @Test
    public void extractMultipleValueAndSum(){
        Response response=get("teams/57");
        int sumOfIds = response.path("squad.collect {it.id}.sum()");
        System.out.println("Player Names:"+sumOfIds);
    }

    @Test
    public void extractMapWithFindAndFindAllWithParameters(){
        String position = "Offence";
        String nationality = " England";
        Response response=get("teams/57");
        Map<String, ?> playerOfCertainPosition = response.path(
                "squad.findAll { it.position == '%s'}.find { it.nationality == '%s' }",
                position,nationality
        );
        System.out.println("Offence English Player:"+playerOfCertainPosition);
    }


    @Test
    public void extractMultiplePlayers() {

        String position = "Offence";
        String nationality = "England";

        Response response = get("teams/57");

        ArrayList<Map<String, ?>> allPlayerOfCertainPosition = response.path(
                "squad.findAll { it.position == '%s'}.findAll { it.nationality == '%s' }",
                position, nationality
        );

        System.out.println("Details of players: " + allPlayerOfCertainPosition);

    }
}
