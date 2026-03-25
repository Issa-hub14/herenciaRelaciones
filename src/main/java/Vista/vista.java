/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author isabe
 */
import Modelo.Empleado;
import Modelo.Gerente;
import Controlador.NominaControlador;

public class vista {
    public static void main(String[] args){
        System.out.println("Aprendiendo herencia");
        NominaControlador control = new NominaControlador();
        
        //polimorfismo
        control.registrarEmpleados(new Empleado("edwin gallego", 1000));
        control.registrarEmpleados(new Gerente ("edwin gallego 2", 5000, 500));
        
        //listado de pagos
        System.out.println("== Listado de pagos ==");
        for (Empleado emp : control.obtenerLista()){
            //aqui es donde actua el polimorfismo cada objeto sabe como calcular su pago
        System.out.println("Nombre: " + emp.getNombre());
        System.out.println("Pago: $ " + emp.calcularPago());
        System.out.println("----------------------------------");
        
        //sobrecarga
        System.out.println("Prueba de sobrecarga");
        Empleado busqueda1 = control.buscar("edwin gallego");
        Empleado busqueda2 = control.buscar(1);
        
        System.out.println("Prueba de sobrecarga busqueda por nombre : "+(busqueda1 != null? busqueda1.getNombre(): "no existe"));
        System.out.println("Prueba de sobrecarga busqueda por indice : "+(busqueda2 != null? busqueda1.getNombre(): "no existe"));
        }
        
    }
}
