import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        /*----------Day-8----------*/
        /*----------Exercise----------*/
        //take name from user print length and first character using string operations
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // System.out.println(name.length());  //length
        // System.out.println(name.charAt(0)); //first character at 0 index

        /*----------Exercise----------*/
        //convert input to UPPER CASE
        // System.out.println(name.toUpperCase()); //UPPER CASE

        /*----------Exercise----------*/
        //check if it contains an string "Java"
        // System.out.println(name.contains("Java"));


        /*----------Task-8----------*/
        //Email Validator
        String emailId = sc.nextLine();
        if (emailId.contains("@") && emailId.contains(".")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
