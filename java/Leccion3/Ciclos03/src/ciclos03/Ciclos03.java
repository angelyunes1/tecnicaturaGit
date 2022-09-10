package ciclos03;

import java.util.Scanner;


/*
Ejercicio3: leer numeros hasta que se introdusca un cero
Para cada uno indicar si es par o impar.
Primero lo haremos con la clase scanner y luego con la clase 
JOptionPane
 */
public class Ciclos03 {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero Entero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero: " + numero + " Es par");
            } else {
                System.out.println("El numero: " + numero + " Es impar");
            }
            System.out.println("Ingrese otro Numero: ");
            numero = Integer.parseInt(entrada.nextLine());

        }
        System.out.println("Ingreso el Numero 0, por lo que finalizara el programa");

    }

}
