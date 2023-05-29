package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Finds the square and cube
 * of an integer that users provide
 */

public class MathPowersApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num (int)");
        inputNum = in.nextInt();

        System.out.printf("num: %d, square: %d, cude: %d", inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum, 3));
    }
}
