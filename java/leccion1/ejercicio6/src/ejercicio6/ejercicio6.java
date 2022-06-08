
package ejercicio6;

import java.util.Scanner;




public class ejercicio6 {
    public static void main(String[] args) {
        /*
        Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo
        Juan tiene la mitad de lo que posee Luis y Guillermo juntos. Hacer un 
        programa que calcule e  imprima la cantidad de dinero que tienen entre los tres
        guillermo = N
        luis = guillermo / 2
        juan= (luis+guillermo)/2
        */
        Scanner entrada = new Scanner(System.in);
        double Guillermo,Luis,Juan,total;
        System.out.println("Cuanto dinero tiene Guillermo? :$");
        Guillermo = entrada.nextDouble();
        Luis = Guillermo/2;
        System.out.println("Luis tiene: $ = " + Luis);
        Juan = (Luis+Guillermo)/2;
        System.out.println("Juan tiene: $"+ Juan);
        total = Luis+Juan+Guillermo;
        System.out.println("La cantidad total de dinero que tienen entre los tres es: $= " + total);
        
        
    }
    
}
