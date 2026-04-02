package OOP;

import java.util.Scanner;

/*----------Day-17----------*/
/*----------Exercise----------*/
/*----------Interface----------*/

//interface
interface Payment {
    void makePayment();
}

//UPI Implementation
class UPI implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment done using UPI...");
    }
}

//Credit Card Implementation
class CreditCard implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment done using Credit Card...");
    }
} 
public class InterfaceOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");

        int choice = sc.nextInt();

        //Parent reference
        Payment p;

        if (choice == 1) {
            p = new UPI();      //upcasting
        } else if (choice == 2) {
            p = new CreditCard();   //upcasting
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        p.makePayment();
        sc.close();
    }
}
