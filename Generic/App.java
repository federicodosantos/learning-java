package Generic;

public class App {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Jamil");

        System.out.println(stringMyData.getData());
    }
}