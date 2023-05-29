package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if it is snowing according
 * to current temperature. If temperature
 * is < 0, then is snowing, otherwise not.
 * User gives the temperature.
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert current temperature.");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
