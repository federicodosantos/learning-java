package OOP.Application;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceAPP {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("OOP.md"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.printf("Error membaca file : %s", throwable.getMessage());
        }
    }
}