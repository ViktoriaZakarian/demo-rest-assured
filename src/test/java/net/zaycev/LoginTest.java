package net.zaycev;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {

    @Test
    public void test1() {
        given()
                .headers(LoginRequest.getHeaders())
                .body(LoginRequest.getBody("qwert@gmail.com", "qwert"))
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(200)
                .body("error" , equalTo("wrong login or password"));
    }

    @Test
    public void testNoPassword() {
        given()
                .headers(LoginRequest.getHeaders())
                .body(LoginRequest.getBody("qwert@gmail.com", ""))
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(200)
                .body("error" , equalTo("wrong login or password"));
    }

    @Test
    public void testNoEmail() {
        given()
                .headers(LoginRequest.getHeaders())
                .body(LoginRequest.getBody("", "qwert"))
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(404)
                .body(equalTo("Not Found"));
    }

    @Test
    public void testNoEmailNoPassword() {
        given()
                .headers(LoginRequest.getHeaders())
                .body(LoginRequest.getBody("", ""))
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(404)
                .body(equalTo("Not Found"));
    }

    @Test
    public void testNoFieldPassword() {
        given()
                .headers(LoginRequest.getHeaders())
                .body(LoginRequest.getBody("test@gmail.com"))
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(404)
                .body(equalTo("Not Found"));
    }
}
