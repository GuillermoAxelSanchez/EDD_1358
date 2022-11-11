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
    Cola cola1 = new Cola();
    cola1.aTextoC();
    cola1.enqueue("Alex");
    cola1.enqueue("Bertha");
    cola1.enqueue("Carlos");
    cola1.enqueue("Diana");
    cola1.aTextoC();
    cola1.dequeue();
    cola1.aTextoC();
    cola1.dequeue();
    cola1.aTextoC();
 
    
    }
}
