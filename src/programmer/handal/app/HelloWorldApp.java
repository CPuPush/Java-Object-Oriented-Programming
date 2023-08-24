package programmer.handal.app;

import programmer.handal.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        //? Anonymous class
        HelloWorld hello = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello Dunia tipu tipu");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Say my name " + name);
            }
        };

        hello.sayHello();
        hello.sayHello("Fori");

    }
}
/*
todo => artinya adalah kita tidak perlu lagi membuat class untuk mengimplementasikan interface atau abstract class yg sudah dibuat
* berguna untuk implementasi class yang sederhana
* kekurangannya adalah tidak bisa di reused
* */