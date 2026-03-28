public class Patterns {
    public static void main(String[] args) {
        /*----------Day-10----------*/
        /*----------Exercise---------*/
        /*
        1
        1 2
        1 2 3
        1 2 3 4
         */

        // for (int i=1; i<=4; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        /*----------Exercise----------*/
        /*
        * * * *
        * * *
        * * 
        * 
        */

        // for (int i=4; i>=1; i--) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        /*----------Exercise----------*/
        /*
        4 3 2 1
        3 2 1
        2 1
        1
        */

        // for (int i=4; i>=1; i--) {
        //     for (int j=i; j>=1; j--) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        
        /*----------Task-10----------*/
        /*
           *
          * *
         * * *
        * * * *
        */

        for (int i=1; i<=4; i++) {
            //spaces
            for (int j=1; j<=4-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
