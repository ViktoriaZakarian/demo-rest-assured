package by.tabletka;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest {
    public static final String URL_LOGIN = "https://tabletka.by/ajax-request/login";

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        headers.put("Cookie", "regionId=0; PHPSESSID=crro1b1g4d75jb2oremnkdm2sa; _csrf=de36c71ffd7fbf2de0099393cf81a3b1064be8dd1fe635cc6849d4feca6dd9eaa%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22OrhhqrXj_xc7QAAHQ1il818jL02TMbrn%22%3B%7D; _ga=GA1.1.1242444986.1730997955; __gads=ID=2074a9e3a06bdbf0:T=1730997955:RT=1730997955:S=ALNI_MYG-UAozpYDBqDp_Fdw-vyzGj_Qmg; __gpi=UID=00000f79de3f930b:T=1730997955:RT=1730997955:S=ALNI_MYcsayFcpPPMb46kDfq9J11VUeZbA; __eoi=ID=d877df15ad091185:T=1730997955:RT=1730997955:S=AA-Afjb461C0SHteB8IFhbUu2Uo_; _ga_S6LL4MRH46=GS1.1.1730997955.1.1.1730997977.0.0.0; allow-cookies=");
        headers.put("X-Requested-With", "XMLHttpRequest");
        return headers;
    }

    public static String getBody() {
        return "_csrf=m4Ec4LaJY6zJSzN225Y98teJ6S2bHA1Hdnbwh5FjFSDU83SIx_s7xpYzUEGK13y6hriAQaMtNS06RsLT3AFnTg%3D%3D&email=&password=&rememberMe=on";
    }

    public static String getBody(String email, String password) {
        return "_csrf=m4Ec4LaJY6zJSzN225Y98teJ6S2bHA1Hdnbwh5FjFSDU83SIx_s7xpYzUEGK13y6hriAQaMtNS06RsLT3AFnTg%3D%3D&email=" + email+ "&password=" + password + "&rememberMe=on";
    }
}
