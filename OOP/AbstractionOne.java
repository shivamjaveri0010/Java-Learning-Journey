package OOP;

/*----------Day-16----------*/
/*----------Exercise----------*/
/*-----Abstraction-----*/

//Abstract class can not be instantiated
abstract class Vehicle {
    //abstract method without body
    abstract void start();
}

//child class
class Car extends Vehicle {
    //implementing abstract method
    @Override
    void start() {
        System.out.println("Car starts with a key...");
    }
}

public class AbstractionOne {
    public static void main(String[] args) {
        //parent reference
        Vehicle v;

        //object of child class
        v = new Car();

        //calling method
        v.start();
    }
}
