package ciclos03;

import javax.swing.JOptionPane;
/*
Ejercicio3: leer numeros hasta que se introdusca un cero
Para cada uno indicar si es par o impar.
Primero lo haremos con la clase scanner y luego con la clase 
JOptionPane
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero Entero :"));
        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "el numero " + numero + " es Par");
            } else {
                JOptionPane.showMessageDialog(null, "el numero " + numero + " es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero: "));

        }
        JOptionPane.showMessageDialog(null, "Como usted ingreso el numero 0, el programa terminara ");

    }

}
