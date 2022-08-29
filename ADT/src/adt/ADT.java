/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author GUILLERMO AXEL SANCHEZ OJEDA 1358
 */
public class ADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloADT array = new ArregloADT(4);
        System.out.print(array.getLongitud()+"\n");
        Box tipo=new Box();
        tipo.putItem("Hola");
        array.setItem(0,tipo);
        array.getItem(0);
        array.aTexto();
        array.limpiar(0, tipo);
        array.aTexto();
        
        
    }
    
}
