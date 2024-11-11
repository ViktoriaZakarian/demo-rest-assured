package by.evropochta;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {

    @BeforeAll
    public static void setup() {
        RestAssured.registerParser("text/plain", Parser.JSON);
    }

    @Test
    public void testLoginAndPassword() {
        given()
                .body(LoginRequest.getBody("375251234567", "qazwsx"))
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .contentType("text/plain;charset=UTF-8")
                .log().all()
                .statusCode(200)
                .body("Table[0].Error", equalTo (50009))
                .body("Table[0].ErrorDescription", equalTo("Неверный логин или пароль"));
    }

    @Test
    public void testNoPassword() {
        given()
                .body(LoginRequest.getBody("375298888888", ""))
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .contentType("text/plain;charset=UTF-8")
                .log().all()
                .statusCode(200)
                .body("Table[0].Error", equalTo (50009))
                .body("Table[0].ErrorDescription", equalTo("Неверный логин или пароль"));
    }

    @Test
    public void testNoLogin() {
        given()
                .body(LoginRequest.getBody("", "zxcvbb"))
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .contentType("text/plain;charset=UTF-8")
                .log().all()
                .statusCode(200)
                .body("Table[0].Error", equalTo (50009))
                .body("Table[0].ErrorDescription", equalTo("Неверный логин или пароль"));
    }

    @Test
    public void testNoLoginNoPassword() {
        given()
                .body(LoginRequest.getBody())
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .contentType("text/plain;charset=UTF-8")
                .log().all()
                .statusCode(200)
                .body("Table[0].Error", equalTo (50009))
                .body("Table[0].ErrorDescription", equalTo("Неверный логин или пароль"));
    }
}
