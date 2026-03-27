import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        /*----------Day-7----------*/

        /*----------Exercise----------*/
        // store 5 no. and print all
        // Scanner sc = new Scanner(System.in);
        // int[] n = new int[5];

        // Input 5 numbers
        // System.out.println("Enter five numbers: ");
        // for (int i=0; i<5; i++) {
        // n[i] = sc.nextInt();
        // }

        // printing numbers
        // System.out.println("Numbers are: ");
        // for (int i=0; i<5; i++) {
        // System.out.println(n[i]);
        // }

        // sc.close();

        /*----------Exercise----------*/
        // find sum of array
        // Scanner sc = new Scanner(System.in);
        // int sum = 0;
        // int[] arrSum = new int[5];

        // Input 5 no.
        // System.out.print("Enter numbers: ");
        // for (int i=0; i<arrSum.length; i++) {
        // arrSum[i] = sc.nextInt();
        // }

        // printing sum of array
        // for (int i=0; i<arrSum.length; i++) {
        // sum = sum + arrSum[i];
        // }
        // System.out.println("Sum of array is: "+ sum);

        // sc.close();

        /*----------Exercise----------*/
        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        // int max = arr[0];

        // Input array
        // System.out.print("Enter array elements: ");
        // for (int i=0; i<arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // finding max
        // for (int i=1; i<arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // System.out.println("The alargest element is: " + max);

        // sc.close();

        /*----------Task-7----------*/
        // students marks analyzer
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        int totalMarks = 0;

        // Input
        System.out.print("Enter marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];

        // Calculating total and highest in ONE pass
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];

            // Check if current mark is higher than the one we've stored
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        // average marks
        double avgMarks = (double) totalMarks / marks.length;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average marks: " + avgMarks);
        System.out.println("Highest marks: " + highest);

        sc.close();
    }
}