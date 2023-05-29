package gr.aueb.cf.ch2;

import com.sun.source.util.DocTreePathScanner;

import java.util.Scanner;

/**
 * Converts euros to US dollar.
 * Requires from user (stdin)
 * an integer which symbolizes
 * the amount to Euros and converts
 * in dollars
 */

public class EuroToUsConverterApp {

    public static void main(String[] args) {
        // Declare and initialize
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        // Commands
        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();


        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        // Print results
        System.out.printf("%d Euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
