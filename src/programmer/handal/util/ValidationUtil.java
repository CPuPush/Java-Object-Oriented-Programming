package programmer.handal.util;

import programmer.handal.annotation.NotBlank;
import programmer.handal.data.LoginRequest;
import programmer.handal.error.BlankException;
import programmer.handal.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    // static => sehingga class bisa langsung digunakan dan merefeer ke method yang dibuat
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException("Username tidak boleh null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username tidak boleh kosong");
        }else if(loginRequest.password()==null){
            throw new NullPointerException("Password tidak boleh null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password tidak boleh kosong");
        }
    }


//    tidak perlu lagi melakukan validate secara manual jiga ada 100 field contohnya
    public static void validationReflection(Object object) { // artinya kelas apapun bisa di validasi
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields(); // memndapatkan semua fieldnya public and private

        for(var field : fields){
            field.setAccessible(true); // memaksa field bisa diaksses
            if(field.getAnnotations() != null){
//                validated
                try{
                    String value = (String) field.get(object); // arti (String) adalah mengkonfersi
                    if(value == null || value.isBlank()){
                        throw new BlankException("field " + field.getName() + " is blank");
                    }

                }catch (IllegalAccessException e){
                    System.out.println("Tidak bisa mengakses field" + field.getName());
                }
            }
        }
    }
}
/*
? Membuat exception
* exception biasanya terjadi dimethod, ketika kita membuat exception disebuah method, maka method tersebut harus ditandai dengna kata kunci throws diikuti dengan class exceptionnya
* jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambah lebih dari satu class exception
* didalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw diikuti dengan object exceptionnya

todo=> null pointer sudah ada kian bawaan java jadi tidak perlu lagi buat classnya. atau jika mau dibuat bisa juga
* */


/*
* Membuat validation baru untuk reflection dimana dapat memvalidasi field yang sangat banyak secara otomatis tidak seperti exception diatasnya
* */