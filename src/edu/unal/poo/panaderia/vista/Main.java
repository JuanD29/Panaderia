/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.panaderia.vista;
import java.util.*;
import edu.unal.poo.panaderia.modelo.InventarioProductos;
import edu.unal.poo.panaderia.modelo.Productos;
/**
 *
 * @author Juan David Correa
 */
public class Main {

    public static int selecionarOpcion(){
       Scanner teclado = new Scanner(System.in);
       int opcion; 
       System.out.println("Presione: ");
       System.out.println("1.Ingresar Producto\n2.Añadir Promoción\n3.Añadir ventas al por mayor");
       System.out.println("\n4.Visualizar Ganancias\n 5.Visualizar Inventario \n6.Modificar precios\n 7.Eliminar Producto \n8 Salir");
       opcion = teclado.nextInt();
       return opcion;  
    }
    public static void main(String[] args) {
         int opcion;
         Scanner teclado = new Scanner(System.in);
         InventarioProductos inventario = new InventarioProductos();
         do{
            opcion = selecionarOpcion();
            switch(opcion){
                case 1 : 
                     //Ingresar Producto
                    System.out.println("Ingresar Nombre del Producto");
                    String nombre = teclado.next();
                    System.out.println("Ingresar Codigo del Producto");
                    String codigo = teclado.next();
                    System.out.println("Ingresar Cantidad del Producto");
                    int cantidad = teclado.nextInt();
                    Productos producto = new Productos(nombre, codigo,cantidad);
                
                    
                    boolean resultado = inventario.anadirProductos(producto);
                    if(resultado == true){
                        System.out.println("Ingreso exitoso");
                    }else{
                        System.out.println("Problema al realizar la insercion");
                    }
                    break;
                    
                case 2 : 
                      
                
                case 3 : 
                    
                case 4 : 
                     
                case 5 : 
                    ArrayList <Productos> mostrar = inventario.mostrarInventario();
                     for (int i = 0; i < mostrar.size(); i++) {
                         if(mostrar(i)!=null){
                             System.out.println(mostrar(i).getNombre());
                         }
                    }
                      break;
                     
                case 6 : 
                      
                    
                case 7 : 
                     //Eliminar Producto por codigo
                     System.out.println("Ingrese codigo del producto");
                      codigo = teclado.next();
                      resultado = inventario.eliminarxCodigo(codigo);
                      if(resultado == true){
                          System.out.println("Producto eliminado satisfactoriamente");
                      }else{
                          System.out.println("No se ha podido eliminar el producto");
                      }
                      break;
               
               default:
                   break;
            
            }
            
         }while(opcion != 8);
    
         }
}
