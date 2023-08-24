package programmer.handal.app;

import programmer.handal.data.*;
// hal ini tidak diperlukan lagi/ auto import
import java.lang.*;
public class ProductApp2 {
    public static void main(String[] args) {
        Product product = new Product("test");
//        System.out.println(product.name);

        Data data = new Data();
    }
}
/*
? lanjutan dari access modifier
* sehingga product akan mengalami error, karena name dan yang lainnya tidak dapat diakses diluar package, karena konstructor menggunakan no-modifier.
* dan constructor tidak mengalami error lagi ketika diset ke public, tetapi terjadi lagi error ketika pemanggilan name, karena di class product field diset pada protected

! 16. Import
* import adalah kemampuan untuk menggunakan class yang berada di package yang berbeda
* syarat class yang bisa digunakan jika package yang berbeda adalah class yang harus public

? Import semua package
* jika kita ingin mengimport semua class di dalam sebuah package, kita bisa menggunakan tanda *

? Default import
* secara default, semua class yang ada di package java.lang sudah auto import, jadi kita tidak perlu melakukan import secara manual
* tetapi ada pengecualian, contoh class String, Integer, Long, dan lainnya terdapat di package java.lang. Oleh karena itu, kita tidak perlu meng-importnya secara manual

? 17 ada di Location
*/