package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if it is snowing or not, based on
 * not only on the temperature but if it is
 * raining. If it is raining and the temperature
 * is < 0 then it is snowing, if not then it isn't.
 */

public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if it is raining (true/false).");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature (int).");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
