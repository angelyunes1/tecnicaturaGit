
package test;


public class TestArreglo {
    public static void main(String[] args) {
        int edades[] = new int[3]; //el lado izq.declaramos la variable; del lado derecho instanciamos un objeto de tipo object
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades0 = " + edades[0]);
        edades[1]=23;
        System.out.println("edades1 = " + edades[1]);
        edades[2]=9;
        System.out.println("edades2 = " + edades[2]);
        
        //edades[3] = 2;//Fuera de rango,error en tiempo de ejecucion 
        for (int i = 0 ; i <edades.length; i++){
            System.out.println("edades y sus elementos "+ i +": " + edades[i]);
        }
        
    }
}
