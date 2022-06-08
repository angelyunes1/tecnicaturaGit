
package Ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
//            // salario =1000 + 150X+x0.05
//
//            System.out.println("Cuantos autos has vendido? :");
//            var x = Integer.parseInt(entrada.nextLine());
//            System.out.println("Cual es valor del monto total de los auto vendidos? :");
//            var y = Float.parseFloat(entrada.nextLine());
//            var salario = 1000 + (150*x) + (0.05*y);
//            System.out.println("salario = " + salario);
            final int salario = 1000;
            int comision = 150, venta;
            float salarioMensual, ventaCarro, porcVenta,totalPrecio;
            System.out.println("Digite la cantidad de carros vendidos: ");
            venta = Integer.parseInt(entrada.nextLine());
            System.out.println("Digite el precio del carro: ");
            ventaCarro = Float.parseFloat(entrada.nextLine());
            
            comision *= venta;
            totalPrecio = ventaCarro * venta;
            porcVenta = totalPrecio * 0.05f;
            salarioMensual = salario + comision + porcVenta;
            System.out.println("\n El salario mensual es: " + salarioMensual);
                    
            
        
        
    }
    
}
