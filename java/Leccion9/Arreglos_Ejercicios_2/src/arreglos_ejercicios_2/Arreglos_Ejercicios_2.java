
package arreglos_ejercicios_2;

import java.util.Scanner;

/*
Ejercicio 2: Leer 5 numeros, guardarlos en un arreglo  y mostrarlos 
en el orden inverso introducidos
 */
public class Arreglos_Ejercicios_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         float[] arreglos = new float[5];
     
         System.out.println("Guardaremos los datos de los arreglos ");
        for(int i =0; i < 5 ;i++){
            System.out.println("Por favor introduce el numero del iterador:"+(i+1));
            arreglos[i] = entrada.nextFloat();
        }
        System.out.println("\nImprimir los elementos del arreglo");
        for(int i = 4; i >=0 ; i--){
            System.out.println("Iterador ->"+(i+1)+" = "+arreglos[i]);
        }
        System.out.println("\n");
    }
}
