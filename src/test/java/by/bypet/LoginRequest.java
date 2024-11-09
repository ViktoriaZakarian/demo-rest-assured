package by.bypet;

public class LoginRequest {
    public static final String URL_LOGIN = "https://bypet.by/auth/login";

    public static String getBody(String phoneStripped) {
        return "{\"phone_stripped\":\"" + phoneStripped + "\",\n" +
                "\"phone\":\"+375 (25) 111-11-11\",\n" +
                "\"password\":\"bsdvjfbdf\"}";
    }
}
