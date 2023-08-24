package programmer.handal.data;

public record LoginRequest(String username, String password) {
    // constructor tanpa tanda ()
    public LoginRequest{
        System.out.println("Constructor utama dipanggil");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("","");
    }

    public void sayHello(){
        System.out.println("hai dunia");
    }

}
/*
! 31. Record Class
? Java 14 - Experimental
* Fitur ini masih versi preview dan belum stabil di versi Java 14, namun kita sudah bisa mencobanya
* Tapi perlu diingat bahwa fitur ini masih experimental, artinya tidak ada jaminan di versi java mendatang, fitur ini akan tetap ada, bisa saja dihilangkan.
? Record Class
* kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter, equals, hashCode, dan toString method
* Record class digunakan untuk mempermudah pembuatan jenis class tersebut
* Saat kita membuat record class, secara otomatis java akan membuatkan getter, equals, hashCode dan toString method secara otomatis, dan juga constructor secara otomatis
* Saat membuat record class, secara otomatis kita akan meng-extends class java.lang.Record, yang artinya kita tidak bisa extends class lain. Namun kita tetap bisa meng-implement interface.
? Record Class Constructor
* Secara default, constructor di record class akan dibuat secara otomatis, sesuai dengan definisi record class parameter
* namun jika kita ingin melakukan sesuatu di constructor tersebutm kita bisa membuat compact constructor, yaitu constructor tanpa tanda()
* selain itu, kita juga bisa melakukan constructor overloading, namun ada syaratnya, yaitu constroctor overloading nya harus tetap memanggil constructor utama yang secara otomatis dibuatkan di record class.
* constructor utama akan selalu dipanggil.
* bisa menambahkan method di Record
todo tidak bisa extend di record dan bisa implement class abstact atau interface lain.
* jadi dikhususkan buat nyimpen data dan datanya immutable(tidak bisa diubah). tidak bisa setter.

? 32 ada di Level

* */