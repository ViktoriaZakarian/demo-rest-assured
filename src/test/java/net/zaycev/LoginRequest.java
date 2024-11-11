package net.zaycev;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest {

    public static final String URL_LOGIN = "https://zaycev.net/api/external/auth/login";

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=UTF-8");
        return headers;
    }

    public static String getBody(String email, String password) {
        return "{\"emailOrLogin\":\"" + email + "\",\"password\":\"" + password + "\"}";
    }

    public static String getBody(String email) {
        return "{\"emailOrLogin\":\"" + email + "\"}";
    }

    public static String getBody() {
        return "";
    }
}
