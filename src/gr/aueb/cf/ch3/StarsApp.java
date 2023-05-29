package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Prints n stars horizontally where n
 * is an integer given by the user
 */

public class StarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 0;

        System.out.println("Please insert number of stars.");

        numberOfStars = in.nextInt();

        while (i <= numberOfStars) {
            System.out.print("*");
            i++;
            if (i % 50 == 0) {
                System.out.println();
            }
        }
    }
}
