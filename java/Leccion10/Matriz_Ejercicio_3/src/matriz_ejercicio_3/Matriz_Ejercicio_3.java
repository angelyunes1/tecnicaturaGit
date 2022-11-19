
package matriz_ejercicio_3;

import java.util.Scanner;

/**
Ejercicio 3:  Crear y cargar una matriz 3x3, trasponerla y mostrarla
 */
public class Matriz_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int [3][3];
        
        System.out.println("Rellenar la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
                
            }
            
        }
        System.out.println("");
        
        //Mostramos la matriz original
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" "); //System.out.print[ln] se borra la ln, para mostrarlo de forma de tabla
            }
            System.out.println();
        }
        System.out.println();
        
        
         //Mostramos la matriz transpuesta
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i]+" "); //System.out.print[ln] se borra la ln, para mostrarlo de forma de tabla
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
