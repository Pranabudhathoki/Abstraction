abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double a, b, c, height;

    Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * b * height;
    }

    double calculatePerimeter() {
        return a + b + c;
    }
}

public class ShapeHierarchyApp {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(6, 4);
        Shape triangle = new Triangle(3, 4, 5, 4);

        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Triangle - Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter());
    }
}
