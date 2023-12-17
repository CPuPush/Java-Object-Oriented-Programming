package programmer.handal.app;

import programmer.handal.annotation.Fancy;
import programmer.handal.data.Cat;
import programmer.handal.data.Animal;

@Fancy(name= "fikri", tags = {"digo", "dago"})
public class AnimalApp {
    public static void main(String[] args) {
//        polymorphism
        Animal animal = new Cat();
        animal.name = "test";
        animal.run();
    }
}
