package javacollectionsp;
import java.util.Stack;
public class StackP <T>{//uso de genericos
    public static void main(String[] args) {
        Stack <String> miStack = new Stack<>();//creando el stack
        miStack.push("Tortilla1");//agregando al stack con push
        miStack.push("Tortilla2");
        miStack.push("Tortilla3");
        for (int i = 0; i <miStack.size(); i++) {//longitud del stack
            System.out.println(miStack.get(i));//obtener un objeto del stack
        }
        System.out.println("Hasta arriba está la: "+miStack.peek());//consultar el ultimo
        System.out.println("Agarrando la tortilla "+miStack.pop());//consultar y eliminar el ultimo
    }
    
}
