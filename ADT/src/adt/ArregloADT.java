/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class ArregloADT {
    private int tamanio;
    ArrayList<Box> datos;
    
    public ArregloADT(int tam){
        this.tamanio=tam;
        datos=new ArrayList();
        for (int i=0;i<tam;i++){
            datos.add(new Box());
        }
        
        
    }
    
    public Object getItem(int indice){
        if ((indice>=0)&&(indice<this.tamanio)){
            return datos.get(indice);
        }else {
            return null;
        }
    }
    public void setItem(int indice, Box e){
        if ((indice>=0)&&(indice<this.tamanio)){
           datos.set(indice, e);
        }
    }
    
    public int getLongitud(){
        
            return datos.size();
        
    }
    public void limpiar(int indice, Box e){
        if ((indice>=0)&&(indice<this.tamanio)){
            for (int i=0;i<tamanio;i++){
            datos.set(i, e);
            }
        }
    }
    
    public void aTexto(){
        System.out.print(datos+"\n");
    }
    
}
