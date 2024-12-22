package OOP;

class VicePresident extends Employee {

    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.printf("Hello %s, My name is VP %s\n", name, this.name);
    }
}