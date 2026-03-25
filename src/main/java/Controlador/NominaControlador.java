/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author isabe
 */
import Modelo.Empleado;
import Modelo.Gerente;
import java.util.ArrayList;
        
public class NominaControlador {
    private ArrayList<Empleado> listaEmpleados;
    
    //crear atributos
    public NominaControlador(){
        this.listaEmpleados = new ArrayList<>();
    }
    //registro de empleados
    public void registrarEmpleados(Empleado e){
        listaEmpleados.add(e);
        
    }
    //sobrecarga
    public Empleado buscar (String nombre){
        for (Empleado e : listaEmpleados){
            if (e.getNombre().equalsIgnoreCase(nombre)){
                return e;
            }
        }
        return null;
    }
    //sobrecarga: buscar por la posición de la lista
    public Empleado buscar (int indice){
       if (indice >= 0 && indice < listaEmpleados.size()){
           return listaEmpleados.get(indice);
       }
        return null;
    }
    
    public ArrayList<Empleado> obtenerLista(){
        return listaEmpleados;
    }
}
