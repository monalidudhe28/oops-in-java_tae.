7. Create an abstract class Shape with an abstract method calculate_area() and a
concrete method display_info(). Create concrete subclasses
like Circle and Rectangle that must implement their own specific logic
for calculate_area(). Try to instantiate an object of the Shape class directly and
observe the compilation error. Use the subclass objects to call both abstract and
concrete methods.

abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate_area() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;
        
        Circle c = new Circle(3);
        Rectangle r = new Rectangle(4, 5);

        c.display_info();
        System.out.println(c.calculate_area());

        r.display_info();
        System.out.println(r.calculate_area());
    }
}
