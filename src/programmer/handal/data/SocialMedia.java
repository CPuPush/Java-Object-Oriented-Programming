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

!28. Inner Class
* Di java, kita bisa membuat class didalam class, atau disebut dengan inner class
* salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yang saling terhubung dimana sebuah class tidak bisa dibuat tanpa class lain
* Misal kita perlu membuat class Employee, dimana membutuhkan class company, maka kita bisa membuat class employee sebagai inner class company
* cara membuat inner class, cukup membuatnya di dalam block class outer classnya

*/