package programmer.handal.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value  = {ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Fancy {
    String name();
    String[] tags() default {};
}
/*
! 38. Annotation
* Annotation adalah menambahkan metadata ke kode program yang kita buat
* Tidak semua orang membutuhkan Annotation, biasanya annotation digunakan saat kita ingin membuat library/framework
* Annotation sendiri bisa diakses menggunakan reflection
* Untuk membuat annotation, kita bisa menggunakan kata kunci @interface
* Annotation hanya bisa memiliki method dengan tipe data sederhana dan bisa memiliki default value

// attribute Annotation
? @Target => memberitahu annotation bisa digunakan dimana? apakah class, method, field dan lain
? @Retention => memberitahu annotation apakah disimpan di hasil kompolasi dan apakah bisa dibaca oleh reflection

Annotation bawaan java
? @Override =>
? @Deprecated => untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan
? @functionalInterface => untuk menandai bawha class tersebut bisa dibuat sebagai lambda expression
dll
Fancy, AnimalApp data.Car

! 39. Reflection
* Reflection adlaah kemampuan melihat struktur aplikasi pada saat berjalan
* Reflection biasanya  sangat berguna saat kita ingin membuat library ataupun framework, sehingga bisa meng-otomatisasi pekerjaan
* Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan method getClass() atau NamaClass.class

lanjutan ada di NotBlank, di ValidationUtil, dan di ReflectionApp

*/