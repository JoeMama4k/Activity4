package ex1_metodes;

/**
* Escriu el mètode min que retorni el mínim de tres números i el mètode mijana
* que retorni la mitjana aritmètica de tres números. Proporciona funcions de
* testeig pels mètodes anteriors. Segueix el diagrama proporcionat.
* 
* Signatures de les funcions
* public static double min(double x, double y, double z)
* public static double mitjana(double x, double y, double z)
*
* @author Joan Carcellé Obradors
*/

public class Metodes1_2 {
    public static void main(String[] args) {
        testMin();
        testMitjana();
    }

    /**
     * @return A {@code double} with the smallest number from the set of numerical values
     */
    public static double min(double x, double y, double z){
        // Find the smallest number using Math.min()
        return Math.min(Math.min(x, y), z);
    }


    /**
     * @return A {@code double} with the Arithmetic mean from the set of numerical values
     */
    public static double mitjana(double x, double y, double z){
        // Arithmetic mean: sum all the numbers and divide it by the amount of numbers
        return (x+y+z)/3;
    }

    // Tests

    // Test min Method
    private static void testMin() {
        System.out.println("\nMin Test:");

        double[] n1 = { 4.56, -2.2434, -234, 194745, 7, 5};
        double[] n2 = { 7, 5, 234, 1923543, 1923543, 5};
        double[] n3 = { 1.5, 5, -235, 254456, 86, 6};
        double[] expected = { 1.5, -2.2434, -235, 194745, 7, 5};
        double result = 0;

        // Tests
        for (int i = 0; i < expected.length; i++) {
            result = min(n1[i], n2[i], n3[i]);
            System.out.print("(" + n1[i] + ", " + n2[i]+ ", " + n3[i] + ") -> " + result + "\n"); // (num1, num2, num3) -> result
            TestUtils.isValid(result, expected[i]);
        }
    }

    // Test mitjana Method
    private static void testMitjana() {
        System.out.println("\nMitjana Test:");

        double[] n1 = { 4.56, -2.2434, -234, 194745, 7, -4934, 2723654};
        double[] n2 = { 7, 5, 234, 1923543, 1923543, 2354, 3781512};
        double[] n3 = { 1.5, 5, -235, 254456, 86, -354, -9201725};
        double[] expected = { 4.353333333333333, 2.5855333333333337, -78.33333333333333, 790914.6666666666, 641212, -978, -898853};
        double result = 0;

        // Tests
        for (int i = 0; i < expected.length; i++) {
            result = mitjana(n1[i], n2[i], n3[i]);
            System.out.print("(" + n1[i] + ", " + n2[i]+ ", " + n3[i] + ") -> " + result + "\n"); // (num1, num2, num3) -> result
            TestUtils.isValid(result, expected[i]);
        }
    }
}
