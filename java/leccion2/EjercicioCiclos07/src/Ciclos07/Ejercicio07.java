/*
Ejercicio07: Pedir numeros hasta que se intrusca un numero negativo y calcular el
promedio
 */
package Ciclos07;

import javax.swing.JOptionPane;


public class Ejercicio07 {
    public static void main(String[] args) {
        int numero, suma = 0, contador = 0;
        float promedio = 0; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
        while(numero >= 0){ //Mientras el numero no sea negativo
            suma += numero;
            contador ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
            }
        if(contador == 0){
            JOptionPane.showMessageDialog(null,"Error la division entre 0 no existe");
        }
        else{
           promedio = (float)suma / contador;
           JOptionPane.showMessageDialog(null,"El numero promedio de los datos ingresados es:  = " + promedio);

        }
    }
}
