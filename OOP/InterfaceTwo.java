package OOP;

import java.util.Scanner;

/*----------Day-17----------*/
/*----------Exercise----------*/
/*----------Tnterface----------*/
/*-----Device Controle System-----*/

interface ControleSystem {
    void turnOn();

    void turnOff();
}

class Fan implements ControleSystem {
    @Override
    public void turnOn() {
        System.out.println("Fan is On...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is Off...");
    }
}

class Light implements ControleSystem {
    @Override
    public void turnOn() {
        System.out.println("Light is On...");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is Off...");
    }
}

public class InterfaceTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        System.out.println("1. Fan");
        System.out.println("2. Light");

        int choice = sc.nextInt();
        ControleSystem c;

        switch (choice) {
            case 1:
                c = new Fan();
                break;

            case 2:
                c = new Light();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        c.turnOn();
        c.turnOff();

        sc.close();
    }
}