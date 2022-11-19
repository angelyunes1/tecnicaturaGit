
package matriz_ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Ejercicio 5: crear y cargar una matriz de tamano n x m, mostrar la suma de cada fila y de cada columna
 */
public class Matriz_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas,nCol,sumaFilas,sumaCol;
        int posFila,posCol;
        
        nFilas =Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: ")) ;
        nCol =Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Columnas: ")) ;
        
        matriz  = new int [nFilas][nCol];
        int filas[] = new int[nFilas];
        int columnas[] = new int [nCol];
        
        System.out.println("Rellenando la Matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.println("Matriz["+i+"] ["+j+"]:");
                matriz[i][j] = entrada.nextInt();
            }
            
        }
        //Mostramos la matriz original
        System.out.println("\nMostramos la matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //Sumamos las filas
        posFila=0;
        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nCol; j++) {
                sumaFilas += matriz[i][j];
            }
            filas[posFila] = sumaFilas;
            posFila++;
        }
        
        //Sumando las columnas
        posCol = 0;
        for (int i = 0; i < nCol; i++) {
            sumaCol = 0;
            for (int j = 0; j < nFilas; j++) {
                sumaCol += matriz[i][j];
            }
            columnas[posCol]=sumaCol;
            posCol++;
        }
        
        System.out.println("\nLa suma de la filas es: ");
        for (int i = 0; i < nFilas; i++) {
            System.out.print(filas[i]+" - ");
        }
        System.out.println("");
        
        System.out.println("\nLa suma de las columnas es: ");
        for (int i = 0; i < nCol; i++) {
            System.out.print(columnas[i]+" - ");
        }
        System.out.println("");
    }
    
}
