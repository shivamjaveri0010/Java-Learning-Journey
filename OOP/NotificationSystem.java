package OOP;

import java.util.Scanner;

/*----------Task-16----------*/
/*----------Day-16----------*/
/*------Polymorphism-------*/

abstract class Notifications {
    abstract void sendingMessages();
}

class Email extends Notifications {
    @Override
    void sendingMessages() {
        System.out.println("Sending Email notification....");
    }
}

class SMS extends Notifications {
    @Override
    void sendingMessages() {
        System.out.println("Sending SMS notification....");
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        System.out.println("1. Email");
        System.out.println("2. SMS");

        int choice = sc.nextInt();

        Notifications n;

        if (choice == 1) {
            n = new Email();
        } else if (choice == 2) {
            n = new SMS();
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        n.sendingMessages();
        sc.close();
    }
}
