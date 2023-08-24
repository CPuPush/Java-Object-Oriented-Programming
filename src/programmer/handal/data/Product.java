package programmer.handal.data;

import java.util.Objects;

public class Product {
    // field
    public String name;
    public int price;

    // constructor
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    public Product(String name){
        this.name = name;
    }

//    String toStrings(){
//        return "product name: "+ this.name + "price " + this.price;
//    }
    //? overrride method toString
    public String toString(){
        return "product name: "+ this.name + "price " + this.price;
    }

    //? Override method equals()
    //! Otomatis
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }


    //! Manual
    /*
    public boolean equals(Object o){
        // secara memory sama berarti true saja
        if(o == this){
            return true;
        }
        // check apakah object itu instansiasi dari product
        if(!(o instanceof Product)){
            return false;
        }

        // jika instance dari product maka kita konversi menjadi product dari object
        Product product = (Product) o;
        // dilakukan pengecekan lagi
        if(this.price != product.price){
            System.out.println("test price");
            return false;
        }
        //dilakukan pengecekan name ke null karena name bisa saja tidak ada berdasarkan pembuatan contructor
        if(this.name != null){
            System.out.println("check apakah namanya sama");
            return this.name.equals(product.name);
        }else{
            System.out.println("test name == null");
            return product.name == null;
        }
    }
    */

    // hashcode
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
/*
! 15. Access Modifier
* Access modifier adalah kemampuan membuat class, field, method dan constructor dapat diakses dari mana saja
* sebelumnya sudah dibuatkan public dan default (no-modifier)
* terdapat 4 access modifier
?              Class  Package  Subclass World
*public         y       y       y       y
*protected      y       y       y       n
*no modifier    y       y       n       n
*private        y       n       n       n

? Public class
* Saat kita membuat public class, kita hanya bisa membuat 1 public class di 1 file java, dan jika ingin membuat subclass, maka tidak akan bisa
* Selain itu, nama public class harus sama dengan nama file

* pada code diatas protected dibuat pada variable sehingga yang akan terjadi adalah, variable tidak dapat diakses diluar package

? 16 berada pada ProductApp2

! 23. ToString Method
* toString() adalah method yang terdapat di class object
* Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String
* secara default, toString() ini akan menghasilkan:
    namaclass + @ + hashCode
* namun kita bisa mengubahkan jika kita mau, agar object yang kita buat lebih mudah dibaca

* jadi istilahnya kita dapat mengoverride method di Object.java yaitu toString() method yang jika dipanggil maka akan mengeluarkan string sbb:
todo Product@4617c264
* untuk contoh penggunaan override method toString() dapat dilihat pada code diatas
* System.out.println(product); hanya dengan memanggil seperti berikut ini maka langsung dapat detail data toString()
? 24 ada di EqualsApp

?lanjutan equal
* disarankan tidak melakukan override equal secara manual, hal ini karena di IDE dapat dilakukan override secara otomatis dengan generator

! 25. HashCode Method
* Method hashCode adalah method representasi integer object kita, mirip toString yang merupakan representasi String, hashCode adalah representasi integer
* HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, Set, dan lain, karena cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita
* secara default hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa mengoverridenya jika kita ingin.
? Kontrak HashCode Method
TIdak mudah meng-override method hashCode, karena ada kontraknya:
* sebanyak apapun hashCode dipanggil, untuk object yang sama harus menghasilkan data integer yang sama
* jika ada 2 object yang sama jika dibandingkan menggunakan method equals, maka nilai hashCode nya juga harus sama
* tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah integer sekitar 2 milyar

? 26 ada di SocialMedia


* */
