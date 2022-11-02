
package ProyectoTienda;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        int numMenu,numSubMenu,cantidadRemera=0,cantidadZapatillas=0,cantidadPantalon=0;
        float totalAcumulado=0,totalCompra=0,precioRemera=1000,precioZapatillas=7000,precioPantalon=2000,totalRemera=0,totalZapatillas=0,totalPantalon=0,subtotal=0,subtotalContado=0,subtotalTarjeta3=0,subtotalTarjeta6=0;
        Scanner entrada = new Scanner (System.in); 
        System.out.println("!Bienvenido a nuestra tienda! -- Se puede desplazar a través del menú según los números indicados abajo");
        System.out.println("Welcome to our shop! -- You can scroll through the menu according to the numbers indicated below.");
        System.out.println(" ");
        System.out.println("Ofrecemos un 10% de descuento adicional por compras mayores a $50000, solo aplicado a pagos en contado.");
	System.out.println("We offer an additional 10% discount for purchases over $50000, only applied to cash payments.");
	System.out.println(" ");
        System.out.println("1 - Agregar items al carrito // Add items to cart");
        System.out.println("2 - Finalizar compra // Checkout");
        numMenu=Integer.parseInt(entrada.nextLine());
        while(numMenu != 2){
            System.out.println("1 - Agregar items al carrito // Add items to cart");
            System.out.println("2 - Finalizar compra // Checkout");
            while(numMenu!=2){
                System.out.println("¡Perfecto!, entraste al carrito, ahora podes agregar items.");
                System.out.println("Perfect! You entered the cart, now you can add items.");
                System.out.println("");
                System.out.println("1 - >> Remera // T-shirt << -- $1000");
                System.out.println("2 - >> Zapatillas // Shoes << -- $7000");
                System.out.println("3 - >> Pantalon // Trousers << -- $2000");
                System.out.println("4 - Finalizar compra // Checkout");
                System.out.println("5 - Salir // Exit");
                numSubMenu=Integer.parseInt(entrada.nextLine());
                while(numSubMenu!=5){
                    if(numSubMenu==1){
                        System.out.println("Seleccionaste el item >> Remera <<, ingrese la cantidad: ");
                        System.out.println("You selected the item >> T-shirt <<, enter the quantity:");
                        cantidadRemera=Integer.parseInt(entrada.nextLine());
                        totalRemera = cantidadRemera * precioRemera;
                        subtotal =totalPantalon+totalZapatillas+totalRemera;
                        System.out.println("Su total en remeras será: $"+totalRemera);
                        System.out.println("Puede seguir agregando items o seleccionar el número 4 para finalizar compra.");
                        System.out.println("You can continue adding items or select number 4 to finalize purchas");
                        numSubMenu=Integer.parseInt(entrada.nextLine());
                    }
                    else if(numSubMenu==2){
                        System.out.println("Seleccionaste el item >> Zapatillas <<, ingrese la cantidad: ");
                        System.out.println("You selected the item >> Shoes <<, enter the amount: ");
                        cantidadZapatillas =Integer.parseInt(entrada.nextLine());
                        totalZapatillas = cantidadZapatillas*precioZapatillas;
                        subtotal =totalPantalon+totalZapatillas+totalRemera;
                        System.out.println("Su total en remeras será: $"+totalZapatillas);
                        System.out.println("Puede seguir agregando items o seleccionar el número 4 para finalizar compra.");
                        System.out.println("You can continue adding items or select number 4 to finalize purchas");
                        numSubMenu=Integer.parseInt(entrada.nextLine());
                    }
                    else if(numSubMenu==3){
                        System.out.println("Seleccionaste el item >> Pantalon <<, ingrese la cantidad: ");
                        System.out.println("You selected the item >> Pants <<, enter the quantity: ");
                        cantidadPantalon =Integer.parseInt(entrada.nextLine());
                        totalPantalon= cantidadPantalon*precioPantalon;
                        
                        System.out.println("Su total en remeras será: $"+totalPantalon);
                        System.out.println("Puede seguir agregando items o seleccionar el número 4 para finalizar compra.");
                        System.out.println("You can continue adding items or select number 4 to finalize purchas");
                        numSubMenu=Integer.parseInt(entrada.nextLine());
                        
                    }
                    else if(numSubMenu==4){
                        System.out.println("Has finalizado la compra");
                        System.out.println("Total carrito"+subtotal);
                    }
                    else if(numSubMenu==5){
                        
                    }
                    else if(numSubMenu >= 6 || numSubMenu <=0 ){
                        System.out.println("Opción incorrecta, seleccione un número entre 1 y 4");
                        System.out.println("Wrong choice, select a number between 1 and 4");
                        numSubMenu=Integer.parseInt(entrada.nextLine());
                        
                    }
                }
                
            }
            numMenu=Integer.parseInt(entrada.nextLine());
            
        }
       
        
    }
}
