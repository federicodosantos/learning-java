package OOP;

public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Federico", "Malang");
        var person2 = new Person("Jamil");
        
        person1.sayHello("Jamal");

        person2.sayHello("Jamal");
        
        var employee1 = new Manager("Jamil");
        var employee2 = new VicePresident("Jamal");

        employee1.sayHello(employee2.name);
        employee2.sayHello(employee1.name);
    }
}