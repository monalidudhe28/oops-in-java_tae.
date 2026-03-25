17. A company wants to track how many employees have been created in the
system.
Question:
Create a class Employee with attributes name and id.
Use a static variable employeeCount that increases every time a new object is
created.
Write a program that:
 Creates multiple employee objects
 Displays the total number of employees using a static method


class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 101);
        Employee e2 = new Employee("Neha", 102);
        Employee e3 = new Employee("Rahul", 103);

        Employee.displayCount();
    }
}
