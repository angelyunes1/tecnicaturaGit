
package ar.com.codesystem.ventas;


public class Producto {
    //Atributos de la clase
    private String nombre;
    private int idProcuto;
    private double precio;
    private static int contadorProductos;
    
    //Constructor vacio
    
    private Producto(){
        this.idProcuto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre,double precio){
        this();//Llamamos al constructor vacio
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdProcuto() {
        return idProcuto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", idProcuto=" + idProcuto + ", precio=" + precio + '}';
    }
    
}
