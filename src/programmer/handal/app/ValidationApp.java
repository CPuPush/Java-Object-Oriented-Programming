package programmer.handal.app;

import programmer.handal.data.LoginRequest;
import programmer.handal.error.ValidationException;
import programmer.handal.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("",null);
        System.out.println(loginRequest);
//        ? ValidationUtil.validate(loginRequest); tidak bisa seenaknya dipanggil
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        }catch (ValidationException | NullPointerException exception){
            System.out.println("data tidak valid " + exception.getMessage());
        }
//        catch (NullPointerException exception){
//            System.out.println("data null " + exception.getMessage());
//        }
        finally {
            System.out.println("Akan selalu dieksekusi");
        }
    }
}
/*
? Try Catch
* Saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan try-catch expression di Java
* ini gunanya agar kita bisa menangkap exception yang terjadi, karena jika tidak ditangkap, lalu terjadi exception, maka secara otomatis program kita akan berhenti
* cara menggunakan try-catch expression di java sangat mudah, di block try, kita tinggal panggil method yang bisa menyebabkan exception, dan di block catch kita bisa melakukan sesuatu jika terjadi exception
* jika ingin ada 2 exeption

? Finally keyword
* Dalam try-catch kita bisa menambahkan block finally
* block finally ini adalah block dimana akan selalu di eksekusi baik terjadi exception ataupun tidak
* ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal di block try kita ingin membaca file, di block catch kita akan tangkap jika terjadi error dan di block finally error ataupun sukses membaca file, kita wajib menutup koneksi ke file tersebut biar tidak menggantung di memory
* */