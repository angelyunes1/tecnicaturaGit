
package clase11;

import java.util.Scanner;

public class clase11 {
    public static void main(String[] args) {
        //Ejercicio 1 Con Estructura if else
       //Determinar si un alumno aprueba o reprueba un curs, sabiendo que 
       //aprobara si su promedio de tres calificaiones es mayor o igual a 70
       //reprueba caso contrario
      /*
       Scanner entrada = new Scanner (System.in);
       float nota1, nota2, nota3, promedio;
        System.out.println("Digite la primera nota");
        nota1 = Float.parseFloat(entrada.nextLine());
        System.out.println("Digite la segunda nota");
        nota2 = Float.parseFloat(entrada.nextLine());
        System.out.println("Digite la tercera nota");
        nota3 = Float.parseFloat(entrada.nextLine());
        promedio = (nota1+nota2+nota3)/3;
        if (promedio >=70){
            System.out.println("El alumno esta aprobado con :" + promedio);
        }
        else{
            System.out.println("El alumno esta desaprobado con :" + promedio);
        }
        
        */
      
      //ejercicio 2
      // En un almacen se hace 20 MOD de descuento a los clientes cuya compra
      // supere los $100. Cual sera la cantidad que pagara una persona por su 
      // compra?
      /*
      float compra,descuento;
      Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la cantidad a pagar");
        compra = Float.parseFloat(entrada.nextLine());
        if (compra > 100){
            descuento = compra * 80 / 100;
            System.out.println("El precio a pagar es: " + descuento);
        }
        else{
            System.out.println("El precio a pagar es: " + compra );
        } 
      */
      

    // Ejercicio 3
    // Leer dos numeros: si son igaules que los multiplique, si el numero primero
    // es mayor que el segundo que los reste y si no que los sume
    Scanner entrada = new Scanner (System.in);
    float numero1, numero2, operacion;
        System.out.println("Digite el primer numero: ");
        numero1 = Float.parseFloat(entrada.nextLine());
        System.out.println("Digite el segundo numero: ");
        numero2 = Float.parseFloat(entrada.nextLine());
        if (numero1 == numero2){
            operacion = numero1 * numero2;
            System.out.println("La multiplicacion de estos numeros es :" + operacion);
        }
        else if (numero1 > numero2){
            operacion = numero1 - numero2;
            System.out.println("La resta del primer numero menos el segundo es:" + operacion);
        }
        else if (numero1 < numero2){
            operacion = numero1 + numero2;
            System.out.println("La suma del primer numero mas el segundo es:" + operacion);
        }  
    }
    
}
