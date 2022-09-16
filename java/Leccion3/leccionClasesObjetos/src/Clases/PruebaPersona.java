
package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); //llamamos al constructor
        persona1.nombre = "Ariel";// El valor hexadecimal normalmente comienza con 0x
        persona1.apellido = "Betancud";
        persona1.ObtenerInformacion();
        
        Persona persona2 = new Persona(); 
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.ObtenerInformacion();
        persona2.nombre = "Angel";
        persona2.apellido = "Yunes";
        persona2.ObtenerInformacion();
    }
}
