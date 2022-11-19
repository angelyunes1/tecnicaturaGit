
package test;

import domain.Persona;


public class TestMatrices {
    public static void main(String[] args) {
        int edades[][]= new int [3][2] ;
        System.out.println("edades = " + edades);
        edades[0][0]= 5;
        edades[0][1] = 8;
        edades[1][0] =7 ;
        edades[1][1] = 6;
        edades[2][0] =4 ;
        edades[2][1] =2;
        System.out.println("edades 0-0 = " + edades [0][0]);
        System.out.println("edades 0-1 = " + edades [0][1]);
        System.out.println("edades 1-0 = " + edades [1][0]);
        System.out.println("edades 1-1 = " + edades [1][1]);
        System.out.println("edades 2-0 = " + edades [2][0]);
        System.out.println("edades 2-1 = " + edades [2][1]);
        System.out.println("Recorremos la matriz a travez del ciclo for ");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int columna = 0; columna < edades[fila].length; columna++) {
                System.out.println("Edades "+ fila +"-"+columna+": "+edades[fila][columna] );
            }
        }
        //Sintaxis clasicas
        //String frutas[][] = new String [3][2];
        
        //sintaxis simplificada
        String frutas [][] ={{"Limon","pomelo"},{"Ciruela","Frutilla"},{"Manzana","Cereza"}};
        imprimir(frutas);
        
//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("Frutas "+ i +"-"+j+": "+frutas[i][j] );
//            }
//        }
        
        
        //Creacion de una matriz de objetos
        
        Persona personas[][] =new Persona[2][3];
        
        //Asignamos valores a la matriz
        
        personas[0][0]= new Persona ("Angel");
        personas[0][1]= new Persona ("Hugo");
        personas[0][2]= new Persona ("Yunes");
        personas[1][0]= new Persona ("Mauricio");
        personas[1][1]= new Persona ("Paula");
        personas[1][2]= new Persona ("Pablo");
        imprimir(personas);
        
        
        
    }
    
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz "+ i +"-"+j+": "+matriz[i][j] );
            }
        }
    }
   
}
