/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdoblementeligadas;

/**
 *
 * @author HP
 */
public class NodoDoble<T> {

    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;
    private T dato;

    public NodoDoble() {
    }

    public NodoDoble(NodoDoble<T> siguiente, NodoDoble<T> anterior, T dato) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.dato = dato;
    }

    public NodoDoble(T dato) {

        this.dato = dato;
    }

    public NodoDoble(T dato, NodoDoble<T> siguiente) {
        this.siguiente = siguiente;

        this.dato = dato;
    }

    public NodoDoble(NodoDoble<T> anterior, T dato) {

        this.anterior = anterior;
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "NodoDoble{" + "siguiente=" + siguiente + ", anterior=" + anterior + ", dato=" + dato + '}';
    }
    
    
    
}
