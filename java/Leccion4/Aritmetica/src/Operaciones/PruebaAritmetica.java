
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10; // Variables locales
        var b = 7; //Memorias locales, memorias stack
        miMetodo(); // llamamos al metodo
        Aritmetica aritmetica1 = new Aritmetica(); 
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        //Para almacenar un objeto o los atributos se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado); 
        
        resultado = aritmetica1.sumarConArgumentos(12,26);
        System.out.println("Resultado usando argumentos = "+resultado);
        
        System.out.println("Arimetica1 a :"+aritmetica1.a);
        System.out.println("Arimetica1 a :"+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        //aritmetica.1 = null; nunca utilizar esto, no se debe hacer
        //System.gc(); metodos para limpiar reciduos, es pesado, no utilizar
        Persona persona = new Persona("Ariel","Bentacud");
        System.out.println("persona = " + persona);
        System.out.println("persona = " + persona.nombre);
        System.out.println("persona = " + persona.apellido);    
    }
    //modularidad creamos un nuevo metodo
    public static void miMetodo(){
        //El alcance de variables es dentro de un metodo, es decir esta limitada
        // a = 10;
        System.out.println("Aqui hay otro metodo");
    }
    
}
//Creamos una nueva clase
class Persona{
    String nombre;
    String apellido;
    
    
    Persona(String nombre, String apellido){ //constructor
        super();//Llamada al constructor de la clase PADRE object
        //Imprimir imprimir  = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: "+this);
    }
}

class Imprimir{
    public Imprimir(){
        super();//El constructor de la clase padre, para reservar memoria
    }
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: "+ persona);
        System.out.println("Impresion del objeto actual (this): "+ this);
    }
}
