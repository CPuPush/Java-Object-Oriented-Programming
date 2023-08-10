class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in parent");
    }
}

class Child extends Parent{
    String name;
    void doIt(){
        System.out.println("Do it in child");
        System.out.println("Parent name is " + super.name);
    }
}
/*
! 14. Variable Hiding
* Variable hiding merupakan masalah yang terjadi ketika kita membuat nama field sama di class child dengan nama field di class parent
* Tidak ada yang namanya field overriding, ketika kita buat ulang nama field di class, itu berarti variable hiding
* untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword
* yang membedakan variable hiding dan method overriding adalah ketika sebuah object di cast
* saat object di cast, method akan tetap mengakses method overriding namun variable akan mengakses variable yang ada di class nya
? lanjut ke ParentApp
* */