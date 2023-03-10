package restassure;

import org.junit.jupiter.api.Test;
import restassure.config.VideoGameConfig;
import restassure.config.VideoGameEndPoint;
import static io.restassured.RestAssured.*;
public class VideoGameTest extends VideoGameConfig {

    @Test
    public void getAllGames(){
        given().
                when()
                .get(VideoGameEndPoint.ALL_VIDEO_GAMES)
                .then();
    }
    @Test
    public void createNewGameJson(){
        String gameBodyJson = "{\n" +
                "  \"category\": \"Platform\",\n" +
                "  \"name\": \"Mario\",\n" +
                "  \"rating\": \"Mature\",\n" +
                "  \"releaseDate\": \"2012-05-04\",\n" +
                "  \"reviewScore\": 85\n" +
                "}\n" ;
        given()
            .body(gameBodyJson)
        .when()
             .post(VideoGameEndPoint.ALL_VIDEO_GAMES)
        .then();
    }

    @Test
    public void updateNewGameJson(){
        String gameBodyJson = "{\n" +
                "  \"category\": \"Platform\",\n" +
                "  \"name\": \"Mario\",\n" +
                "  \"rating\": \"Mature\",\n" +
                "  \"releaseDate\": \"2012-05-04\",\n" +
                "  \"reviewScore\": 85\n" +
                "}" ;
        given()

                .body(gameBodyJson)
                .pathParam("id",3)
                .when()
                .put(VideoGameEndPoint.VIDEOGAME_ID)
                .then();
    }

    @Test
    public void deleteNewGameJson(){

        given()
                .accept("text/plain")
                .pathParam("id","3")
        .when()
                .delete(VideoGameEndPoint.VIDEOGAME_ID)
        .then();
    }


}
