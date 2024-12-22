package OOP;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.printf("Hello %s, My name is Employee %s\n", name, this.name);
    }
}

