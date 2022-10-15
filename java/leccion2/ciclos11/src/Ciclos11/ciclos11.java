/*
Ejercicio11:
Disenar un programa que muestre el producto de los 10 primeros numeros impares
Hacerlo con JOptionPane
 */
package Ciclos11;

import javax.swing.JOptionPane;

public class ciclos11 {
    public static void main(String[] args) {
        long producto = 1;
        for(int i =1; i<20;i+=2){ //el aumento apunta a solo ir por  los impares
            producto *= i;
            
        }
        JOptionPane.showMessageDialog(null, "EL producto de los numeros imapres es: " +producto);
    }
    
}
