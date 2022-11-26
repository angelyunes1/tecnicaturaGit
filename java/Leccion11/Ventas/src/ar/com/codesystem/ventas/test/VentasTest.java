
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;



public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon",9500.0);
        Producto producto2 = new Producto("Campera",29900.0);
        Producto producto3 = new Producto("Remera",1900.0);
        Producto producto4 = new Producto("Medias",900.0);
        Producto producto5 = new Producto("Blusa",1900.0);
        Producto producto6 = new Producto("Sueter",11900.0);
        Producto producto7 = new Producto("Buzo",13900.0);
        Producto producto8 = new Producto("Botas",21900.0);
        Producto producto9 = new Producto("Zapatos",31900.0);
        Producto producto10 = new Producto("Zapatilla",51900.0);
        
     
        Orden orden1 = new Orden();
        //Agregamos productos a la orden
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        
        orden1.mostrarOrden();
        
        //Tarea 
        //Crear mas objetos de tipo  Producto
        Orden orden2 = new Orden();
        orden2.agregarProductos(producto5);
        orden2.agregarProductos(producto2);
        orden2.agregarProductos(producto1);
        orden2.agregarProductos(producto7);
        orden2.mostrarOrden();
        
        
        Orden orden3 = new Orden();
        orden3.agregarProductos(producto4);
        orden3.agregarProductos(producto3);
        orden3.agregarProductos(producto2);
        orden3.agregarProductos(producto9);
        orden3.mostrarOrden();
        
        Orden orden4 = new Orden();
        orden4.agregarProductos(producto10);
        orden4.agregarProductos(producto8);
        orden4.agregarProductos(producto6);
        orden4.mostrarOrden();
        
    }
}
