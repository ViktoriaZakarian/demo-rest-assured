package ru.dtf;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LoginTest {

    @Test
    public void test1() {
        given()
                .body(ru.dtf.LoginRequest.getBody())
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(400);
    }

    @Test
    public void test2() {
        given()
                .formParams(LoginRequest.getFormData())
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(400);
    }
}
