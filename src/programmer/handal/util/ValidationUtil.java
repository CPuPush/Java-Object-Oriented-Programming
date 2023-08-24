package programmer.handal.util;

import programmer.handal.data.LoginRequest;
import programmer.handal.data.ValidationException;

public class ValidationUtil {
    // static => sehingga class bisa langsung digunakan dan merefeer ke method yang dibuat
    public static void validate(LoginRequest loginRequest) throws ValidationException{
        if(loginRequest.username() == null){
            throw new ValidationException("Username tidak boleh null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username tidak boleh kosong");
        }else if(loginRequest.password()==null){
            throw new ValidationException("Password tidak boleh null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password tidak boleh kosong");
        }
    }
}
