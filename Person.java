import java.util.Scanner;

public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String employeeId;
    String department;
    
    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, "E123", "HR");
        emp.display();
    }

    Scanner.close();
}
