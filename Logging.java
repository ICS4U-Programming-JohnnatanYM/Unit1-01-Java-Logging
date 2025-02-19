import java.util.Scanner;

/**
 * The program asks the user for the the length of the logs, then displays
 * to the user how many of those logs the truck can carry.
 *
 * @author Johnnatan Yasin Medina
 * @version 1.0
 * @since 2025-02-12
 */

public final class Logging {
        /**
     * This is to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Logging() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Main Method.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        //Asking user for input
        System.out.println("Welcome, length must be 0.25m, 0.5m, or 1m. ");
        System.out.print("**Logs must all be the same size, ");
        System.out.println("Truck capacity is 1100kg.**");
        System.out.print("Enter the log length in meters: ");

        //Using Scanner for input
        final Scanner scanner = new Scanner(System.in);
        final String strLogLength = scanner.nextLine();

    //try..catch
        try {
            final float flLogLength = Float.parseFloat(strLogLength);
        //Write "if"s
        if (flLogLength < 0) {
            System.out.println("The length of the logs cannot be negative.");

            //Calculate for quarter log length
            } else if (flLogLength == 0.25) {
                final float quarterLog = (1100f / (20 * flLogLength));
                //Display Log amount
                System.out.print("The amount of logs the truck can carry ");
                System.out.print("with log length, ");
                System.out.print(strLogLength + "m, is ");
                System.out.println(quarterLog + ".");

            //Calculate the half log length
            } else if (flLogLength == 0.50) {
                final float halfLog = (1100f / (20 * flLogLength));
                //Display Log amount
                System.out.print("The amount of logs the truck can carry ");
                System.out.print("with log length, ");
                System.out.print(strLogLength + "m, is ");
                System.out.println(halfLog + ".");
            //Calculate full log length
            } else if (flLogLength == 1) {
                final float fullLog = (1100f / (20f * flLogLength));
                //Display Log amount
                System.out.print("The amount of logs the truck can carry ");
                System.out.print("with log length, ");
                System.out.print(strLogLength + "m, is ");
                System.out.println(fullLog + ".");
            //If not one of these values, write number not valid
             } else {
                System.out.print("The number you have entered is invalid. ");
                System.out.println("Please try again.");
            }
        //For string answers, or non numeric inputs
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid log length. "
                + error.getMessage());
        }
    }
}
