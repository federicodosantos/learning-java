package OOP.Application;

import OOP.Data.Animal;
import OOP.Data.Cat;

public class AnimalAPP {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Pussy";
        animal.run();
    }
}

