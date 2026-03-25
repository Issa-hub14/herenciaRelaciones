/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Empleado {
    protected String nombre;
    protected double salarioBase;
    
    public Empleado(String nombre, double salarioBase){
        this.nombre= nombre;
        this.salarioBase = salarioBase;
    }
    //método para que sea polimorfico
    public double calcularPago(){
        return salarioBase;
    }
    public String getNombre(){
        return nombre;
    }
    
}
