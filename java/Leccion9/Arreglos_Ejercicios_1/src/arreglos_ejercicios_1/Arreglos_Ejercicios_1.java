
package arreglos_ejercicios_1;

import java.util.Scanner;

/*
Ejercicio 1:Leer 5 numeros,guardalos en un arreglo y mostrarlos en el mismo orden
introducido
*/
public class Arreglos_Ejercicios_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         float[] arreglos = new float[5];
     
         System.out.println("Guardaremos los datos de los arreglos ");
        for(int i =0; i < 5 ;i++){
            System.out.println("Por favor introduce el numero del iterador:"+(i+1));
            arreglos[i] = entrada.nextFloat();
        }
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i:arreglos){
            System.out.println(i+" ");
        }
        System.out.println("\n");
     
    }
}
