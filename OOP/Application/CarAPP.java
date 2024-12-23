package OOP.Application;

import OOP.Data.Sedan;

public class CarAPP {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.drive();
        System.out.println(sedan.getSeat());
        System.out.println(sedan.getBrand());
        sedan.tire();
    }
}