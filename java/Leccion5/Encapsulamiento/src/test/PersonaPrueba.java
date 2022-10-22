
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo",57000.00,false);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        System.out.println("persona1: "+ persona1);
        //Modificacion a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        //persona.nombre = "Juan Ignacio";//Ya no se puede utilizar porque el atributo es privado
        //System.out.println("nombre es :" +persona1.nombre); //Error al  acceder, ya que el atributo es privado
        System.out.println("persona1 su nombre modificado es: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo es: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());
        //Tarea crear otro objeto de tipo persona, asignar valores de manera inicial e imprimir, luego modificar sus valores y volver a imprimir con los valores nuevos
        Persona persona2 = new Persona("Angel",10000.00,true);
        System.out.println("El nombre de persona2 es: " +persona2.getNombre());
        System.out.println("El sueldo para persona2 es: "+persona2.getSueldo());
        System.out.println("El booleano para persona2 es: "+persona2.isEliminado());
        
        persona2.setNombre("Hugo");
        persona2.setSueldo(40000.0);
        persona2.setEliminado(false);
        
        System.out.println("El nombre para persona2 Modificado es: " +persona2.getNombre());
        System.out.println("El sueldo para persona2 Modificado es: "+persona2.getSueldo());
        System.out.println("El booleano para persona2 Modificado es :"+persona2.isEliminado());
        
        System.out.println("persona1: "+ persona1); // Utilizamos el metodo  public String toString
       
    }
}
