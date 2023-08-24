package programmer.handal.app;

import programmer.handal.data.Product;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "fori";
        first = first + " " + "pakpahan";
//        System.out.println(first);
        String second = "fori pakpahan";
//        System.out.println(second);


//        System.out.println(first == second);
        /* hasilnya false padahal kedua string mempunyai value yang sama,
        * hal itu karena dia memory, tetapi jika ada 2 object string dengan string yang sama secara langsung maka hasil nya true,
        todo Karena walaupun objectnya beda tetapi java mengoptimasi memory, jadi ketika string keadaanya indentik sama, maka java tidak akan membuat data string di memory, dan akan merefers ke object yang satunya.
        * */
        // override equals() method from Object.java
//        System.out.println(first.equals(second));

        //? equals
        Product products = new Product("123");
        Product products2 = new Product("123");
        System.out.println(products.equals(products2));
        //jika tanpa override, maka dibandingakan langsung dari memory maka hasilnya false

        //? hashcode
        System.out.println(products.hashCode());
        System.out.println(products.hashCode() == products2.hashCode());

    }
}
/*
! 24 Equals Method
* Hal yang agak membinungkan di java adalah cara membandingkan object
* dibahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator ==, di java operator == hanya untuk mengecek data primitif
* untuk non primitif pengecekannya menggunakan method equals
* dan secara default, method equals itu akan membandingkan dua buah object secara bersamaan posisi object di memory, artinya jika kita membuat 2 object yang isi fieldnya sama, tetap dianggap beda oleh method equals.
* oleh karena itu, ada baiknya kita meng-override method equal milik class Object tersebut
? note String itu merupakan object bukan primitif

? lanjutan equal ada di Product yg membahas pembuatan method equals di class
* */
