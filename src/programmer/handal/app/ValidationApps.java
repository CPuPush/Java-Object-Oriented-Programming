package programmer.handal.app;

import programmer.handal.data.LoginRequest;
import programmer.handal.util.ValidationRuntime;

public class ValidationApps {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("t", "t");
        ValidationRuntime.validation(loginRequest);
    }
}
/*
? Perlu Diperhatikan
* walaupun runtime exception tidak wajib di try catch, tapi ada baiknya kita tetap melakukan try-catch
* karena jika terjadi runtime exception, yang ditakutkan adalah program kita berhenti
* */