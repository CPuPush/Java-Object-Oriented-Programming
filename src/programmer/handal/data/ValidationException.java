package programmer.handal.data;

public class ValidationException extends Throwable{
    private String message;

    // constructor
    public ValidationException(String message){
        this.message = message;
    }

    //getter
    public String getMessage(){
        return this.message;
    }
}
/*
! 33. Exception
* Saat kita membuat aplikasi, kita tidak akan terhindar dengan namanya error
* di java, error di representasikan dengan istilah exception dan semua direpresentasikan dalam bentuk class exception
* kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh Java
* Jika kita ingin membuat exception, maka kita harus membuat class yg extends class throwable atau turunan-turunannya
?Membuat exception
* exception biasanya terjadi dimethod, ketika kita membuat exception disebuah method, maka method tersebut harus ditandai dengna kata kunci thrown diikuti dengan class exceptionnya
* jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambah lebih dari satu class exception
* didalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw diikuti dengan object exceptionnya

? Try Catch
* Saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan try-catch expression di Java
* ini gunanya agar kita bisa menangkap exception yang terjadi, karena jika tidak ditangkap, lalu terjadi exception, maka secara otomatis program kita akan berhenti
* cara menggunakan try-catch expression di java sangat mudah, di block try, kita tinggal panggil method yang bisa menyebabkan exception, dan di block catch kita bisa melakukan sesuatu jika terjadi exception

? Finally keyword
* Dalam try-catch kita bisa menambahkan block finally
* block finally ini adalah block dimana akan selalu di eksekusi baik terjadi exception ataupun tidak
* ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal di block try kita ingin membaca file, di block catch kita akan tangkap jika terjadi error dan di block finally error ataupun sukses membaca file, kita wajib menutup koneksi ke file tersebut biar tidak menggantung di memory
* */