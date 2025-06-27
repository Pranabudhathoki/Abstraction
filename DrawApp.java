abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double calculateVolume() {
        return Math.pow(side, 3);
    }

    double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    double length, width, height;

    Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double calculateVolume() {
        return length * width * height;
    }

    double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }

    double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Draw {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class DrawApp {
    public static void main(String[] args) {
        Draw cube = new Cube(5);
        Draw cuboid = new Cuboid(4, 3, 2);
        Draw cylinder = new Cylinder(3, 7);

        System.out.println("Cube - Volume: " + cube.calculateVolume() + ", Area: " + cube.calculateArea() + ", Perimeter: " + cube.calculatePerimeter());
        System.out.println("Cuboid - Volume: " + cuboid.calculateVolume() + ", Area: " + cuboid.calculateArea() + ", Perimeter: " + cuboid.calculatePerimeter());
        System.out.println("Cylinder - Volume: " + cylinder.calculateVolume() + ", Area: " + cylinder.calculateArea() + ", Perimeter: " + cylinder.calculatePerimeter());
    }
}
