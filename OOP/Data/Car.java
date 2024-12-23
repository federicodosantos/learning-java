package OOP.Data;

public interface Car extends HasBrand {
    void drive();

    int getSeat();

    @Override
    String getBrand();

    default void tire() {
        System.out.println("Car certainly has 4 tires");
    }
}