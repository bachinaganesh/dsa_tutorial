package patterns.revision_1;

import java.util.Scanner;

// TODO: Careful this pattern
/**
 * 
 *     A
 *    ABA
 *   ABCBA
 *  ABCDCBA
 * ABCDEDCBA
 * 
 */
public class Pattern5 {
    public static void displayPattern(int n) {
        for(int i=1; i<=n; i++) {
            int baseIndex = 64;
            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            int value = 0;
            for(int j=1; j<=2*i-1; j++) {
               if(j <= i) {
                value += 1;
               }
               else {
                value -= 1;
               }
               System.out.print((char)(baseIndex+value));
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
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
