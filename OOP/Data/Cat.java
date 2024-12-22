package OOP.Data;

public class Cat extends Animal {

    @Override
    public void run() {
        System.out.printf("My %s cat is running", name);
    }
}