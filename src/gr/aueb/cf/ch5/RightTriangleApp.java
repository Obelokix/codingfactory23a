package gr.aueb.cf.ch5;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Receives 3 values from user,
 * a, b, c where a is the longest
 * side.
 *
 * Checks if the triangle is right,
 * a^2 == b^2 + c^2
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;

        System.out.println("Please provide the sides of the triangle.");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a * a - b * b + c * c) <= EPSILON) {
            System.out.println("The triangle is right.");
        } else {
            System.out.println("The triangle is not right.");
        }
    }
}
