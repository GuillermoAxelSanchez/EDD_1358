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
public class ListaLigada<T> {

    private Nodo<T> head;
    private int tamanio = 0;

    public ListaLigada() {
        this.head = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return this.head == null;

    }

    public int getTamanio() {
        int contador = 0;
        Nodo curr = this.head;
        if (this.estaVacia()) {
            tamanio = 0;
        } else {
            while (curr != null) {
                contador += 1;
                curr = curr.getSiguiente();
            }

        }
        tamanio = contador;
        return tamanio;

    }

    public void agregarAlFinal(T valor) {
        Nodo nodoFinal = new Nodo(valor);
        Nodo aux = this.head;
        if (head == null) {
            head = nodoFinal;
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodoFinal);
        }
    }

    public void agregarAlInicio(T valor) {
        Nodo nodoInicio = new Nodo(valor);
        if (this.estaVacia()) {
            this.head = nodoInicio;
        } else {
            Nodo aux = this.head;
            nodoInicio.setSiguiente(aux);
            head = nodoInicio;
        }
    }

    public void agregarDespuesDe(int posicion, T valor) {
        if (posicion <= this.getTamanio() && posicion >= 0) {

            Nodo nuevo = new Nodo(valor);
            Nodo curr = this.head;

            if (this.estaVacia() || posicion == 0) {
                System.out.println("\nAgregando: " + nuevo.getDato() + " Antes de " + curr.getDato());
                nuevo.setSiguiente(curr);
                this.head = nuevo;
            } else {
                for (int j = 1; j < posicion; j++) {
                    curr = curr.getSiguiente();
                }
                System.out.println("\nAgregando: " + nuevo.getDato() + " Despues de " + curr.getDato());
                nuevo.setSiguiente(curr.getSiguiente());
                curr.setSiguiente(nuevo);
            }
        } else {
            System.out.println("La posición no existe en la lista ligada");
        }
    }

    public void eliminarPosicion(int posicion) {
        Nodo borrar = this.head;
        if (posicion == 1) {

            System.out.println("\nBORRARNDO: " + borrar.getDato());

            this.head = borrar.getSiguiente();
        } else {

            if (posicion <= this.getTamanio() && posicion > 0) {

                //Nodo curr = this.head;
                for (int i = 0; i < posicion - 2; i++) {
                    borrar = borrar.getSiguiente();
                }

                System.out.println("\nBORRANDO: " + borrar.getSiguiente().getDato());
                borrar.setSiguiente(borrar.getSiguiente().getSiguiente());

            } else {
                System.out.println("\nLa posición no existe en la lista ligada");
            }
        }

    }

    public void eliminarPrimero() {
        System.out.println("\nBORRANDO: " + head.getDato());
        Nodo aux = this.head;
        this.head = aux.getSiguiente();
    }

    public void eliminarFinal() {
        Nodo curr = this.head;
        while (curr.getSiguiente().getSiguiente() != null) {
            curr = curr.getSiguiente();
        }
        System.out.println("\n BORRANDO: " + curr.getSiguiente().getDato());
        curr.setSiguiente(null);
    }

    public void buscarPosiciones(T valor) {
        int posicion = 0;
        Nodo curr = this.head;
        for (int i = 1; i <= this.getTamanio(); i++) {
            if (curr.getDato() == valor) {

                System.out.println("\nVALOR " + curr.getDato() + " EN LA POSICION: " + i);
                curr = curr.getSiguiente();
            } else {
                curr = curr.getSiguiente();
            }
        }

    }

    public int buscarPosicion(T valor) {

        Nodo curr = this.head;
        for (int i = 1; i <= this.getTamanio(); i++) {
            if (curr.getDato() == valor) {

                return i;
            } else {
                curr = curr.getSiguiente();
            }
        }

        return 0;
    }

    public void actualizar(T buscar, T reemplazar) {
        Nodo curr = this.head;
        Boolean encontrado = false;
        System.out.println("\n Reemplazando " + buscar + " Por " + reemplazar + "...");
        for (int i = 1; i <= this.getTamanio(); i++) {
            if (curr.getDato() == buscar) {
                encontrado = true;
                System.out.println("\nVALOR " + curr.getDato() + " REMPLAZADO POR " + reemplazar + "  c:");
                curr.setDato(reemplazar);

                curr = curr.getSiguiente();
            } else {
                curr = curr.getSiguiente();
            }
        }
        if (encontrado == false) {

            System.out.println("NADA POR REEMPLAZAR  :c");
        }

    }
    
    public T getPrimero(){
    
    return (T)this.head;
    
    }
    
    public void transversal() {
        Nodo aux = head;
        if (aux == null) {
            System.out.println("\nLista Vacía o Nula");
        } else {
            System.out.println();
            while (aux.getSiguiente() != null) {
                System.out.print("-" + aux.getDato() + "-");
                aux = aux.getSiguiente();
            }
            System.out.print("-" + aux.getDato() + "-");

        }

    }

}
