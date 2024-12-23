package Generic;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Jamal");

        process(stringMyData);
    }

    public static void process(MyData<?> myData) {
        System.out.println(myData.getData());

//        myData.setData("Riko"); tidak boleh, karena berbahaya
    }
}