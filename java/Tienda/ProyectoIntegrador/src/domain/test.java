package domain;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numMenu, subMenu;
        System.out.println("!Bienvenido a nuestra tienda! -- Se puede desplazar a través del menú según los números indicados abajo.");
        System.out.println("Ofrecemos un 10% de descuento adicional por compras mayores a $50000, solo aplicado a pagos en contado.");
        do { //Ciclo do while, se repetira hasta que el usuario elija salir (condicion en linea 105)
            System.out.println("\n1 --- Agregar items al carrito ---");
            System.out.println("2 --- Salir ---");
            numMenu = Integer.parseInt(entrada.nextLine());
            if(numMenu==1){
              do{//Ciclo do while, se repetira hasta que el usuario elija finalizar la compra (condicion en linea 57)
                System.out.println("\n¡Perfecto!, entraste al carrito, ahora podes agregar items.");
                System.out.println("1 -->>   Remera       <<-- $1000");
                System.out.println("2 -->>   Zapatillas   <<-- $7000");
                System.out.println("3 -->>   Pantalon     <<-- $2000");
                System.out.println("4.....Finalizar compra.... "); 
                System.out.println("\n99 --xx >> Cancelar todo y Salir del programa << --xx "); //esta funcion llevara a la linea 50
                subMenu = Integer.parseInt(entrada.nextLine());
                
                if(subMenu==1){
                    System.out.println("\nHa seleccionado el item: [  Remera  ]");
                    System.out.println("Ingrese la cantidad que desea comprar: ");
                    int cRemeras=Integer.parseInt(entrada.nextLine());
                    Proyecto ropa = new Proyecto( 0, cRemeras, 0);//Llamada de construcor
                    ropa.Remeras ();//Llamada de metodo
                    ropa.VentasAcumuladas ();//Llamada de metodo
                }
                else if(subMenu==2){
                    System.out.println("\nHa seleccionado el item: [  Zapatilla  ]");
                    System.out.println("Ingrese la cantidad que desea comprar: ");
                    int cZapatillas=Integer.parseInt(entrada.nextLine());
                    Proyecto ropa = new Proyecto(cZapatillas, 0, 0);//Llamada de construcor
                    ropa.Zapatillas ();//Llamada de metodo
                    ropa.VentasAcumuladas ();//Llamada de metodo
                }
                else if(subMenu==3){
                    System.out.println("\nHa seleccionado el item: [  Pantalon  ]");
                    System.out.println("Ingrese la cantidad que desea comprar: ");
                    int cPantalones=Integer.parseInt(entrada.nextLine());
                    Proyecto ropa = new Proyecto(0, 0, cPantalones);//Llamada de construcor
                    ropa.Pantalones ();//Llamada de metodo
                    ropa.VentasAcumuladas ();//Llamada de metodo
                }
                else if(subMenu==99){ //En esta condicion hemos agregado un break, para romper el programa
                    System.out.println("\nHas salido del programa");
                    break;
                }
                else{
                    if(subMenu !=4){
                       System.out.println("\nOpcion incorrecta, por favor revise las opciones del menu"); 
                    }
                    
                }
            }while(!(subMenu==4));
                    if(subMenu==99){
                    break;
                    }
                    Proyecto ropa = new Proyecto(0, 0, 0);//Llamada de construcor
                    System.out.println("\nHas finalizado el carrito,te recordamos que: ");
                    ropa.VentasAcumuladas ();//Llamada de metodo
                    System.out.println("\nPor favor, seleccione el método de pago:");
                    System.out.println("1-Contado efectivo[Descuento del 20%]");
                    System.out.println("2-Débito/crédito un pago [Descuento del 20%]");
                    System.out.println("3-Tarjeta crédito ~ 3 cuotas [5% de recargo]");
                    System.out.println("4-Tarjeta crédito ~ 6 cuotas [10% de recargo]");
                    System.out.println("\n99 --xx >> Cancelar todo y Salir del programa << --xx ");//esta funcion llevara a la linea 94
                    int pago=Integer.parseInt(entrada.nextLine());
                    if(pago==1){
                        ropa.VentasAcumuladas ();//Llamada de metodo
                        ropa.PagoContado();//Llamada de metodo
                    }
                    else if(pago==2){
                        ropa.VentasAcumuladas ();//Llamada de metodo
                        ropa.PagoTarjetaDebito();//Llamada de metodo
                        ropa.PedirDatosTarjetaCompleto();//Llamada de metodo
                        
                    }
                    else if(pago==3){
                        ropa.VentasAcumuladas ();//Llamada de metodo
                        ropa.PagoCredito3();//Llamada de metodo
                        ropa.PedirDatosTarjetaCompleto();//Llamada de metodo
                       
                        
                    }
                    else if(pago ==4){
                        ropa.VentasAcumuladas ();//Llamada de metodo
                        ropa.PagoCredito6();//Llamada de metodo
                        ropa.PedirDatosTarjetaCompleto();//Llamada de metodo
                        
                    }
                    else if(pago==99){//En esta condicion hemos agregado un break, para romper el programa
                    System.out.println("Has salido del programa");
                    break;
                    }
                    else{
                        System.out.println("Opcion incorrecta, por favor revise las opciones del menu");
                    }   
            }
            else if(numMenu==2){
                break;
            }                    
        }while(!(numMenu!=2));
    }
}

