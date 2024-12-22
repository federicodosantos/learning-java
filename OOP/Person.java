package OOP;

class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String name) {
        this(name, null);
    }

    void sayHello(String paramName) {
        System.out.printf("Hello %s, My name is %s", paramName, name);
    }
}