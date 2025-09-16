import java.util.*;

/**
 * Basic task (up to B+ level):
 * - Ask the user for a whole number x.
 * - Print whether x is EVEN or ODD.
 * - If x is exactly 0, also print "ZERO" on its own line.
 *
 * Moderate task (up to A level):
 * - Ask for a second whole number called total (a positive number).
 * - Compute x divided by total as a DECIMAL calculation.
 * * Example: if x = 37 and total = 90, print: "37/90 is 0.4111111111111111"
 * - If total <= 0, print an error message and skip the percentage.
 *
 * Challenge task (up to A+ level):
 * - If x < 0 or x > 100, print "Wrong number!".
 * - Otherwise:
 * Check to see if x is a prime number. A prime number less than
 * 100 should be divisible by itself and 1 but not by 2, 3, 5, or 7.
 * Print your results
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a whole number:");
        int x = Integer.valueOf(scanner.nextLine());
        if (x == 0) {
            System.out.println("ZERO");
        } else if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
        System.out.println("Give a second whole number:");
        int total = Integer.valueOf(scanner.nextLine());
        if (total <= 0) {
            System.out.println("Error");
        } else {
            System.out.println(x + "/" + total + " is " + (1.0 * x / total));

        }

        if (x < 0 || x > 100) {
            System.out.println("Wrong number!");
        } else if (x == 2 || x == 3 || x == 5 || x == 7) {
            System.out.println(x + " is a prime number.");
        } else if (x % 2 != 0 && x % 3 != 0 && x % 5 != 0 && x % 7 != 0) {
            System.out.println(x + " is a prime number.");
        } else {
            System.out.println(x + " is not a prime number.");
        }

    }
}