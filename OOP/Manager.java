package OOP;

class Manager extends Employee {
    String company;

    Manager(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.printf("Hello %s, My name is Manager %s\n", name, this.name);
    }
}