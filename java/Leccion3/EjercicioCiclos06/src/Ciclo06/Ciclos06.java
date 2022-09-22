/*
Ejercicio06: Pedir numeros hasta que se teclee un 0 , mostrar la suma de todos los
numeros introducidos
 */
package Ciclo06;

import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
//        int numero, sumatoria = 0 ; 
        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite un numero: ");
//        numero = Integer.parseInt(entrada.nextLine());
//        while (numero != 0 ){
//            sumatoria += numero;
//            System.out.println("Digite un numero: ");
//            numero = Integer.parseInt(entrada.nextLine());
//        }
//        System.out.println("La sumatoria de los numeros ingresados es: " + sumatoria);



//como lo hiso el profe
    int numero, sumatoria = 0 ; 
    
    do{
        System.out.println("Digite un numero");
        numero = Integer.parseInt(entrada.nextLine());
        sumatoria += numero;
    }while(numero !=0);
        System.out.println("\nLa sumatoria de todos los numeros ingresados es: " + sumatoria);
    }
}
