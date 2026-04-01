package OOP;

import java.util.Scanner;

/*----------Day-15----------*/
/*----------Task-15----------*/
/*-----Polymorphism-----*/

//parent class
class Payment {
    void pay() {
        System.out.println("Payment Processing...");
    }
}

//child class UPI
class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Paid using UPI.");
    }
}

//child class Card
class Card extends Payment {
    @Override
    void pay() {
        System.out.println("Paid using Card.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Payement Method: ");
        System.out.println("1. UPI");
        System.out.println("2. Card");

        int choice = sc.nextInt();

        //Runtime Polymorphism
        Payment p;  //reference variable of parent class

        /*Child object stored in parent reference variable this is called upcasting.*/

        if (choice == 1) {
            p = new UPI();  //Upcasting
        } else if (choice == 2) {
            p = new Card(); //Upcasting
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        //method call (decided at runtime)
        p.pay();

        sc.close();
    }
}
