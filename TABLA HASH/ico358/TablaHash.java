/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico358;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TablaHash<T> {

    private int tamanio;
    private int key;
    private int valor;
    private ArregloADT<ListaLigada> tablaHash;

    public TablaHash() {
    }

    public TablaHash(int tamanio, int key, int valor, ArregloADT<ListaLigada> tablaHash) {
        this.tamanio = tamanio;
        this.key = key;
        this.valor = valor;
        this.tablaHash = tablaHash;
    }

    public TablaHash(int tamanio) {
        this.tamanio = tamanio;
        tablaHash = new ArregloADT<>(this.tamanio);
        for (int i = 0; i < this.tamanio; i++) {
            tablaHash.setItem(i, new ListaLigada());
        }
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarValorHash(int key, T valor) {
        this.tablaHash.getItem(this.funcionHash(key)).agregarAlFinal(valor);

    }

    public ListaLigada valorDe(int CalcularFuncionHash) {
        return this.tablaHash.getItem(this.funcionHash(CalcularFuncionHash));

    }

    public void removerValor(int key, int indice) {
        this.tablaHash.getItem(key).eliminarPosicion(indice);
        this.tamanio--;

    }

    public void removerValorer(int key) {
        this.tablaHash.setItem(this.funcionHash(key), null);
        this.tamanio--;
    }

    public int funcionHash(int preHash) {

        int llave = preHash % this.tamanio;

        return llave;

    }

}
