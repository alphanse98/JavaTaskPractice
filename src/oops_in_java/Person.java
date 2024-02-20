package oops_in_java;
// 1.4) Define a base class Person with attributes name and age.Create a
// subclass Employee that inherits from Person and adds attributes like employeeID
// andsalary.Use the super keyword to initialize the Person attributes in the Employee constructor.

// Person class
public class Person {
    String name;
    int age;
}

// Employee that inherits from Person
class Employee extends Person {

    int employeeId;
    double salary;

    Employee(String name, int age, int employeeId, Double salary) {
        // Use the super keyword
        super.name = name;
        super.age = age;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void printData() {
        System.out.println("Name is >> " + super.name);
        System.out.println("age is  >> " + super.age);
        System.out.println("employeeId is  >> " + employeeId);
        System.out.println("salary is  >> " + salary);
    };

    public static void main(String[] args) {
        Employee obj = new Employee("ram", 25, 12, 45100.0);
        obj.printData();
    }
}

