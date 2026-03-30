package OOP;

/*----------Day-14----------*/
/*----------Inheritance---------*/
/*----------Exercise----------*/

public class Inheritance {

    static class Vehicle {
        void start() {
            System.out.println("Vehicle is starting...");
        }
    }

    static class Car extends Vehicle {
        @Override
        void start() {
            super.start(); //calling parent method
            System.out.println("Car is starting...");
        }

        void drive() {
            System.out.println("Car starts moving...");
        }
    }
    public static void main(String[] args) {
        Car obj = new Car();

        obj.start();
        obj.drive();
    }
}
