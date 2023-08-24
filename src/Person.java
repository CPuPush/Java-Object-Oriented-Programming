class Person {
//    Field
    String name;
    String address;
    final String country = "Indonesia";

    //    ? Constructor
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    //    ? Constructor Overloading
    Person(String paramName){
//        name = paramName; =>  ganti dengan memanggil constructor lain
        this(paramName, null);
    }
    Person(){
        this(null);
    }
    void sayHello(){
        this.sayHello("Boss");
    }
    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
/*
! 2. Field
* Field/Properties/Attributes adalah data yang bisa kita sisipkan didalam object
* Namun sebelum kita bisa memasukkan data di field, kita harus mendeklarasikan data apa aja yang dimiliki object tersebut didalam deklarasi class-nya
* membuat field sama seperti membuat variable, namun ditempatkan di block class

? Manipulasi Filed
* Field yang ada di object, bisa kita manipulasi. Tergantung final atau bukan
* Jika final, berarti kita tidak bisa mengubah data fieldnyam namun jika tidak, kita bisa mengubah fieldnya
* Untuk memanipulasi data field, sama seperti cara pada variable
* Untuk mengakses field, kita butuh kata kunci . setelah nama object dan diikuti nama fieldnya.

! 3. Method
* Selain menambah field, kita juga bisa menambahkan method ke object
* Caranya dengan mendeklarasikan method tersebut didalam block class
* Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter, dan method overloading di method yang ada didalam block class
* Untuk mengakses method tersebut, kita bisa menggunakan tanda titik, dan diikuti dengan nama methodnya. Sama seperti mengakses field

! 4. Constructor
* Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung()
* Constructor adalah method yang akan dipanggil saat pertama kali object dibuat.
* Mirip seperti di method, kita bisa memberi parameter pada Constructor
* Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value.

! 5. Constructor Overloading
* Sama seperti di method, di constructor pun kita bisa melakukan overloading
* Kita bisa membuat constructor lebih dari satu, dengan syarat type data parameter harus berbeda, atau jumlah parameter harus berbeda

? Memanggil Constructor Lain
* Constructor bisa memanggil constructor lain
* Hal ini memudahkan saat kita butuh menginisalisasi data dengan berbagai kemungkinan
* Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun dengan kata kunci this.
=> dalam kode constructor dengan isi this(paramName, null);, maka akan memanggil constructor diatasnya dengan mengartikan bahwa constructor selanjutnya kosong, ditandai dengan "null"

! 6. Variable Shadowing (this keyword)
* Ini biasa terjadi ketika kita membuat nama parameter di method yang sama dengna nama field di class
* Saat terjadi variable shadowing, maka secara otomatis variable di scope diatasnya tidak bisa diakses
* Untuk mengatasi masalah variable shadowing maka terdapat THIS keyword
* this berguna untuk mengakses objek saat ini.
* this juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan untuk mengakses method
* this bisa digunakan untuk mengatasi masalah variable shadowing

? 7 ada di Manager.java

*/