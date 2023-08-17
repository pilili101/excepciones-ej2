/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package Ej;

/**
 *
 * @author Julieta Pilili
 */
public class Array {

    public void arreglo() throws ArrayIndexOutOfBoundsException {

        int[] nums = new int[2];
        nums[0] = 11;
        nums[1] = 22;

        System.out.println("La posicion 2 es "+nums[2]);

    }

}
