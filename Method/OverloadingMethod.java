package Method;

public class OverloadingMethod {
    public static void main(String[] args) {
        sayHello();
        
        sayHello("Jamal");
    }

    static void sayHello() {
        System.out.println("Hello dunia");
    }

    static void sayHello(String firstName) {
        System.out.printf("Hello %s\n", firstName);
    }
}