package Generic;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Riko");
        objectMyData.setData(9000);
        MyData<? super String> myData = objectMyData;

        process(myData);
    }

    public static void process(MyData<? super String> myData) {
        Object value = (String) myData.getData();
        System.out.println("Process parameter " + value);
    }
}