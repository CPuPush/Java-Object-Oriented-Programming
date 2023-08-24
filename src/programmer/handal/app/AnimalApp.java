package programmer.handal.app;

import programmer.handal.data.Cat;
import programmer.handal.data.Animal;

public class AnimalApp {
    public static void main(String[] args) {
//        polymorphism
        Animal animal = new Cat();
        animal.name = "test";
        animal.run();
    }
}
