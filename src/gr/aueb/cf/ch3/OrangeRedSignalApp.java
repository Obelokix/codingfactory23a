package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * An aircraft has two fuel tanks.
 * If one of them has less than 1/4
 * then orange signal is on and if both
 * of the tanks have < 1/4 then red signal
 * is on.
 * The pilot (user) gives true or false
 * if tank < 1/4 or not, accordingly.
 */

public class OrangeRedSignalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1, tank2 are less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);
    }
}
