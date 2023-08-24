package programmer.handal.data;

public class Constant {
    // ?Static pada field. Static biasanya final tergantung programmernya
    public static String APPLICATION = "Java programming";
    public static final int version = 1;
}
/*
! 30. Static Keyword
* Sebelumnya kita sudah sering melihat kata kunci static
* Dengan menggunakan kata kunci static, kita bisa membuat field, method atau class bisa diakses langsung tanpa melalui objectnya
* perlu ingat static hanya bisa mengakses static lainnya
? Static dapat digunakan di
* field, atau disebut class variable, artinya field tersebut bisa diaskses langsugn tanpa membuat object terlebih dahulu
* method, atau disebut class method, artinya method tersebut bisa diakses langusng tnpa membuat object terlebuh dahulu
* Block, static block akan otomatis dieksekusi ketika sebuah class di load
* inner class, artinya class tersebut bisa diakses secara langsung tnpa harus membuat object outer class terlebih dahulu, Static pada inner class menyebabhkan kita tidak bisa mengakses lagi object outer classnya.
? lanjutan dapat diliihat di Company, Country, MathUtil, dan StaticApp

? 31 ada di LoginRequest
*/