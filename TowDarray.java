import java.util.Scanner;

public class TowDarray {
    public static void main(String[] args) {

        /*----------Day-9----------*/
        
        /*----------Exercise----------*/
        //print all elements of 2D array
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[2][3];

        // System.out.println("Enter elements: ");

        // for (int i=0; i<arr.length; i++) {
        //     for (int j=0; j<arr[i].length; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // for (int i=0; i<arr.length; i++) {
        //     for (int j=0; j<arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // sc.close();

        /*----------Exercise----------*/
        //find sum of all elements
        // int sum = 0;
        // int[][] arrSum = new int[2][3];

        //Input
        // System.out.println("Enter numbers: ");
        // for (int i=0; i<arrSum.length; i++) {
        //     for(int j=0; j<arrSum[i].length; j++) {
        //         arrSum[i][j] = sc.nextInt();
        //     }
        // }

        //printing sum
        // for (int i=0; i<arrSum.length; i++) {
        //     for(int j=0; j<arrSum[i].length; j++) {
        //         sum = sum + arrSum[i][j];
        //     }
        // }
        // System.out.println("Sum of this array is: " + sum);

        // sc.close();

        /*----------Exercise----------*/
        //print row wise sum
        // int[][] rowSum = new int[2][3];

        //Input
        // System.out.println("Enter numbers: ");
        // for (int i=0; i<rowSum.length; i++) {
        //     for(int j=0; j<rowSum[i].length; j++) {
        //         rowSum[i][j] = sc.nextInt();
        //     }
        // }

        //rows sum
        // for(int i=0; i<rowSum.length; i++) {
        //     int sum = 0;
        //     for (int j=0; j<rowSum[i].length; j++) {
        //         sum = sum + rowSum[i][j];
        //     }
        //     System.out.println("Sum of row " + i + " is: " + sum);
        // }

        // sc.close();

        /*----------Task-9----------*/
        /* Marks of 3 students in 3 subjects
           --> Total marks per student
           --> Highest Marks */

        int[][] marks = new int[3][3]; 
        int highest = Integer.MAX_VALUE;    //start with lowest possible number
        
        //Input
        System.out.println("Enter marks of 3 students (3 subjects each):");
        for (int i=0; i<marks.length; i++) {
            for (int j=0; j<marks[i].length; j++) {
                marks[i][j] = sc.nextInt();

                if (marks[i][j] > highest) {
                    highest = marks[i][j];
                }
            }
        }

        //total marks and highest
        System.out.println("\nTotal marks per student:");
        for (int i=0; i<marks.length; i++) {
            int sum = 0;

            for (int j=0; j<marks[i].length; j++) {
                sum += marks[i][j];
            }
            System.out.println("Student " + (i + 1) + ": " + sum);
        }
        //Highest marks
        System.out.println("\nHighest marks: " + highest);

        sc.close();
    }
}
