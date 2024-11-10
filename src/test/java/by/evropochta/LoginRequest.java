package by.evropochta;

public class LoginRequest {

    public static final String URL_LOGIN = "https://evropochta.by/rest/Json?What=GetJWT";

    public static String getBody(String login, String password) {
        return "{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\",\"Data\":{\"LoginName\":\"" + login + "\",\"Password\":\"" + password + "\",\"LoginNameTypeId\":\"2\"}}}";
    }
}
