/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtarrayempresa;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class ArregloADT <T> {
    private int tamanio;
    ArrayList<T> datos;
    
    public ArregloADT(int tam){
        this.tamanio=tam;
        datos=new ArrayList();
        for (int i=0;i<tam;i++){
            this.datos.add(null);
        }
        
        
    }
    
    public T getItem(int indice){
        if ((indice>=0)&&(indice<this.tamanio)){
            return this.datos.get(indice);
        }else {
            System.out.println("Fuera del rango");
            
        }return null;
    }
    public void setItem(int indice, T e){
        if ((indice>=0)&&(indice<this.tamanio)){
           this.datos.set(indice, e);
        }else{
            System.out.println("Fuera de rango");
        }
    }
    
    public int getLongitud(){
        
            return this.tamanio;
        
    }
    public void limpiar(int indice, T e){
        if ((indice>=0)&&(indice<this.tamanio)){
            for (int i=0;i<tamanio;i++){
            this.datos.set(i, e);
            }
        }
    }
    
    public String aTexto(){
        String estado = "------------- "+this.tamanio+" -------------\n";
        for (T dato : datos) {
            if(dato != null){
                estado += dato.toString()+"\n";
            }
        }
        return estado;
    }
    
}
