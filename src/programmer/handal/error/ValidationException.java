package programmer.handal.error;

public class ValidationException extends Throwable{
//    private String message;
//
//    // constructor
//    public ValidationException(String message){
//        this.message = message;
//    }
//    ? sudah ada methodnya tinggal override
//    public String getMessage(){
//        return this.message;
//    }
    public ValidationException(String message){
        super(message);
    }


    //getter
}
/*
! 33. Exception
* Saat kita membuat aplikasi, kita tidak akan terhindar dengan namanya error
* di java, error di representasikan dengan istilah exception dan semua direpresentasikan dalam bentuk class exception
* kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh Java
* Jika kita ingin membuat exception, maka kita harus membuat class yg extends class throwable atau turunan-turunannya

? lanjutan ada di ValidationUtil dan Validation App

? 34 ada di BlankException

* */
