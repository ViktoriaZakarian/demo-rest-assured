package by.evropochta;

public class LoginRequest {

    public static final String URL_LOGIN = "https://evropochta.by/rest/Json?What=GetJWT";

    public static String getBody(String login, String password) {
        return "{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\",\"Data\":{\"LoginName\":\"" + login + "\",\"Password\":\"" + password + "\",\"LoginNameTypeId\":\"2\"}}}";
    }

    public static String getBody() {
        return "{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\",\"Data\":{\"LoginName\":\"\",\"Password\":\"\",\"LoginNameTypeId\":\"2\"}}}";
    }

    public static String getBodyNoFieldLogin() {
        return "{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\",\"Data\":{\"Password\":\"\",\"LoginNameTypeId\":\"2\"}}}";
    }

    public static String getBodyNoFieldPassword() {
        return "{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\",\"Data\":{\"LoginName\":\"\",\"LoginNameTypeId\":\"2\"}}}";
    }

    public static String getBodyNoData() {
        return "{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\"}}";
    }

    public static String getBodyNoNumberService() {
        return "{\"CRC\":\"\",\"Packet\":{\"MethodName\":\"GetJWT\",\"JWT\":null,\"Data\":{\"LoginName\":\"\",\"Password\":\"\",\"LoginNameTypeId\":\"2\"}}}";
    }

    public static String getBodyNoPacket() {
        return "{\"CRC\":\"\",\"ServiceNumber\":\"E811AE79-DFDE-4F85-8715-DD3A8308707E\",\"Data\":{\"LoginName\":\"\",\"Password\":\"\",\"LoginNameTypeId\":\"2\"}}";
    }
}
