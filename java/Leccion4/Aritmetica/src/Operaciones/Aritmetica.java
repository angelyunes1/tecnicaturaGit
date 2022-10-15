
package Operaciones;


public class Aritmetica {
    // Atributos clase
    int a; // Por defaul, cuando no iniciamos una variable de tipo int, float = 0
    int b; // 
    // El constructor es un metodo especial
    public Aritmetica(){ // constructor 1 vacio, es el que se crea por defecto
        System.out.println("Se esta ejecutando el constructor numero uno");
    } 
    //Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b){//constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando el constructor numero dos");
    }
    //Metodo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    //Metodo2
    public int sumarConRetorno(){
        //int resultado = a + b;
        return this.a + this.b;
    }   
    
    public int sumarConArgumentos(int a, int b){ // no se puede utilizar inferencia de tipo en atributos o parametros (VAR) dentro de los parentecis por ej (var a , var b)
        this.a = a; // EL argumento "a" se asigna al atributo this.a
        this.b = b; // En este caso "this" sirve para diferenciar el atributo "b verde" y el parametro "b negro"
        //return a + b;
        return this.sumarConRetorno();
    }
    
}
