package Collection;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> stringIterable = List.of("Riko", "Ganteng", "Banget");

        for (var name : stringIterable) {
            System.out.printf("Value : %s\n", name);
        }
    }
}