package Method;

public class Method {
    public static void main(String[] args) {
        sayHelloWorld();

        sayHelloWorldParameter("Riko", "Ganteng");

        int result = sum(2, 3);
        System.out.println(result);

        int[] myExamValues = new int[]{
            90, 80, 55, 90, 78, 88
        };

        sayCongrats("Jamal", myExamValues);
        sayCongrats("Jamil", 80,90,70,88,76);

    }

    static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    static void sayHelloWorldParameter(String firstName, String lastName) {
        System.out.printf("Hello %s %s", firstName, lastName);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    //method variable argument
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.printf("Selamat %s, Anda lulus\n", name);
        } else {
            System.out.printf("Maaf %s, Anda cupuuhh\n", name);
        }
    }
}