package Generic;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Jamal");
//        doIt(stringMyData); // Error
    }

    public static void doIt(MyData<Object> objectMyData) {
        // do nothing
    }
}