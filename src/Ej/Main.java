/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej;

/**
 *
 * @author Julieta Pilili
 */
public class Main {

    public static void main(String[] args) {
        
        Array array = new Array();
        
        try{
            array.arreglo();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ya no se pueden agregar mas numerso a la lista");
    }
        
    }
    
}
