/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo de donde se aplique
    variables:Evita cambiar el valor que almacena la variable
    metodos:evita que se modifique la definicion o el 
            comportamiento de un metodo desde una sublcase(hija)
    clases:Evita que se creen clases hijas
Otra caracteristica es que normalmente, cuando trabajamos con variables se combina el 
modificador  de acceso estatico para convertir una variable en una constante, es decir
que no se puede modificar su valor, el ejemplo de esto es la clase Math en la cual todos
sus atributos son e tipo static y final, es por esto que la variable pi* se conoce
como una constatne 
 */
package test;

import domain.Persona;


public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 42793765;
        System.out.println("miDni = " + miDni);
       // miDni = 1311231232; no se puede modificar, por lo tanto tira error
       //Persona.CONSTANTE_AQUI = 9;//No se modifica
        System.out.println("Mi atributo constatne es: "+Persona.CONSTANTE_AQUI);
        
        final Persona persona1 =new Persona();
        //persona1 = new Persona(); //No se puede asignar una nueva referencia
        persona1.setNombre("Angel Yunes");
        System.out.println("persona1 nombre: " +persona1.getNombre());
        persona1.setNombre("Hugo");
        System.out.println("persona1 nombre: " +persona1.getNombre());
        
    }
}
