import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        
        /*----------Day-4----------
        ---Conditional statements---
        ---------------------------*/

        /*----------Exercise----------*/
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        sc.close();
    }
}
