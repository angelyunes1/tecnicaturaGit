package Ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Double nota1, nota2, nota3, suma, promedio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nota 1");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese nota 2");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese nota 3");
        nota3 = entrada.nextDouble();
        suma = (nota1 + nota2 + nota3);
        promedio = (suma / 3);
        if (promedio > 3) {
            System.out.println("El estudiante aprobo con un promedio de: " + promedio);
        } else {
            System.out.println("El estudiante No aprobo, el promedio es de: " + promedio);
        }
    }
}
