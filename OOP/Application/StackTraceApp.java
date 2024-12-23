package OOP.Application;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            String[] names = {
                  "RIko", "Ganteng"
            };

            System.out.println(names[99]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElement = throwable.getStackTrace();

            throwable.printStackTrace();
        }
    }
}