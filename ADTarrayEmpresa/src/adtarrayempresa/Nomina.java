/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtarrayempresa;

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Nomina<T> {

    ArregloADT lineaComas = new ArregloADT(15);

    public Nomina(String ru) {

        String ruta = ru;
        ruta = "C:\\Users\\HP\\Documents\\NetBeansProjects\\ADTarrayEmpresa\\src\\adtarrayempresa\\junio.dat";
        //String [] splitter = new String [];
        try {
            FileReader archivo = new FileReader(ruta);
            BufferedReader bufferXD = new BufferedReader(archivo);
            String lineaString = "";
            while (lineaString != null) {
                lineaString = bufferXD.readLine();

                //ArregloADT lineaComas = new ArregloADT(lineaString.length());
                //String [] splitter= lineaString.split(",");
                System.out.println(lineaString);
                //System.out.println("---------"+lineaComas);
                lineaComas = new ArregloADT(lineaString.length());
            }
            //lineaComas = new ArregloADT(lineaString.length());
            int contador = 0;
            for (int i = 0; i < lineaString.length(); i++) {
                String[] splitter = lineaString.split(",");

                Empleado empTmp = new Empleado(Integer.valueOf(splitter[0]), Integer.valueOf(splitter[1]), Integer.valueOf(splitter[2]), splitter[3], splitter[4], splitter[5], Double.parseDouble(splitter[6]));
                //Empleado(int numTrabajador, int horasExtra, int anioIngreso, String nombre, String paterno, String materno, double sueldo_base)
                lineaComas.setItem(contador, empTmp);
                contador += 1;
            }

        } catch (FileNotFoundException e) {

            System.out.println("-Error 404 File not found");
        } catch (IOException ex) {
            Logger.getLogger(ADTarrayEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void listarSueldos() {
        for (int j = 0; j <= lineaComas.getLongitud(); j++) {
            Empleado emp = new Empleado();
            emp=(Empleado) lineaComas.getItem(j);
            System.out.println("---ID: "+emp.getNumTrabajador()+"---SUELDO:"+emp.calcularSueldo());
        }

    }
    public Object mayorAntiguedad (){
        int mayor=2023;
        int idx=0;
        for (int n=0;n<lineaComas.getLongitud();n++){
            Empleado emp = new Empleado();
            emp=(Empleado) lineaComas.getItem(n);
            if(emp.getAnioIngreso()<mayor){
                idx=n;
                mayor=emp.getAnioIngreso();
            }
        }
        return lineaComas.getItem(idx);
    }
    
}
