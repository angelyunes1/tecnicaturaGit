package condicionalEjercicio3;

import java.util.Scanner;

public class condicionalEjercicio3 {

    public static void main(String[] args) {
//        Scanner entrada = new Scanner (System.in);
//        System.out.println("Ingrese un numero del 0 al 10");
//        var calificacion = Integer.parseInt(entrada.nextLine());
//        if (calificacion >= 9 && calificacion <= 10){
//            System.out.println("A");
//        }
//        else if (calificacion >= 8 && calificacion <= 9){
//            System.out.println("B");
//        }
//        else if (calificacion >= 7 && calificacion <= 8){
//            System.out.println("C");
//        }
//        else if (calificacion >= 6 && calificacion <= 7){
//            System.out.println("D");
//        }
//        else if (calificacion >= 0 && calificacion <= 6){
//            System.out.println("F");
//        }
//        else{
//            System.out.println("fuera de rango");
//        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero del 0 al 10");
        var calificacion = Integer.parseInt(entrada.nextLine());
        var nota = "Nota mal ingresada";
        switch(calificacion){
            case 1: case 2: case 3: case 4: case 5:
                nota = "F";
                break;
            case 6:
                nota = "D";
                break;
            case 7:
                nota = "C";
                break;
            case 8:
                nota = "B";
                break;
            case 9: case 10:
                nota = "A";
                break;
                     
        }
        System.out.println("nota = " + nota);
    }
}
