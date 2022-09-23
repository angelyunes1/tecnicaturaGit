
package Operaciones;


public class Aritmetica {
    // Atributos clase
    int a; // Por defaul, cuando no iniciamos una variable de tipo int, float = 0
    int b;
    
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
    
    public int sumarConArgumentos(int a, int b){
        this.a = a; // EL argumento "a" se asigna al atributo this.a
        this.b = b; // En este caso "this" sirve para diferenciar el atributo "b verde" y el parametro "b negro"
        //return a + b;
        return this.sumarConRetorno();
    }
    
}
