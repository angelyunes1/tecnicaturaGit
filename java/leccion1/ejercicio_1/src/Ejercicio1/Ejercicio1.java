
package Ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio:Tienda de libros
//       Mostrar: Ingrese los siguientes datos del libro
//        Digite el nombre del libro
//        Digite el ID del libro
//        Digite el precio del libro
//        Indicar si el envío es gratuito (True/False)
//        Mostrar:
//	Nombre:
//	ID: 
//	Precio:
//	Envío Gratuito?:

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos del libro");
        System.out.println("nombre del libro :");
        String nombreLibro = entrada.nextLine();
        System.out.println("Id del libro :");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Digire el precio del libro :$");
        double precio = Double.parseDouble(entrada.nextLine());
        System.out.println("Indicar si el envio es gratuito: ");
        boolean envio = Boolean.parseBoolean(entrada.nextLine());
        System.out.println("nomre: " + nombreLibro);
        System.out.println("Id :" + "#" + idLibro);
        System.out.println("Precio :" + "$" +precio);
        System.out.println("Envio gratuito:" + envio);
        
        
        
       
        
        
        
        
        
    }
}
