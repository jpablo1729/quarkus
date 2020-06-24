package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class AutoResourceTest {

    @Test
    public void testBmwColorEndpoint() {
        given()
          .when().get("/auto/bmwcolor")
          .then().statusCode(200);
    }

    @Test
    public void testMiniColorEndpoint() {
        given()
          .when().get("/auto/minicolor")
          .then().statusCode(200);
    }

    @Test
    public void testBlackColorEndpoint() {
        given()
          .when().get("/auto/black")
          .then().statusCode(200);
    }

    @Test
    public void testRedColorEndpoint() {
        given()
          .when().get("/auto/red")
          .then().statusCode(200);
    }
    
}