package patterns.revision_1;

import java.util.Scanner;

/**
 
 *****
 ****
 ***
 **
 *
 
 */
public class Pattern4 {

    public static void displayPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
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
