package OOP;

import java.util.Scanner;

/*----------Day-17----------*/
/*----------Task-17-----------*/
/*----------Interface----------*/

interface systemLogin {
    void login();
}

class Email implements systemLogin {
    @Override
    public void login() {
        System.out.println("Login with Email...");
    }
}

class Google implements systemLogin {
    @Override
    public void login() {
        System.out.println("Login with Google...");
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        System.out.println("1. Email");
        System.out.println("2. Google");

        int choice = sc.nextInt();

        systemLogin l;

        switch (choice) {
            case 1:
                l = new Email();
                break;

            case 2:
                l = new Google();
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        l.login();
        sc.close();
    }
}
