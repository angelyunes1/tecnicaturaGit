
package caja;


public class Caja {//clase publica caja
    //Atributos(Caracteristicas)
    int ancho;
    int alto;
    int profundo;
    //Metodos y constructores(acciones)
    public Caja(){//constructor 1 = vacio
        
    }
    //Constructor con parametros
    public Caja(int ancho, int alto, int profundo){//constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo=profundo;
    }
    public int calcularVolumen(){ //metodo para calcular volumen
        return ancho*alto*profundo;
    }
    
}
