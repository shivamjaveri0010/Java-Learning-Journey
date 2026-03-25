import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        //Modifying code
        // System.out.println("My name is Shivam");
        // System.out.println("I am learning Java Backend");

        //--- Day-1 --- Mini Task
        // System.out.println("Name: Shivam");
        // System.out.println("City: Varanasi");
        // System.out.println("Goal: Become a Java Developer");

        /*-----------------------------------
        -----Day-2 Variables and Data Types--
        -------------------------------------*/

        // int age = 21;
        // double height = 5.9;
        // char grade = 'A';
        // String name = "Shivam";
        // boolean isStudent = true;

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(height);
        // System.out.println(grade);
        // System.out.println(isStudent);

        /*-----Exercise-----*/
        //using variables
        // String name = "Shivam";
        // int age = 26;
        // String city = "Varanasi";

        // System.out.println("My name is: " + name);
        // System.out.println("I am " + age + " year old");
        // System.out.println("I live in " + city);

        /*-----Task-2-----*/
        // String productName = "Milk";
        // double price = 4.2;
        // boolean isAvailable = true;

        // System.out.println("Product Name: " + productName);
        // System.out.println("Price: $" + price);
        // System.out.println("In Stock: " + isAvailable);

        /*---------------Day-3-------------
        ------Operators & User Input-------
        ----------------------------------*/

        //user input
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        // //operations
        // System.out.println("Sum: " + (num1+num2));
        // System.out.println("Difference: " + (num1/num2));
        // System.out.println("Product: " + (num1*num2));

        /*----------Exercise----------*/

        // String name = sc.nextLine();
        // String city = sc.nextLine();

        // System.out.println("Hello this is " + name + " from " + city + ".");

        // sc.close();

        /*-----Task-3-----*/
        //user input of two numbers and performing arithmetic operations
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        //operations
        System.out.println("Addition: " + (n1+n2));
        System.out.println("Subtraction: " + (n1-n2));
        System.out.println("Multiplication: " + (n1*n2));
        System.out.println("Division: " + (n1/n2));

        sc.close();
    }
}