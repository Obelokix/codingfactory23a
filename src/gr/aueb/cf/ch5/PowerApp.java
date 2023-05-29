package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates a^n.
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please provide an integer and the power you like to calculate.");
        int a = in.nextInt();
        int n = in.nextInt();
        int result = pow(a, n);

        System.out.printf("The power %d of %d is %d", a, n, result);
    }

    /**
     * Returns the power of an integer
     * @param a     the base
     * @param n     the power to raise.
     * @return      the power of a^n
     */
    public static int pow(int a, int n) {
        for (int i = 1; i < n; i++) {
            a = a * a;
            System.out.println(a);
        }
        return a;
    }
}
