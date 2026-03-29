package OOP;

import java.util.Scanner;

/*----------Task-13----------*/
/*----------Encapsulation----------*/
public class BankAcct {
    private double balance;

    //Constructor
    BankAcct(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid initial balance! Setting it to 0");
            this.balance = 0;
        }
    }

    //Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    //Withdrawl method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawl amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    //Get Balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initial balance
        System.out.print("Enter Initial Balance: ");
        double initial = sc.nextDouble();

        BankAcct acc = new BankAcct(initial);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount of deposit: ");
                    double depo = sc.nextDouble();
                    acc.deposit(depo);
                    break;

                case 2:
                    System.out.print("Enter amount of withdraw: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;
                    
                case 3:
                    System.out.println("Current Balance: " + acc.getBalance());
                    break;
                    
                case 4:
                    System.out.println("Thank You!");
                    break;    
            
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
