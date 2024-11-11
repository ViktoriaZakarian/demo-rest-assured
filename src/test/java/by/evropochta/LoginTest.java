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

    @Test
    public void testNoFieldLogin() {
        given()
                .body("{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\",\"Data\":{\"Password\":\"\",\"LoginNameTypeId\":\"2\"}}}")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .contentType("text/plain;charset=UTF-8")
                .log().all()
                .statusCode(200)
                .body("Table[0].Error", equalTo (0))
                .body("Table[0].ErrorDescription", equalTo("Неизвестно что"));
    }

    @Test
    public void testNoFieldPassword() {
        given()
                .body("{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\",\"Data\":{\"LoginName\":\"\",\"LoginNameTypeId\":\"2\"}}}")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .contentType("text/plain;charset=UTF-8")
                .log().all()
                .statusCode(200)
                .body("Table[0].Error", equalTo (0))
                .body("Table[0].ErrorDescription", equalTo("Неизвестно что"));
    }

    @Test
    public void testNoData() {
        given()
                .body("{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\"}}")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .contentType("text/plain;charset=UTF-8")
                .log().all()
                .statusCode(200)
                .body("Table[0].Error", equalTo (1002))
                .body("Table[0].ErrorDescription", equalTo("Ошибка Json"));
    }

    @Test
    public void testNoServiceNumber() {
        given()
                .body("{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"Data\":{\"LoginName\":\"\",\"Password\":\"\",\"LoginNameTypeId\":\"2\"}}}")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .contentType("text/plain;charset=UTF-8")
                .log().all()
                .statusCode(200)
                .body("Table[0].Error", equalTo (999999))
                .body("Table[0].ErrorDescription", equalTo("Неизвестная ошибка"));
    }

    @Test
    public void testNoPacket() {
        given()
                .body("{\"CRC\":\"\",\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\",\"Data\":{\"LoginName\":\"\",\"Password\":\"\",\"LoginNameTypeId\":\"2\"}}")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .contentType("text/plain;charset=UTF-8")
                .log().all()
                .statusCode(200)
                .body("Table[0].Error", equalTo (1002))
                .body("Table[0].ErrorDescription", equalTo("Ошибка Json"));
    }
}
