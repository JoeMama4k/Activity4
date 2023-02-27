package ex1_metodes;

/**
 * Escriu un mètode sumaRang que calculi la suma dels nombres enters entre n i m
 * amb n i m inclosos. Comprova que dona resultats correctes amb les següents
 * entrades:
 *
 * Signatures de les funcions
 * public static int sumaRang(int limit1, int limit2)
 * (4, 7) -> 22
 * (-2, 5) -> 12
 * (-2, -5) -> -14
 * (-5, -2) -> -14
 * (7, 7) -> 14
 * (5, 2) -> 14
 *
 * @author Joan Carcellé Obradors
 */

public class Metodes1_1 {

    public static void main(String[] args) {
        testSumaRang();
    }

    /**
     * @param limit1 number range
     * @param limit2 number range
     * @return An {@code int} with the sum of all the numbers in the range and limit1 + limit2
     */
    private static int sumaRang(int limit1, int limit2) {
        
        // Checks if limit1 is equal to limit2. If so, it simply returns the sum of limit1 and limit2 
        // (in this case there is only one number in the range, so we sum limit1 + limit2).
        if (limit1 == limit2) {
            return limit1+limit2;
        }

        // Check which number is the lower bound of the range
        int lowerBound = (limit1 < limit2) ? limit1 : limit2;
        // Check which number is the upper bound of the range
        int upperBound = (limit1 > limit2) ? limit1 : limit2;

        // Calculate the sum of the numbers in the range using the formula for the sum of an arithmetic series
        return (upperBound - lowerBound + 1) * (lowerBound + upperBound) / 2;
    }

    // Test
    private static void testSumaRang() {
        int[] n1 = { 4, -2, -2, -5, 7, 5, -2, 1, 5 };
        int[] n2 = { 7, 5, -5, -2, 7, 2, 19, 6, 500 };
        int[] expected = { 22, 12, -14, -14, 14, 14, 187, 21, 125240 };
        int result = 0;
        // Tests
        for (int i = 0; i < expected.length; i++) {
            result = sumaRang(n1[i], n2[i]);
            System.out.printf("(%,d, %,d) -> %,d%n", n1[i], n2[i], result);
            TestUtils.isValid(result, expected[i]);
        }
    }
}
