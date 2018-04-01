/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.panaderia.modelo;
import java.util.*;


/**
 *
 * @author Juan David Correa
 */
public class InventarioProductos {
    
    private ArrayList <Productos> productos;
    
    public InventarioProductos() {
    
    this.productos = new ArrayList();
}
     public boolean anadirProductos(Productos producto){
       productos.add(producto);
       return false;
     }
     
     
     public boolean eliminarxCodigo(String codigo){
       for (int i = 0; i < productos.size(); i++) {
         if(this.productos.equals(codigo)){
             productos.remove(i);
         } else {
         }  
         }
       
       return false;
    }
     
      public ArrayList <Productos> mostrarInventario(){
      return this.productos;
    }

   
    
}
