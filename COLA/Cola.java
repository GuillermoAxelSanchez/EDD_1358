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
public class Cola<T> {

    private ListaLigada<T> cola;
    private int longitud = 0;

    public Cola() {
        cola = new ListaLigada<>();
    }

    public boolean isEmpy() {
        return (this.cola.estaVacia());
    }

    public int getLongitudB() {
        return this.cola.getTamanio();
    }

    public void enqueue(T elemento) {

        this.cola.agregarAlFinal(elemento);

    }

    public T dequeue() {
        T aux = this.cola.getPrimero();
        this.cola.eliminarPrimero();
        return aux;

    }

    public void aTextoC() {

        this.cola.transversal();

    }
}
