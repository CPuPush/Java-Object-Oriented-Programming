package programmer.handal.app;

import programmer.handal.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("OKTO", "MINIMAL");
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        System.out.println(new LoginRequest("test"));
        System.out.println(new LoginRequest("test", "pass"));
        System.out.println(new LoginRequest());
    }
}
