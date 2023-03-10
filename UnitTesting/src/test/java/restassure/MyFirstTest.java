package restassure;

import org.junit.jupiter.api.Test;
import restassure.config.VideoGameConfig;
import restassure.config.VideoGameEndPoint;

import static io.restassured.RestAssured.*;

public class MyFirstTest extends VideoGameConfig {


    @Test
    public void myFirstTest(){
        given()
                .log().all()
                .when()
                .get("/videogame")
                .then()
                .log().all();
    }

    /*
    Refactoring of End-point
    */
    @Test
    public void myFirstWithEndpoint(){
        get(VideoGameEndPoint.ALL_VIDEO_GAMES).then().log().all();
    }
}
