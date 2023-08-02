package restassure.football;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import restassure.config.FootBallConfig;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class FootballTests extends FootBallConfig {


    @Test
    public void getDetailsOfOneArea(){
        given()
                .queryParam("area",2076)
        .when()
                .get("/areas")
        .then();
    }

    @Test
    public void getDetailsOfMultipleArea(){
        String areaIds = "2076,2077,2080";

        given()
                .queryParam("area",areaIds)
        .when()
                .get("/areas")
        .then();
    }

    @Test
    public void getDateFounded(){
        String areaIds = "2076,2077,2080";

        given()

                .when()
                .get("/teams/57")
                .then()
                .body("founded",equalTo(1886));
    }

    @Test
    public void getFirstTeamName(){
        String areaIds = "2076,2077,2080";

        given()
        .when()
                .get("/competitions/2021/teams")
        .then()
                .body("teams.name[0]",equalTo("Arsenal FC"));
    }

    @Test
    public void getAllTeamData(){
        String responseBody = get("teams/57").asString();
        System.out.println("Response Body:"+responseBody);
    }

    @Test
    public void getAllTeamData_VerifyFirst(){
        Response response=given()
                .when()
                .get("/teams/57")
                .then()
                .contentType(ContentType.JSON)
                .extract().response();

        String jsonResponseAsString = response.asString();
        System.out.println("jsonResponseAsString:"+jsonResponseAsString);

    }
    @Test
    public void extractHeaders(){
        Response response=given()
                .when()
                .get("/teams/57")
                .then()
                .extract()
                .response();

        String jsonResponseAsString = response.asString();
        System.out.println("Response Content Type:"+response.getContentType());
        System.out.println("X-API-Version:"+response.getHeader("X-API-Version"));
    }

    @Test
    public void extractFirstTeamName(){
        String firstName = get("competitions/2021/teams")
                .jsonPath().getString("teams.name[0]");
        System.out.println("First Team name:"+ firstName);
    }

    @Test
    public void extractAllTeamNames(){
        Response response = get("competitions/2021/teams")
                .then()
                .extract()
                .response();

        List<String> teamNames = response.path("teams.name");
        teamNames.stream().forEach(System.out::println);
    }
}
