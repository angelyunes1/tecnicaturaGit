/*
Proyecto caja:
Ejercicio 1:
Crear un proyecto segun las especificaciones mostradas  a continuacion
la formula es: volumen* alto* ancho
 */
package caja;


public class PruebaCaja {
    public static void main(String[] args) { //metodo main
        //variables locales
        int medidaAncho = 3; //valores ingresados por codigo duro
        int medidaAlto = 2;
        int medidaProfundidad = 6;
        
        Caja caja1 = new Caja(); // Intanciamos el objeto, constructor vacio
        caja1.ancho =medidaAncho; //Le pasamos los valores al Objeto
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProfundidad;
        int resultado = caja1.calcularVolumen(); //Llamamos al metodo
        //Primer resultado
        System.out.println("Resultado volumen de caja 1: " +resultado);
        
        Caja caja2 = new Caja(2,4,6); //Llamamos al constructor 2 con nuevos argumentos
        //llamamos con el nuevo objeto al metodo  para un nuevo calculo
        System.out.println("Resultado de volumen de caja 2: "+caja2.calcularVolumen());
        
        
        
        
    }
    
}
