package ex1_metodes;

/*
 * @author Joan Carcellé Obradors 
*/

public class TestUtils {

    // Make the constructor private so the user can't create an object of the class
    // since this is a Utils Class for Testing
    private TestUtils() {
    }

    private static final String PASS = "Pass!";
    private static final String FAIL = "Fail!";

    /**
     * Prints "Pass!" if the test was successful or "Fail!" is it wasn't
     * 
     * @param result   Result of the Method
     * @param expected Expected Result
     */
    public static void isValid(int result, int expected) {
        // Check if the result is the same as the expected result
        System.out.println((result == expected ? ConsoleColours.GREEN + PASS : ConsoleColours.RED + FAIL) + ConsoleColours.RESET);
    }

    /**
     * Prints "Pass!" if the test was successful or "Fail!" is it wasn't
     * 
     * @param result   Result of the Method
     * @param expected Expected Result
     */
    public static void isValid(double result, double expected) {
        // Check if the result is the same as the expected result
        System.out.println((result == expected ? ConsoleColours.GREEN + PASS : ConsoleColours.RED + FAIL) + ConsoleColours.RESET);
    }

    /**
     * Prints "Pass!" if the test was successful or "Fail!" is it wasn't
     * 
     * @param result   Result of the Method
     * @param expected Expected Result
     */
    public static void isValid(boolean result, boolean expected) {
        // Check if the result is the same as the expected result
        System.out.println((result == expected ? ConsoleColours.GREEN + PASS : ConsoleColours.RED + FAIL) + ConsoleColours.RESET);
    }

    /**
     * Prints "Pass!" if the test was successful or "Fail!" is it wasn't
     * 
     * @param result   Result of the Method
     * @param expected Expected Result
     */
    public static void isValid(String result, String expected) {
        // Check if the result is the same as the expected result
        System.out.println((result.equals(expected) ? ConsoleColours.GREEN + PASS : ConsoleColours.RED + FAIL) + ConsoleColours.RESET);
    }
}
