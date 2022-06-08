
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //ejercicio2:
        // hacer un programa que calcule e imprima el salario de un empleado, a
        // partir de sus horas semanales trabajadas y de su salario por horas.
        
        var entrada = new Scanner(System.in);
        int horas;
        float valor,salarioSemanal;
        
        System.out.println("ingrese la cantidad de horas que trabaja por semana = :");
        horas = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el valor que le pagan por hora = :");
        valor = Float.parseFloat(entrada.nextLine());
        salarioSemanal = horas * valor;
        System.out.println("\nsu salario semanal es de : US$" +  salarioSemanal);
        
                
    } 
}
