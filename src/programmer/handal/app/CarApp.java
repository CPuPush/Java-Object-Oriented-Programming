package programmer.handal.app;

import programmer.handal.data.Avanza;
import programmer.handal.data.Bus;
import programmer.handal.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        System.out.println(car.getBrand());
        car.drive();
//        ((Avanza) car).isMaintenance();
        car.isMaintenance();
        System.out.println(car.isBig());

        System.out.println("<><><><><>");
        // BUS
        Car bus = new Bus();
        System.out.println(bus.isBig());
        bus.isMaintenance();
        System.out.println(bus.getTire());
        System.out.println(bus.getBrand());

    }
}

/*
* jika kita buat new Car itu tidak bisa di instansiasi, sama saja dengan abstract, jadi kita harus membuat polimorphism
* */
