package gr.aueb.cf.ch2;

/**
 *  Rolling two dice.
 */

public class RandomDiceApp {
    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;

        die1 = (int) (Math.random() * 6) + 1; // Cast applies only to the first part (Math...)
        die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("Die1: %d, Die2: %d", die1, die2);
    }
}
