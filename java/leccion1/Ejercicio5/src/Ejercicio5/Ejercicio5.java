package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        /* Hacer un programa que calcule e imprima la suma de tres calificaciones
        Pedir las calificaciones al usuario, crear un proyecto nuevo llamado 
        Ejercicio 5
         */
        double nota1, nota2, nota3,promedio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nota 1");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese nota 2");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese nota 3");
        nota3 = entrada.nextDouble();
        promedio = (nota1 + nota2 + nota3)/ 3;
        System.out.println("promedio = " + promedio);
    }

}
