public class PersonApp {
    public static void main(String[] args){
//        ? create object from class || Constructor
        var person1 = new Person("konde", "barus");
//        ? Manipulasi Field
//        person1.name = "Fori Okto Pakpahan";
//        person1.address = "Lumban Tanjung";
        System.out.println(person1.name);
        System.out.println(person1.address);
//        ? access method
        person1.sayHello("David");
//        ? Constructor Overloading
        Person person2 = new Person("Aji");
        Person person3 = new Person();
        person2.sayHello();

    }
}
/*
Agenda:
    * Pengenalan OOP
    * Object
    * Class
    * Method
    * Pewarisan
    * Interface
    * Enum
    * Exception
    * Others

! 1. Apa itu Object Oriented Programming
* Object-Oriented Programming adalah sudut pandang bahasa pemrograman yang berkonsep objek
* Ada Banyak Sudut pandang bahasa pemrograman, namun OOP adalah yang sangat populer saat ini.
* Ada beberapa istilah yang perlu dimengerti dalam OOP, yaitu Object dan Class

? Object
* Object adalah data yang berisi field/properties/attributes dan method/function/behavior
* Semua data bukan primitif di java adalah object, mulai Integer, Boolean, Character, String dan yang lain

? Class
* Class adalah blueprint, prototype atau cetakan untuk membuat Object
* Class berisikan deklarasi semua properties dan functions yang dimiliki oleh Object
* Setiap Object selalu dibuat dari Class
* Dan sebuah Class bisa membuat Object tanpa batas

? Membuat class
* Untuk membuat class, kita bisa menggunakan kata kunci class
* Penamaan Class biasa menggunakan format CamelCase

? Membuat Object
* Object adalah hasil instansiasi dari sebuah class
* Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama Class dan kurung()
        Person person2 = new Person();

        Person person3;
        person3 = new Person();



*/