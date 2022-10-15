/*
Ejercicio06: Pedir numeros hasta que se teclee un 0 , mostrar la suma de todos los
numeros introducidos
 */
package Ciclo06;

import javax.swing.JOptionPane;

public class Ejercicio06 {

    public static void main(String[] args) {
//        int numero, sumatoria = 0;
//        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
//        while (numero != 0) {
//            sumatoria += numero;
//            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
//        }
//       JOptionPane.showMessageDialog(null,"La sumatoria de los numeros ingresados es: " + sumatoria);



//como lo hiso el profe

        int numero, sumatoria = 0;

    do{
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
        sumatoria += numero;
     }while(numero !=0);
        JOptionPane.showMessageDialog(null,"La sumatoria de los numeros ingresados es: " + sumatoria);
    }
}