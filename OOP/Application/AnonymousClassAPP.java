package OOP.Application;

import OOP.Data.Car;

public class AnonymousClassAPP {
    public static void main(String[] args) {
        Car bus = new Car() {
            @Override
            public void drive() {
                System.out.println("Drive in a bus");
            }

            @Override
            public int getSeat() {
                return 50;
            }

            @Override
            public String getBrand() {
                return "Juragan 99";
            }
        };

        bus.drive();
        System.out.println(bus.getBrand());
        System.out.println(bus.getSeat());
    }
}