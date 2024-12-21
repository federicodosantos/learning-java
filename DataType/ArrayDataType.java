package DataType;

public class ArrayDataType {
    public static void main(String[] args) {
        String[] arrayStrings;

        arrayStrings = new String[3];

        arrayStrings[0] = "Riko";
        arrayStrings[1] = "Keren";
        arrayStrings[0] = "Banget";

        System.out.println(arrayStrings[0]);
        System.out.println(arrayStrings[1]);
        System.out.println(arrayStrings[2]);

        // other way to initialize array

        int[] arrayInt = new int[]{
            11,12,13
        };
        
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt.length);

        // array inside array
        String[][] members = {
            {"Riko", "Keren", "Banget"},
            {"Riko", "GG", "Banget"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[1][1]);
    }
}