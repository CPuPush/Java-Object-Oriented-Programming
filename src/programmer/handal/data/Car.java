package programmer.handal.data;

public interface Car extends HasBrand, IsMaintenance{
    void drive();
    int getTire();

    // default method
    default boolean isBig(){
        return false;
    };
}
/*
! 20. Interface
* Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class childnya
* Namun sebenarnya yang lebih tepat untuk kontrak adalah Interface
* Jangan salah sangka bahwa interface disini bukanlah User Interface
* Interface mirip seperti abstract class, yang membedakan adalah di interface, semua method otomatis abstract, tidak memiliki block
* Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah)
* Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements

* public abstract void drive(); tidak perlu di deklarasikan secara lengkap, karena defaultnya untuk interface sudah menggunakan public abstract.

? lanjutan ada di CarApp

! 21. Interface Inheritance
* Sebelumnya kita sudah tahu bahwa di java, child class hanya bisa punya 1 class parent
* Namun berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface
* Bahwa interface pun bisa implementasi interface lain. bisa lebih dari 1. Namun jika interface inting mewarisi interface lain, kita menggunakan kata kunci extends bukan implements
? lihat code pada HasBrand
* artinya sipapun yang menjadi class turunan dari Car, maka secara otomatis harus mendeklarasikan ulang yang ada di HasBrand

? Multiple Interface Inheritance
* multiple interface memungkinkan untuk extends interface lebih dari 1, contohnya
todo public interface Car extends HasBrand, IsMaintenance{}
todo public class Avanza implements Car, IsMaintenance{}
* Kita bisa memilih salah satu dari 2 cara untuk membuat multiple interface, tetapi untuk cara yang kedua memiliki perbedaan ketika pemanggilan pada object yang di instantiate. contohnya
todo ((Avanza) car).isMaintenance();

! 22. Default Method
* Sebelumnya kita tahu bahwa di interface, kita tidak bisa membuat method konkrit yang memiliki block method
* namun sejak versi Java 8, ada fitur default method di interface.
* Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang implement interface tersebut
* Ketika kita menambah satu method di interface, secara otomatits semua class yang implement akan rusak karena harus meng-override method tersebut
* dengan menggunakan default method, kita bisa menambahkan konkrit method di interface.

todo pada kode diatas, sebelumnya tidak ada default, sehingga seluruh class yang mengimplementasikan class tersebut akan rusak, dan mau tidak mau harus di override pada childnya, dan ketika ditambahkan default, maka kode tidak akan error lagi

? lanjutan bisa dilihat pada bus
* */