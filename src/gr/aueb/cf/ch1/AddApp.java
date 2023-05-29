package gr.aueb.cf.ch1;

/**
 * Adds two integers
 * and outputs the result
 * in stdout
 */
public class AddApp {
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 10;
        int num2 = 7;
        int result = 0;


        // Commands
        result = num1 + num2;


        // Print results
        System.out.println("The result is: " + result);
        System.out.printf("The result of %d, %d is %d", num1, num2, result); // printf is preferable if we have Strings and arithmetic values. -> f is for formatting
    }
}
