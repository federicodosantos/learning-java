package OOP;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Riko");
        employee.sayHello(employee.name);

        employee = new Manager("Riko");
        employee.sayHello(employee.name);

        employee = new VicePresident("jamal");
        employee.sayHello(employee.name);

        sayHello(new Employee("Jamil"));

        sayHello(new VicePresident("Jamil"));
   }
    // Method Polymorphism
   static void sayHello(Employee employee) {
        if (employee instanceof VicePresident vp) {
            System.out.printf("Hello VP %s", vp.name);
        } else if (employee instanceof Manager manager) {
            System.out.printf("Hello manager %s", manager.name);
        } else {
            System.out.printf("Hello employee %s", employee.name);
        }
   }
}