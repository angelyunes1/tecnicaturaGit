
package arreglos_ejercicios_3;

import java.util.Scanner;

/*
Ejercicio 3: Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion 
realizar la media de los numeros positivos y negativos y contar el numero de ceros
 */
public class Arreglos_Ejercicios_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arreglos = new float[5];
        float negativos = 0, positivos = 0, mediaNegativos,mediaPositivos;
        int conteo0 = 0,conteo_negativos=0,conteo_positivos=0 ;
        System.out.println("Guardaremos los datos de los arreglos ");
        for(int i =0; i < 5 ;i++){
            System.out.println("Por favor introduce el numero del iterador:"+(i+1));
            arreglos[i] = entrada.nextFloat();
            if(arreglos[i]>0){
                positivos +=arreglos[i];
                conteo_positivos++;
            }
            else if(arreglos[i]<0){
                negativos += arreglos[i];
                conteo_negativos++;
            }
            else{
                conteo0++;
            }
        }
        if(conteo_positivos == 0){
            System.out.println("No se puede calcular la media de los positivos ya que no se ingresaron este tipo de numeros");
        }
        else{
            mediaPositivos=positivos/conteo_positivos;
            System.out.println("La media de los numeros positivos es: "+mediaPositivos);
        }
        
        
        if(conteo_negativos == 0){
            System.out.println("No se puede calcular la media de los negativos ya que no se ingresaron este tipo de numeros");
        }
        else{
            mediaNegativos=negativos/conteo_negativos;
            System.out.println("La media de los numeros positivos es: "+mediaNegativos);
        }
        System.out.println("La cantidad de ceros es: "+conteo0);
    }
}
