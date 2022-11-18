/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico358;

/**
 *
 * @author HP
 */
public class main <T>{
    public static void main(String[] args) {
        TablaHash<String> hashh = new TablaHash<>(13);
        hashh.agregarValorHash(236, "José");
        hashh.agregarValorHash(526 , "A");
        hashh.agregarValorHash(313, "B");
        hashh.agregarValorHash(29, "C");
        hashh.agregarValorHash(187, "D");
        hashh.agregarValorHash(435, "E");
        
        hashh.valorDe(236).transversal();
        hashh.valorDe(526).transversal();
        for (int i = 0; i <hashh.getTamanio(); i++) {
            System.out.println("LLAVE "+i+", VALORES :");
            hashh.valorDe(i).transversal();
        }
        
        
    }
}
