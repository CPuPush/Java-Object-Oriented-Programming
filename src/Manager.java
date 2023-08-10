class Manager extends Employee{
    String company;

    Manager(String name){
        super(name);
    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", my name is Manager " + this.name);
    }

    void sayCompany(String company){
        System.out.println("this is my company with the name is " + company);
    }
}

//    ? Inheritance
class VicePresident extends Manager{
//    ? Method overriding
    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hello " + name + ", my name is VP " + this.name);
    }
}
/*
! 7. Inheritance
* Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
* Dalam artian, kita bisa membuat class Parent dan class Child
* Class Chils, hanya bisa punya satu class Parent, namun satu class parent bisa punya banyak class child
* Saat sebuah class diturunkan, maka semua field dan method yang ada di class parent secara otomatis akan dimiliki oleh class child
* Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalu diikuti dengan nama class parentnya.

! 8. Method Overriding
* Method overriding adalah kemampuan mendeklarasikan ulang method di child class yang sudah ada di parent class
* Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class child, method yang di class parent tidak bisa diakses lagi

? 9 ada di Shape.java

! 10. Super Constructor
* Tidak hanya untuk mengakses method atau field yang ada di parent class, kata kunci super juga bisa digunakan untuk mengakses constructor
* Namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya didalam class child constructor
* Jika sebuah class parent memiliki constructor yang ada parameternya (tidak  default constructor), maka class child wajib mengakses constructor class parent tersebut
contoh default constructor
Person(){
}
* ARTINYA jika parent memiliki constructor maka wajib membuat constructor di childnya

! 11. Object Class
* Di java, setiap class yang kita buat secara otomatis adalah turunan dari class "Object"
* Walaupun tidak secara langsung kita eksplisit menyebutkan extends Object, tapi secara otomatis Java akan membuat class kita extends Object
* Bisa dikatakan class Object adalah superclass untuk semua class yang ada di Java
Todo => class Manager extends Object{} sudah seperti ini terus, kita tinggal memanggil methodnya aslinya

? 12 ada di EmployeeAppPoly


*/
