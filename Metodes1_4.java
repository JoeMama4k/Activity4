package ex1_metodes;

/**
* Escriu el mètode primerDigit que retorna el primer dígit de l’argument, el
* mètode ultimDigit que retorna l'últim digit de l’argument i el mètode
* contaDigits que retorna el nombre de dígits de l’argument. Proporciona
* funcions de testeig pels mètodes anteriors. Segueix el diagrama proporcionat.
* 
* Signatures de les funcions
* public static int primerDigit(int n)
* public static int ultimDigit(int n)
* public static int contaDigits(int n)
*
* @author Joan Carcellé Obradors
*/

public class Metodes1_4 {
    public static void main(String[] args) {

        
        testPrimerDigit();
        testUltimDigit();
        testContaDigits();
    }

    // Test primerDigit Method
    private static void testPrimerDigit() {
        System.out.println("\nPrimerDigit Test:");

        int[] num = { 4, -225, 846126, -6515, 728943, -9255, -6721, 1452 };
        int[] expected = { 4, -2, 8, -6, 7, -9, -6, 1 };
        int result = 0;
        // Tests
        for (int i = 0; i < expected.length; i++) {
            result = primerDigit(num[i]);
            System.out.printf("(%d) -> %d%n", num[i], result);
            TestUtils.isValid(result, expected[i]);
        }
    }

    // Test ultimDigit Method
    private static void testUltimDigit() {
        System.out.println("\nUltimDigit Test:");

        int[] num = { 4, -225, 846126, -6515, 728943, -9255, -6721, 1452 };
        int[] expected = { 4, -5, 6, -5, 3, -5, -1, 2 };
        int result = 0;
        // Tests
        for (int i = 0; i < expected.length; i++) {
            result = ultimDigit(num[i]);
            System.out.printf("(%d) -> %d%n", num[i], result);
            TestUtils.isValid(result, expected[i]);
        }
    }

    // Test contaDigits Method
    private static void testContaDigits() {
        System.out.println("\nContaDigits Test:");

        int[] num = { 4, -225, 846126, -6515, 728943, -9255, -6734212, 14241552 };
        int[] expected = { 1, 3, 6, 4, 6, 4, 7, 8 };
        int result = 0;
        // Tests
        for (int i = 0; i < expected.length; i++) {
            result = contaDigits(num[i]);
            System.out.printf("(%d) -> %d%n", num[i], result);
            TestUtils.isValid(result, expected[i]);
        }
    }

    /**
     * Gets the first digit of a number
     * @param n {@code int} Number
     * @return An {@code int} with the first digit of the number
     */
    public static int primerDigit(int n) {
        // Get the first digit of the number by taking the remainder when
        // dividing it by 10 and then dividing the result by 10 until the
        // number is less than 10 in absolute value.

        while (Math.abs(n) >= 10) {
            n /= 10;
        }

        return n;
    }

    /**
     * Gets the last digit of a number
     * @param n {@code int} Number
     * @return An {@code int} with the last digit of the number
     */
    public static int ultimDigit(int n) {
        // Get the last digit of the number by taking the remainder when
        // dividing it by 10.

        return n % 10;
    }

    /**
     * Counts the amount of digits a number has
     * @param n {@code int} Number
     * @return An {@code int} with the length of the number
     */
    public static int contaDigits(int n) {
        // Count the number of digits in the number by taking the base-10
        // logarithm of the number, and then taking the ceiling of the result.

        return (int) Math.ceil(Math.log10(Math.abs(n)));
    }
    
}
