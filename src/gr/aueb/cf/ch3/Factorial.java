package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the factorial of an integer
 * provided by the user.
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int i = 1;
        long factorial = 1L;
        int prevNum = 0;

        System.out.println("Please provide a number.");
        num = in.nextInt();


        while (i <= num) {
            factorial *= i;
            i++;
        }

        // System.out
    }
}
