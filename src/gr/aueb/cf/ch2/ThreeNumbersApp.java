package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Expects 3 integers from user,
 * subtracts 1 from them and it
 * outputs them in the same order
 * they were given with one space
 * between them
 */
public class ThreeNumbersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert three integers.");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.printf("%d %d %d", num1, num2, num3);
    }
}
