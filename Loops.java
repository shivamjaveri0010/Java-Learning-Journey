import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        /*----------Day-5----------
        ----------Loops------------
        ---------------------------*/

        //will focus on for loop only because it is mostly used

        /*----------Exercise----------*/
        //print no. from 1 to 10
        // for (int i=1; i<=10; i++) {
        //     System.out.println(i);
        // }

        /*----------Exercise----------*/
        //print even no. from 1 to 20
        // for (int i=1; i<=20; i++) {
        //     if (i%2==0) {
        //         System.out.println(i);
        //     }
        // }

        /*----------Exercise----------*/
        //print table of 5
        // int n = 5;
        // for (int i=1; i<=10; i++) {
        //     System.out.println(n + " x " + i + " = " + n*i);
        // }

        /*----------Task-5----------*/
        //print the sum from 1 to n
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=N; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        sc.close();
    }
}
