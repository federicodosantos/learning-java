package Loop;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] arrStrings = {
            "Riko", "ganteng", "bgtzz",
        };

        for (String string : arrStrings) {
            System.out.println("value arrStrings: " + string);
        }
    }
}