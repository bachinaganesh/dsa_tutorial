package patterns.revision_1;

import java.util.Scanner;

/**
 
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 
 */
public class Pattern7 {
    public static void displayPattern(int n) {
        for(int i=1; i<=2*n-1; i++) {
            if(i<=n) {
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                for(int j=1; j<=2*n-2*i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            else {
                for(int j=1; j<=2*n-i; j++) {
                    System.out.print("*");
                }
                for(int j=1; j<=2*i-2*n; j++) {
                    System.out.print(" ");
                }
                for(int j=1; j<=2*n-i; j++) {
                    System.out.print("*");
                }
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
