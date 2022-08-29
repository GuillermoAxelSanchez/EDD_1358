/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author HP
 */

class Box<T> { 
    
   private T item;
   
   public void putItem(T item) { 
      this.item = item;
   }
   public T getItem() { 
     return item;
   }
}
