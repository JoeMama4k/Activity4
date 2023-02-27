package ex1_metodes;

/**
* Escriu el mètode totsIguals que indica si tres números són iguals o no, el
* mètode totsDiferents que indica si tres números són tots diferents i el
* mètode estanOrdenats que indica tres números estan ordenats de menor a major.
* Proporciona funcions de testeig pels mètodes anteriors. Segueix el diagrama
* proporcionat.
* 
* Signatures de les funcions
* public static boolean totsIguals(double x, double y, double z)
* public static boolean totsDiferents(double x, double y, double z)
* public static boolean estanOrdenats(double x, double y, double z)
*
* @author Joan Carcellé Obradors
*/

public class Metodes1_3 {
    public static void main(String[] args) {
        testTotsIguals();
        testTotsDiferents();
        testEstanOrdenats();
    }

    // Test totsIguals Method
    private static void testTotsIguals() {
        System.out.println("\nTotsIguals Test:");

        double[] n1 = { 4, 5, 234, 254456, 86, 78231428, 2, 768128901 };
        double[] n2 = { 7, 5, 234, 254456, 86, 782314248, 2, 768121901};
        double[] n3 = { 1.5, 5, -234, 254456, 86, 781231428, 2, 765128901 };
        boolean[] expected = { false, true, false, true, true , false , true , false };
        boolean result;

        // Tests
        for (int i = 0; i < expected.length; i++) {
            result = totsIguals(n1[i], n2[i], n3[i]);
            System.out.print("(" + n1[i] + ", " + n2[i] + ", " + n3[i] + ") -> " + (result ? "Same" : "Different") + "\n"); // (num1, num2, num3) -> result
            TestUtils.isValid(result, expected[i]);
        }
    }

    // Test totsDiferents Method
    private static void testTotsDiferents() {
        System.out.println("\nTotsDiferents Test:");

        double[] n1 = { 4, 5, 234, 254456, 86, 7831428, 2215, 768128901 };
        double[] n2 = { 7, 5, 234, 254456, 86, 78231448, 298, 768121901};
        double[] n3 = { 1.5, 5, -234, 254456, 86, 78231428, 32, 765128901 };
        boolean[] expected = { true, false, false, false, false , true , true , true };
        boolean result;

        // Tests
        for (int i = 0; i < expected.length; i++) {
            result = totsDiferents(n1[i], n2[i], n3[i]);
            System.out.print("(" + n1[i] + ", " + n2[i] + ", " + n3[i] + ") -> " + (result ? "All Different" : "Not All Different") + "\n"); // (num1, num2, num3) -> result
            TestUtils.isValid(result, expected[i]);
        }
    }

    // Test estanOrdenats Method
    private static void testEstanOrdenats() {
        System.out.println("\nEstanOrdenats Test:");

        double[] n1 = { 1, 5, 234, 254456, 8316, 7831428, 2215, 768128901 };
        double[] n2 = { 7, 5, 234, 2542456, 8426, 78231448, 298, 768121901};
        double[] n3 = { 9, 5, -234, 24456, 8546, 78231428, 32, 765128901 };
        boolean[] expected = { true, true, false, false, true , false , false , false };
        boolean result;

        // Tests
        for (int i = 0; i < expected.length; i++) {
            result = estanOrdenats(n1[i], n2[i], n3[i]);
            System.out.print("(" + n1[i] + ", " + n2[i] + ", " + n3[i] + ") -> " + (result ? "Sorted" : "Not Sorted") + "\n"); // (num1, num2, num3) -> result
            TestUtils.isValid(result, expected[i]);
        }
    }
    
    /**
     * Checks if the given numbers are the same
     * @return {@code true} if all the numbers are the same
     */
    private static boolean totsIguals(double x, double y, double z) {
        return (x == y && y == z);
    }

    /**
     * Checks if the given numbers are different from each other
     * @return {@code true} if all the numbers are different
     */
    private static boolean totsDiferents(double x, double y, double z) {
        return (x != y && y != z);
    }

    /**
     * Checks the order of the given numbers
     * @return {@code true} if the numbers are sorted from smaller to bigger numbers
     */
    private static boolean estanOrdenats(double x, double y, double z) {
        return (x <= y && y <= z);
    }
}
