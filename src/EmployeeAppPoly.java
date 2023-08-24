public class EmployeeAppPoly {
    public static void main(String[] args) {
//        ? Polymorphism
        Employee employee = new Employee("dani");
        employee.sayHello("budi");

        employee = new Manager("doni", "okest");
        employee.sayHello("bani");

        employee = new VicePresident("dodak");
        employee.sayHello("bani");
        System.out.println("<><><><>");
        sayHello(new Employee("Ekost"));
        sayHello(new Manager("truster"));
        sayHello(new VicePresident("das"));
    }

    static void sayHello(Employee classPol){
        // ? type check & casting
        if(classPol instanceof VicePresident){
            //jika ingin diconversi
            VicePresident vicePresident = (VicePresident) classPol;
//            System.out.println("Hello VP " + classPol.name);
            System.out.println("Hello VP " + vicePresident.name);
        }else if(classPol instanceof Manager){
            Manager manager = (Manager) classPol;
            System.out.println("Hello Manager " + manager.name);
        }else{
            System.out.println("Hello Employee " + classPol.name);
        }
    }
    // ? walaupun tipe data Employee, kita dapat memasukkan turunannya

}
/*
! 12. Polymorphism
* Polymorphism berasal dari bahasa yunani yang berarti banyak bentuk
* Dalam OOP, Polumorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
* Polymorphism erat hubungannya dengan inheritance

* contoh lain, polymorhphism juga bisa di set dalam paramter yang ada didalam method
* problemnya adalah tidak bisa direct mengakses method/field yang ada di child, hanya bisa di class yang dideklarasikan tipe datanya
* contohnya pada Manager ada company, jadi tidak bisa akses company
* jadi kenama sayHello itu bisa? Menurut asumsi saya sekarang, hal itu karena adanya overriding (method pada parent diimplementasi ulang di subclass)

! 13. Type Check & Casts
* Sebelumnya kita sudah tau cara melakukan konversi tipe data (casts) di tipe data primitif
* Cast juga bisa digunakan untuk tipe data bukan primitif
* Namun agar aman, sebelum melakukan casts, pastikan kita melakukan type check (pengecekan tipe data), dengan menggunakan kata kunci "instanceof"
* hasil operator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai.

? 14. ada di Parent
* */
