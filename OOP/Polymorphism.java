package OOP;

import java.util.Scanner;

/*----------Day-15----------*/
/*----------Exercise of Polymorphism----------*/

//parent class
class Shape {
    void area() {
        System.out.println("Area is not defined!");
    }
}

//child class Circle
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of a Circle: " + result);
    }
}

//child class Rectangle
class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}
public class Polymorphism {

    //Method Overloading
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double x, double y) {
        return x * y;
    }

    static int multiply(int p, int q, int r) {
        return p * q * r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //----------Multiplication Section----------
        System.out.println("Choose Multiply Option: ");
        System.out.println("1. Two Integers");
        System.out.println("2. Two Decimals");
        System.out.println("3. Three Integers");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter two integers numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Result: " + multiply(a, b));
                break;

            case 2:
                System.out.print("Enter two decimal numbers: ");
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                System.out.println("Result: " + multiply(x, y));

            case 3:
                System.out.print("Enter three integer numbers: ");
                int p = sc.nextInt();
                int q = sc.nextInt();
                int r = sc.nextInt();
                System.out.println("Result: " + multiply(p, q, r));
        
            default:
                System.out.println("Invalid choice!");
                break;
        }

        System.out.println();

        //----------Shape section----------
        System.out.println("Choose Shape: ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        int shapeChoice = sc.nextInt();

        Shape s;

        switch (shapeChoice) {
            case 1:
                System.out.print("Enter Radius: ");
                double radius = sc.nextDouble();
                s = new Circle(radius);
                s.area();
                break;
            
            case 2:
                System.out.println("Enter length and width: ");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                s = new Rectangle(length, width);
                s.area();
                break;    
        
            default:
                System.out.println("Invalid shape choice!");
                break;
        }

        sc.close();
    }
}
