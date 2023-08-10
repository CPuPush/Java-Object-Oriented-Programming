package programmer.handal.data;

public abstract class Animal {
    public String name;

    public abstract void run();// tidak ada block code
}
/*
! 18. Abstract Method
* Saat kita membuat class yang abstract, kita bisa membuat abstract method juga didalam class abstract tersebut
* saat kita membuat abstract method, kita tidak boleh membuat block method untuk method tersebut
* artinya abstact method wajib di override di class child
* abstact method tidak boleh memiliki access modifier private

? lanjutan ada di Cat

? 19 ada di Category

* */