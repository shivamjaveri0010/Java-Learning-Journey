import java.util.Scanner;

public class Methods {

    /*----------Exercise----------*/
    // public static void printName() {
    //     System.out.println("Shivam");
    // }

    /*----------Exercise----------*/
    // public static int num(int n) {
    //     return n*n;
    // }

    /*----------Exercise----------*/
    //max no. ?
    // public static int maxNum(int a, int b) {
    //     if (a > b) {
    //         return a;
    //     } else {
    //         return b;
    //     }
    // }

    /*----------Task-6----------*/
    //calculator

    /*----------Addition----------*/
    public static int add(int x, int y) {
        return x+y;
    }

    /*----------Subtraction----------*/
    public static int sub(int x, int y) {
        return x-y;
    }

    /*----------Multiplication----------*/
    public static int multi(int x, int y) {
        return x*y;
    }

    /*----------Division----------*/
    public static int div(int x, int y) {
        return x/y;
    }

    public static void main(String[] args) {
        /*----------Day-6----------
        -----Functions(Methods)----
        ---------------------------*/

        /*----------Exercise----------*/
        //print your name
        // printName();

        /*----------Exercise----------*/
        //take number print square
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(num(n));

        // sc.close();

        /*----------Exercise----------*/
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // System.out.println(maxNum(a, b));

        // sc.close();

        /*----------Task-6----------*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        //Addition
        System.out.println("Addition: " + add(x, y));

        //Subtraction
        System.out.println("Subtraction: " + sub(x, y));

        //Multiplication
        System.out.println("Multiplication: " + multi(x, y));

        //Division
        if (y != 0) {
            System.out.println("Division: " + div(x, y));
        } else {
            System.out.println("Can not divide by zero.");
        }

        sc.close();
    }
}