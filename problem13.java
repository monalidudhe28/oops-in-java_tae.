13. A company wants to evaluate employee performance.
Create an abstract class Employee with:
 attributes: name, id
 abstract method calculateBonus()
Create subclasses:
 Manager → bonus is 20% of salary
 Developer → bonus is 10% of salary plus project incentive
Demonstrate runtime polymorphism by storing different

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return 0.20 * salary;
    }
}

class Developer extends Employee {
    double salary;
    double incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.incentive = incentive;
    }

    double calculateBonus() {
        return 0.10 * salary + incentive;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("Amit", 101, 50000);
        Employee e2 = new Developer("Ravi", 102, 40000, 5000);

        System.out.println(e1.calculateBonus());
        System.out.println(e2.calculateBonus());
    }
}
