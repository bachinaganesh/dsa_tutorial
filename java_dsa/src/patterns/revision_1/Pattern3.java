package patterns.revision_1;

import java.util.Scanner;

/**
 
 * E
 * D E
 * C D E
 * B C D E
 * A B C D E
 
 */
public class Pattern3 {

    public static void displayPattern(int n) {
        for(int i=1; i<=n; i++) {
            int startValue = 65+n-i;
            for(int j=1; j<=i; j++) {
                System.out.print((char)startValue+" ");
                startValue += 1;
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
