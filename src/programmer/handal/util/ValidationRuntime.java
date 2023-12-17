package programmer.handal.util;

import programmer.handal.data.LoginRequest;
import programmer.handal.error.BlankException;

public class ValidationRuntime {
    public static void validation(LoginRequest loginRequest){
        if(loginRequest.username() == null){
            throw new BlankException("Username Tidak boleh null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username Tidak Boleh Kosong");
        } else if (loginRequest.password() == null){
            throw new BlankException("Passowrd Tidak Boleh null");
        }else if (loginRequest.password().isBlank()){
            throw new BlankException("Password tidak boleh kosong");
        }
    }
}
