package javacollectionsp;
import java.util.LinkedList;
public class LinkedListP<T> {  //uso de genericos             
    public static void main(String[] args) {
        LinkedList<String> meses = new LinkedList<>();//nueva lista ligada
        meses.add("enero");//agregar a la lista método add
        meses.add("febrero");//agregar a la lista
        meses.add("marzo");//agregar a la lista
        System.out.println(meses.getFirst()); //obtener el primero
        System.out.println(meses.getLast());// obtener el ultimo
        meses.addLast("abril");//agregar al final
        meses.addLast("mayo");//agregar al final
        for (int i = 0; i < meses.size(); i++) {//método .size para tamaño
            System.out.print(meses.get(i) +" ");//obtener index
        }
        System.out.println("");
        meses.remove();//eliminar el primero (head)
         for (int i = 0; i < meses.size(); i++) {//bucle for para imprimir
            System.out.print(meses.get(i) +" ");
        }
        System.out.println("");
    }
}
