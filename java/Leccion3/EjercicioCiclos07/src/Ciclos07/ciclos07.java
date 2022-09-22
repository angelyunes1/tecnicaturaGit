/*
Ejercicio07: Pedir numeros hasta que se intrusca un numero negativo y calcular el
promedio
 */
package Ciclos07;

import java.util.Scanner;

public class ciclos07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0, contador = 0;
        float promedio = 0;
        System.out.println("Ingrese un numero ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){ //Mientras el numero no sea negativo
            suma += numero;
            contador ++;
            System.out.println("Digite otro numero");
            numero = Integer.parseInt(entrada.nextLine());
            }
        if(contador == 0){
            System.out.println("\n Error la division entre 0 no existe");
        }
        else{
           promedio = (float)suma / contador;
           System.out.println("El numero promedio de los datos ingresados es:  = " + promedio);
        }
        
    }
}
