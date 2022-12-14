import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TestPlace {
/*
This is a public api to get information about a zip code:  https://api.zippopotam.us/us/94105

For the above zip code, please verify that the place name is San Francisco. You can write your code in Python on Java.


*/
    @BeforeClass
    public void setUp()
    {
        baseURI = "https://api.zippopotam.us";
        basePath = "/us";
    }
    @Test
    public void testName(){
     String response =   given().get("/94105")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/place.json"))
                .extract().response().asString();
        JsonPath jsonPath = JsonPath.from(response);
        Country country = jsonPath.getObject("$", Country.class);
        assertThat(country.places.get(0).placeName).isEqualTo("San Francisco");

    }
}
