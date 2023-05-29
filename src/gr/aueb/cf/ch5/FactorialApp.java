package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates the factorial of n with
 * use of facto method
 */
public class FactorialApp {
    public static void main(String[] args) {
//        int factorial = facto(10);
//        System.out.println("The factorial of 10 is: " + factorial);
        Scanner in = new Scanner(System.in);
        int n;
        int result;

        System.out.println("Please result n (int)");
        n = in.nextInt();

        result = facto(n);
        System.out.printf("The factorial of %d is %d", n,result);
    }

    /**
     * Returns n!
     * @param n     the number (n) of n!.
     * @return      1 * 2 * 3 * ... * n.
     */
    public static int facto(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
