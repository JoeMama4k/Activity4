package ex1_metodes;

/**
 * Escriu el mètode caractersCentrals que retorna una cadena amb el caràcter
 * central de l’argument si la longitud és senar i retorna els dos caràcters
 * centrals si la longitud de l’argument és parell.
 * 
 * Signatures de les funcions
 * public static String caractersCentrals(String str)
 *
 * @author Joan Carcellé Obradors
 */

public class Metodes1_5 {
    public static void main(String[] args) {
        testCaractersCentrals();
    }


     // Test caractersCentrals Method
     private static void testCaractersCentrals() {
        System.out.println("\nCaractersCentrals Test:");

        String[] words = { "Hello", "UwU", "Revengefully", "Helicopter", "Harmony", "Surround", "Banquet", "Superintendent"};
        String[] expected = { "l", "w", "ge", "co", "m", "ro", "q", "nt"};
        String result;
        // Tests
        for (int i = 0; i < expected.length; i++) {
            result = caractersCentrals(words[i]);
            System.out.printf("\"%s\" -> %s%n", words[i], result);
            TestUtils.isValid(result, expected[i]);
        }
    }


    /**
     * @param str the {@code String} to be checked
     * @return A {@code String} with the characters in the middle of str
     */
    public static String caractersCentrals(String str) {
        int len = str.length();
        int mid = len / 2;
        if (len % 2 == 0) {
            // If the length is even return the middle one and the next one following
            return str.substring(mid - 1, mid + 1);
        } else {
            // If the length is uneven return the middle character
            return str.substring(mid, mid + 1);
        }
    }
}
