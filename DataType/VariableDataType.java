package DataType;

public class VariableDataType {
    public static void main(String[] args) {
        String name;
        name = "Federico";

        System.out.println(name);

        // var age; // error, becuase the variable must have value

        var age = 30;
        var address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        //final keyword for immutable variable (constant)
        final var ten = 10;

        // ten = 11; // error, because we cannot modifier final variable
    
        System.out.println(ten);
    }
    
}