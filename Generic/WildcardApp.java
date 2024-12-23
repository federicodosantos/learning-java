package Generic;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<String>("Riko"));
        print(new MyData<Integer>(22));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}