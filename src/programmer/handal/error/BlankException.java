package programmer.handal.error;

public class BlankException extends RuntimeException{
    public BlankException(String message){
        super(message);
    }
}
/*
! 34. Runtime Exception
? Jenis runtime Exception
* Secara garis besar exception dibagi menjadi 3 jenis:
    * Checked exception, yaitu exception yang wajib di try catch (no 33)
    * Runtime exception
    * error
? Runtime Exception
* Runtime exception adalah jenis exception yang tidak wajib di tangkap menggunakan try catch
* Kompiler java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil method yang bisa menyebabkan runtime exception
* Untuk membuat class runtime exception, kita wajib mengexteds class RuntimeException
* Ada banyak di java yang merupakan runtime exception, seperti NullPointerException, IllegalArgumentException, dsb
? lanjutan ada di ValidationRuntime dan ValidationApps

? 35 ada di DatabaseError

* */