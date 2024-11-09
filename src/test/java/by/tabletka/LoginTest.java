package by.tabletka;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    @Test
    public void test1() {
        given()
                .body(LoginRequest.getBody())
                .headers(LoginRequest.getHeaders())
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo(-1))
                .body("log", equalTo("Не найден пользователь или неправильный пароль."));
    }

    @Test
    public void test2() {
        String bodyRequest = "_csrf=m4Ec4LaJY6zJSzN225Y98teJ6S2bHA1Hdnbwh5FjFSDU83SIx_s7xpYzUEGK13y6hriAQaMtNS06RsLT3AFnTg%3D%3D&password=&rememberMe=on";

        given()
                .body(bodyRequest)
                .headers(LoginRequest.getHeaders())
        .when()
                .post(LoginRequest.URL_LOGIN)
        .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo(-1))
                .body("log", equalTo("Не найден пользователь или неправильный пароль."));
    }

    @Test
    public void test3() {
        String bodyRequest = "_csrf=m4Ec4LaJY6zJSzN225Y98teJ6S2bHA1Hdnbwh5FjFSDU83SIx_s7xpYzUEGK13y6hriAQaMtNS06RsLT3AFnTg%3D%3D&email=&rememberMe=on";

        given()
                .body(bodyRequest)
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .header("Cookie", "regionId=0; PHPSESSID=crro1b1g4d75jb2oremnkdm2sa; _csrf=de36c71ffd7fbf2de0099393cf81a3b1064be8dd1fe635cc6849d4feca6dd9eaa%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22OrhhqrXj_xc7QAAHQ1il818jL02TMbrn%22%3B%7D; _ga=GA1.1.1242444986.1730997955; __gads=ID=2074a9e3a06bdbf0:T=1730997955:RT=1730997955:S=ALNI_MYG-UAozpYDBqDp_Fdw-vyzGj_Qmg; __gpi=UID=00000f79de3f930b:T=1730997955:RT=1730997955:S=ALNI_MYcsayFcpPPMb46kDfq9J11VUeZbA; __eoi=ID=d877df15ad091185:T=1730997955:RT=1730997955:S=AA-Afjb461C0SHteB8IFhbUu2Uo_; _ga_S6LL4MRH46=GS1.1.1730997955.1.1.1730997977.0.0.0; allow-cookies=")
                .header("X-Requested-With", "XMLHttpRequest")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo(-1))
                .body("log", equalTo("Не найден пользователь или неправильный пароль."));
    }

    @Test
    public void test4() {
        String bodyRequest = "_csrf=m4Ec4LaJY6zJSzN225Y98teJ6S2bHA1Hdnbwh5FjFSDU83SIx_s7xpYzUEGK13y6hriAQaMtNS06RsLT3AFnTg%3D%3D&rememberMe=on";

        given()
                .body(bodyRequest)
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .header("Cookie", "regionId=0; PHPSESSID=crro1b1g4d75jb2oremnkdm2sa; _csrf=de36c71ffd7fbf2de0099393cf81a3b1064be8dd1fe635cc6849d4feca6dd9eaa%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22OrhhqrXj_xc7QAAHQ1il818jL02TMbrn%22%3B%7D; _ga=GA1.1.1242444986.1730997955; __gads=ID=2074a9e3a06bdbf0:T=1730997955:RT=1730997955:S=ALNI_MYG-UAozpYDBqDp_Fdw-vyzGj_Qmg; __gpi=UID=00000f79de3f930b:T=1730997955:RT=1730997955:S=ALNI_MYcsayFcpPPMb46kDfq9J11VUeZbA; __eoi=ID=d877df15ad091185:T=1730997955:RT=1730997955:S=AA-Afjb461C0SHteB8IFhbUu2Uo_; _ga_S6LL4MRH46=GS1.1.1730997955.1.1.1730997977.0.0.0; allow-cookies=")
                .header("X-Requested-With", "XMLHttpRequest")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo(-1))
                .body("log", equalTo("Не найден пользователь или неправильный пароль."));
    }

    @Test
    public void test5() {
        String bodyRequest = "email=&password=&rememberMe=on";

        given()
                .body(bodyRequest)
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .header("Cookie", "regionId=0; PHPSESSID=crro1b1g4d75jb2oremnkdm2sa; _csrf=de36c71ffd7fbf2de0099393cf81a3b1064be8dd1fe635cc6849d4feca6dd9eaa%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22OrhhqrXj_xc7QAAHQ1il818jL02TMbrn%22%3B%7D; _ga=GA1.1.1242444986.1730997955; __gads=ID=2074a9e3a06bdbf0:T=1730997955:RT=1730997955:S=ALNI_MYG-UAozpYDBqDp_Fdw-vyzGj_Qmg; __gpi=UID=00000f79de3f930b:T=1730997955:RT=1730997955:S=ALNI_MYcsayFcpPPMb46kDfq9J11VUeZbA; __eoi=ID=d877df15ad091185:T=1730997955:RT=1730997955:S=AA-Afjb461C0SHteB8IFhbUu2Uo_; _ga_S6LL4MRH46=GS1.1.1730997955.1.1.1730997977.0.0.0; allow-cookies=")
                .header("X-Requested-With", "XMLHttpRequest")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(400)
                .body(equalTo("Bad Request (#400): Unable to verify your data submission."));
    }

    @Test
    public void test6() {
        String bodyRequest = "_csrf=m4Ec4LaJY6zJSzN225Y98teJ6S2bHA1Hdnbwh5FjFSDU83SIx_s7xpYzUEGK13y6hriAQaMtNS06RsLT3AFnTg%3D%3D&email=&password=&rememberMe=on";

        given()
                .body(bodyRequest)
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .header("Cookie", "regionId=0; PHPSESSID=crro1b1g4d75jb2oremnkdm2sa; _csrf=de36c71ffd7fbf2de0099393cf81a3b1064be8dd1fe635cc6849d4feca6dd9eaa%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22OrhhqrXj_xc7QAAHQ1il818jL02TMbrn%22%3B%7D; _ga=GA1.1.1242444986.1730997955; __gads=ID=2074a9e3a06bdbf0:T=1730997955:RT=1730997955:S=ALNI_MYG-UAozpYDBqDp_Fdw-vyzGj_Qmg; __gpi=UID=00000f79de3f930b:T=1730997955:RT=1730997955:S=ALNI_MYcsayFcpPPMb46kDfq9J11VUeZbA; __eoi=ID=d877df15ad091185:T=1730997955:RT=1730997955:S=AA-Afjb461C0SHteB8IFhbUu2Uo_; _ga_S6LL4MRH46=GS1.1.1730997955.1.1.1730997977.0.0.0; allow-cookies=")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(200)
                .body("status", equalTo(-1));
    }

    @Test
    public void test7() {
        String bodyRequest = "_csrf=m4Ec4LaJY6zJSzN225Y98teJ6S2bHA1Hdnbwh5FjFSDU83SIx_s7xpYzUEGK13y6hriAQaMtNS06RsLT3AFnTg%3D%3D&email=&password=&rememberMe=on";

        given()
                .body(bodyRequest)
                .header("Cookie", "regionId=0; PHPSESSID=crro1b1g4d75jb2oremnkdm2sa; _csrf=de36c71ffd7fbf2de0099393cf81a3b1064be8dd1fe635cc6849d4feca6dd9eaa%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22OrhhqrXj_xc7QAAHQ1il818jL02TMbrn%22%3B%7D; _ga=GA1.1.1242444986.1730997955; __gads=ID=2074a9e3a06bdbf0:T=1730997955:RT=1730997955:S=ALNI_MYG-UAozpYDBqDp_Fdw-vyzGj_Qmg; __gpi=UID=00000f79de3f930b:T=1730997955:RT=1730997955:S=ALNI_MYcsayFcpPPMb46kDfq9J11VUeZbA; __eoi=ID=d877df15ad091185:T=1730997955:RT=1730997955:S=AA-Afjb461C0SHteB8IFhbUu2Uo_; _ga_S6LL4MRH46=GS1.1.1730997955.1.1.1730997977.0.0.0; allow-cookies=")
                .header("X-Requested-With", "XMLHttpRequest")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(400)
                .body(equalTo("Bad Request (#400): Unable to verify your data submission."));
    }

    @Test
    public void test8() {
        String bodyRequest = "_csrf=m4Ec4LaJY6zJSzN225Y98teJ6S2bHA1Hdnbwh5FjFSDU83SIx_s7xpYzUEGK13y6hriAQaMtNS06RsLT3AFnTg%3D%3D&email=&password=&rememberMe=on";

        given()
                .body(bodyRequest)
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .header("X-Requested-With", "XMLHttpRequest")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(400)
                .body(equalTo("Bad Request (#400): Unable to verify your data submission."));
    }

    @Test
    public void test9() {
        String bodyRequest = "";

        given()
                .body(bodyRequest)
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .header("Cookie", "regionId=0; PHPSESSID=crro1b1g4d75jb2oremnkdm2sa; _csrf=de36c71ffd7fbf2de0099393cf81a3b1064be8dd1fe635cc6849d4feca6dd9eaa%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22OrhhqrXj_xc7QAAHQ1il818jL02TMbrn%22%3B%7D; _ga=GA1.1.1242444986.1730997955; __gads=ID=2074a9e3a06bdbf0:T=1730997955:RT=1730997955:S=ALNI_MYG-UAozpYDBqDp_Fdw-vyzGj_Qmg; __gpi=UID=00000f79de3f930b:T=1730997955:RT=1730997955:S=ALNI_MYcsayFcpPPMb46kDfq9J11VUeZbA; __eoi=ID=d877df15ad091185:T=1730997955:RT=1730997955:S=AA-Afjb461C0SHteB8IFhbUu2Uo_; _ga_S6LL4MRH46=GS1.1.1730997955.1.1.1730997977.0.0.0; allow-cookies=")
                .header("X-Requested-With", "XMLHttpRequest")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(400)
                .body(equalTo("Bad Request (#400): Unable to verify your data submission."));
    }

    @Test
    public void test10() {
        String bodyRequest = "_csrf=m4Ec4LaJY6zJSzN225Y98teJ6S2bHA1Hdnbwh5FjFSDU83SIx_s7xpYzUEGK13y6hriAQaMtNS06RsLT3AFnTg%3D%3D&email=&password=&rememberMe=on";

        given()
                .body(bodyRequest)
                .header("X-Requested-With", "XMLHttpRequest")
                .when()
                .post(LoginRequest.URL_LOGIN)
                .then()
                .log().all()
                .statusCode(400)
                .body(equalTo("Bad Request (#400): Unable to verify your data submission."));
    }
}
