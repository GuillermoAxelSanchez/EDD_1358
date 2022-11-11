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
public class Nodo<T> {

    private Nodo<T> siguiente;
    private T dato;

    public Nodo(T info, Nodo<T> sig) {
        this.dato = info;
        this.siguiente = sig;

    }

    public Nodo(T info) {
        this.dato = info;

    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        //return "Nodo{" + "siguiente=" + siguiente + ", dato=" + dato + '}';
        return "Dato=" + siguiente + "--" + dato + "--";
    }

    //public void Imprimir(Nodo <T> head){
    //    
    //    Nodo<Integer> tmp = new Nodo();
    //    
    //}
}
