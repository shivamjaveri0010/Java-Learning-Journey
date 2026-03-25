import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        
        /*----------Day-4----------
        ---Conditional statements---
        ---------------------------*/

        /*----------Exercise----------*/
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // if(num > 0) {
        //     System.out.println("Positive");
        // } else {
        //     System.out.println("Negative");
        // }

        // sc.close();

        /*----------Exercise----------*/
        // Scanner sc = new Scanner(System.in);
        // int marks = sc.nextInt();

        // if(marks >= 90) {
        //     System.out.println("A");
        // } else if(marks >= 75) {
        //     System.out.println("B");
        // } else if(marks >= 50) {
        //     System.out.println("C");
        // } else {
        //     System.out.println("Fail");
        // }

        // sc.close();

        /*-----------Task-4----------*/
        //age eligibility checker
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
