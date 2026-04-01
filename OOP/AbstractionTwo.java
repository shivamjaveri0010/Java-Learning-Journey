package OOP;

import java.util.Scanner;

/*----------Day-16----------*/
/*----------Exercise----------*/
/*-----Abstraction-----*/

//abstract class
abstract class Shape {
    abstract void calculateArea();
}

//circle class
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of a circle is: " + area);
    }
}

//rectangle class
class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of rectangle is: " + area);
    }
}

public class AbstractionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape: ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");

        int choice = sc.nextInt();

        //parent reference
        Shape s;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                s = new Circle(r);  //upcasting
                s.calculateArea();  //runtime polymorphism
                break;

            case 2:
                System.out.print("Enter length and width: "); 
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                s = new Rectangle(l, w);    //upcasting
                s.calculateArea();  //runtime polymorphism
        
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}
