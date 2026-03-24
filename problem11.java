// 11. A drawing application is being developed where different shapes can be created.
// All shapes share some common properties, so a base class Shape is created with a
// method display() to show general shape information.
// Two specific shapes, Circle and Rectangle, inherit from the Shape class. Each shape
// has its own method to calculate and display its area.
// This demonstrates hierarchical inheritance, where multiple subclasses inherit from a
// single base class.

class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println(Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println(length * breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Rectangle r = new Rectangle(4, 5);

        c.display();
        c.area();

        r.display();
        r.area();
    }
}
