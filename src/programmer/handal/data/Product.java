package programmer.handal.data;

public class Product {
    // field
    protected String name;
    protected int price;

    // constructor
    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    public Product(String name){
        this.name = name;
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

* */
