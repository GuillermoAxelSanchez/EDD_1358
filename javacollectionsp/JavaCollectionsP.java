package javacollectionsp;
import java.util.ArrayList;
public class JavaCollectionsP <T>{               //uso de genericos
    public static void main(String[] args) {
        ArrayList nombre = new ArrayList();      //crea un ArrayList
        nombre.add("Guillermo");                 //Agrrega un nombre con Add
        nombre.add("Axel");                      //Agrega otro nombre
        nombre.add("Sanchez");                   //Agrega un apellido
        nombre.add("Ojeda");                     //Agrega otro apellido
        for (int i = 0; i < nombre.size(); i++) {//uso del metodo size
            System.out.print(nombre.get(i)+" "); //uso del método get         
        }
        System.out.println("\n");
        nombre.remove(1);                        //uso del método remove
        for (int i = 0; i < nombre.size(); i++) {//uso del metodo size
            System.out.print(nombre.get(i)+" "); //uso del método get         
        }
        System.out.println("\n");
    }
}
