package patterns.revision_1;

import java.util.Scanner;

/**
 
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********

 */
public class Pattern1 {

    public static void displayPattern(int n) {
        // upper half

        for(int i=1; i<=n; i++) {
            // stars
           for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
           }
        //    spaces
           for(int j=1; j<=2*i-2; j++) {
            System.out.print(" ");
           }
        //    stars
           for(int j=1; j<=n-i+1; j++) {
            System.out.print("*");
           }
           System.out.println();
        }

        // lower half

        for(int i=1; i<=n; i++) {
            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // spaces
            for(int j=1; j<=2*n-2*i; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the n value - ");
        n = scanner.nextInt();
        displayPattern(n);
    }
}
