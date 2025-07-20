package patterns.revision_1;

import java.util.Scanner;

/**
 * 5 5 5 5 5 5 5 5 5
 * 5 4 4 4 4 4 4 4 5
 * 5 4 3 3 3 3 3 4 5
 * 5 4 3 2 2 2 3 4 5
 * 5 4 3 2 1 2 3 4 5
 * 5 4 3 2 2 2 3 4 5
 * 5 4 3 3 3 3 3 4 5
 * 5 4 4 4 4 4 4 4 5
 * 5 5 5 5 5 5 5 5 5
 */
public class Pattern6 {

    public static void displayPattern(int n) {
        for(int i=1; i<=2*n-1; i++) {
            for(int j=1; j<=2*n-1; j++) {
                int left = j;
                int right = 2*n-j;
                int top = i;
                int bottom = 2*n-i;
                int horMin = Math.min(left, right);
                int verMin = Math.min(top, bottom);
                int minValue = Math.min(horMin, verMin);
                System.out.print(n - minValue+1+" ");
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
