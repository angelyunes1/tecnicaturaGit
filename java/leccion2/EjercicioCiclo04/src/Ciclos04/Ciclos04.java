/*
Ejercicio04 
Pedir numeros hasta que se teclee uno negativo, y mostrar cunatos numeros se han
introducido.
Lo hacemos primero con la clase scanner y luego con JOptionPane
 */
package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int contador = 0;
      System.out.println("Digite un numero : ");
      var numero = Float.parseFloat(entrada.nextLine());
      while (numero >= 0){
          contador ++;
          System.out.println("Usted ingreso el numero "+ numero +" haciendo un total de " + contador + " numeros ingresados");
          System.out.println("Digite un numero : ");
          numero = Float.parseFloat(entrada.nextLine());   
                 
      }
        System.out.println("Usted ingreso un numero Negativo, por lo que se detendra el programa");
    }
    
}
