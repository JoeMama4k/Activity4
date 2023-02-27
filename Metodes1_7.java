package ex1_metodes;


/**
 * Escriu un mètode equals que determini si dues matrius tenen els mateixos
 * elements en el mateix ordre. Proporciona funcions de testeig pels mètodes
 * anteriors.
 * 
 * Signatures de les funcions
 * public static boolean equals(int[] a, int[] b)
 * 
 * @author Joan Carcellé Obradors
 */

public class Metodes1_7 {
    public static void main(String[] args) {
        testEquals();
    }

    public static void testEquals() {
        System.out.println("\nEquals Test:");

        // Test 1
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        boolean expected = true;
        boolean result = equals(array1, array2);
        printResult(result);
        TestUtils.isValid(result, expected);
        // Test 2
        int[] array3 = { 1, 1, 3, 4, 5, 6, 7, 8 };
        int[] array4 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        expected = false;
        result = equals(array3, array4);
        printResult(result);
        TestUtils.isValid(result, expected);

        // Test 3
        int[] array5 = { 1, 1, 3, 4, 5, 6, 4, 8 };
        int[] array6 = { 1, 2, 3, 4, 5, 7, 8 };
        expected = false;
        result = equals(array5, array6);
        printResult(result);
        TestUtils.isValid(result, expected);

        // Test 4
        int[] array7 = { 1, 1, 1, 1 };
        int[] array8 = { 1, 1, 1, 1 };
        expected = true;
        result = equals(array7, array8);
        printResult(result);
        TestUtils.isValid(result, expected);
    }

     /**
   * @param a one array to be tested for equality
   * @param b the other array to be tested for equality
   * @return {@code true} if the arrays are equal
   */
  public static boolean equals(int[] a, int[] b) {
    // Check if the arrays are null or have different lengths
    if (a == null || b == null || a.length != b.length) {
      return false;
    }

    // Compare the elements of the arrays
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }

    // The arrays are equal
    return true;
  }

    public static void printResult(boolean result){
        System.out.println(result ? "Same" : "Different");
    }
}
