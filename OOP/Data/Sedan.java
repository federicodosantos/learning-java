package OOP.Data;

public class Sedan implements Car{
    @Override
    public void drive() {
        System.out.println("Drive in sedan");
    }

    @Override
    public int getSeat() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "BMW";
    }
}