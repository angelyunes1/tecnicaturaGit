/*
Ejercicio04 
Pedir numeros hasta que se teclee uno negativo, y mostrar cunatos numeros se han
introducido.
Lo hacemos primero con la clase scanner y luego con JOptionPane
 */
package Ciclos04;

import javax.swing.JOptionPane;


public class Ejercicio04 {
    public static void main(String[] args) {
      var numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero :"));
      int contador = 0;
      while (numero >= 0){
          contador ++;
          JOptionPane.showMessageDialog(null,"Usted ingreso el numero "+ numero +" haciendo un total de " + contador + " numeros ingresados");
          numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero :"));             
      }
        JOptionPane.showMessageDialog(null,"Usted ingreso un numero Negativo, por lo que se detendra el programa");
    }
    
}
