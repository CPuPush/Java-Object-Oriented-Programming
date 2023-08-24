package programmer.handal.data;

public class SocialMedia {
    String name;
    final void login(String username, String password){

    }
}
final class fb extends SocialMedia{
//    void login(String username, String password){
//        //error
//    }
}

//class fakefb extends fb{
//Error
//}

/*
!26. Final Class
* sebelumnya kita pernah mengguanakn kata kunci final di field class, untuk memberitahunkan bahwa field itu merupakan sesuatu yang fix
* final pun bisa digunakan pada class, dimana jika kita menggunakan kata kunci final sebelum class, maka kita menandakan bahwa class tersebut tidak bisa diwariskan lagi
* secara otomatis semua class childnya akan error.

! 27. Final Method
* kata kunci final bisa digunakan di Method
* jika sebuah method kita tambahkan kata kunci final, maka artinya method tersebut tidak bisa di override lagi di class chilnya
* ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi oleh class childnya

? 28 ada di inner Company

*/