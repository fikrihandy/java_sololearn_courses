import java.util.Scanner;

abstract class Shape {
    int width;

    abstract void area();
}

// Shapes
class Square extends Shape {
    public Square(int paramWidth) {
        width = paramWidth;
    }

    @Override
    void area() {
        System.out.println("Luas persegi = " + (width * width));
    }
}

class Circle extends Shape {

    public Circle(int paramWidth) {
        width = paramWidth;
    }

    @Override
    void area() {
        System.out.println("Luas lingkaran = " + (Math.PI * width * width));
    }
}

public class MoreOnClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sisi persegi = ");
        int square = sc.nextInt();
        System.out.print("Jari-jari lingkaran = ");
        int circle = sc.nextInt();

        Square a = new Square(square);
        Circle b = new Circle(circle);
        a.area();
        b.area();
    }
}

//You are working on a graphical app, which includes multiple different shapes.
//The given code declares a base Shape class with an abstract area() method and a width attribute.
//You need to create two Shape subclasses, Square and Circle, which initialize the width attribute using their constructor, and define their area() methods.
//The area() for the Square class should output the area of the square (the square of the width), while for the Circle, it should output the area of the given circle (PI*width*width).
//The code in main creates two objects with the given user input and calls the area() methods.