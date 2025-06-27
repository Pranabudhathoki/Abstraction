import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
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
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AppShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length and width of rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
