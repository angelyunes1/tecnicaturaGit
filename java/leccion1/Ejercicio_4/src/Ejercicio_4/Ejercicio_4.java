
package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        // Ejercicio : rectangulo
        // se solicita  calcular el area  y el perimetro de un rectangulo , 
        // para esto deberomos crear las variables:
        // alto(int)
        //ancho(int)
        // El usuario debe proporcionar los valores de alto, ancho y despues se 
        //debe imprimir el resultado en el siguiente formato: (recuerden no usar acentos
        //respetar los espacios, mayusculas, minusculas y los salto de linea)
        //Le decimos al usuario:
        //digite el alto del rectangulo
        //digite el ancho del rectangulo
        //formula 
        //area = alto *ancho
        //perimetro (alto +ancho)*2
        //cual es el codigo del ejercicio planteado?
        var entrada = new Scanner(System.in);
        int alto,ancho;
        System.out.println("por favor indique el alto del rectangulo");
        alto = Integer.parseInt(entrada.nextLine());
        System.out.println("Por favor ingrese el el ancho del rectangulo");
        ancho =Integer.parseInt(entrada.nextLine());
        var area = alto * ancho;
        var perimetro =  (alto + ancho)*2;
        System.out.println("perimetro = " + perimetro);
        System.out.println("area = " + area);
    }
    
}
