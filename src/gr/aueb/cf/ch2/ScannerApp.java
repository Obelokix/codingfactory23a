package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Reads from std input (keyboard)
 * 2 integers and adds them
 */
public class ScannerApp {
    public static void main(String[] args) {
        // Declare and initialize vars
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Commands
        System.out.println("Please insert two ints.");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        // Print result
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
}
