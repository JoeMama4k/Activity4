package ex1_metodes;

import java.util.Random;

/**
 * Escriu una funció generarMatriuBinaria que retorni una matriu n per n
 * generada aleatòriament amb zeros i uns i una funció, mostrarMatriu que mostri
 * una matriu de dues dimensions.
 * 
 * Signatures de les funcions
 * public static int[][] generarMatriuBinaria(int dimensio)
 * public static void mostrarMatriu(int m[][])
 *
 * @author Joan Carcellé Obradors
 */

public class Metodes1_6 {

    private static final Random rand = new Random();
    public static void main(String[] args) {
        int[][] array = generarMatriuBinaria(5);
        mostrarMatriu(array);
    }

    /**
     * @param dimensio the length of the array
     * @return A 2D {@code array[dimensio][dimensio]}
     */
    public static int[][] generarMatriuBinaria(int dimensio) {
        // Initialize the new array
        int[][] newarray = new int[dimensio][dimensio];
        // Fill the new array
        for (int i = 0; i < dimensio; i++) {
            for (int j = 0; j < dimensio; j++) {
                // Assign the random number to the position
                newarray[i][j] = rand.nextInt(2);
            }
        }
        return newarray;
    }

    /**
     * Prints a 2D Array
     * @param m The {@code Array} to be printed
     */
    public static void mostrarMatriu(int[][] m) {
        // Display 2D Array
        System.out.print("Array: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m.length; j++) {
                if (j == m.length - 1)
                    System.out.print(m[i][j]);
                else
                    System.out.print(m[i][j] + ", ");
            }
            System.out.println(" ]");
            // Add space to match the format
            System.out.print("       ");
        }
    }

}


