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
public class Empleado {
    final double HORA_EXTRA = 276.5;
    private int numTrabajador;    
    private int horasExtra;   
    private int anioIngreso;
    private String nombre;   
    private String paterno;
    private String materno;
    private double sueldo_base;
    private int antiguedad;
    
    public Empleado() {
    }

    public Empleado(int numTrabajador, int horasExtra, int anioIngreso, String nombre, String paterno, String materno, double sueldo_base) {
        this.numTrabajador = numTrabajador;
        this.horasExtra = horasExtra;
        this.anioIngreso = anioIngreso;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldo_base = sueldo_base;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numTrabajador=" + numTrabajador + ", horasExtra=" + horasExtra + ", anioIngreso=" + anioIngreso + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", sueldo_base=" + sueldo_base + '}';
    }
    
    public int getAntiguedad(){
        antiguedad=2022-this.anioIngreso;
        return antiguedad;
    }
    public double calcularSueldo(){
        double sueldoTotal=sueldo_base+((this.getAntiguedad())*0.03+(this.getHorasExtra()*HORA_EXTRA));
    return sueldoTotal;
    }
    
}
