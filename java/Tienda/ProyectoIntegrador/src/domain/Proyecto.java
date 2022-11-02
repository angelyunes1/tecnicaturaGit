package domain;

import java.util.Scanner;

public class Proyecto {

    //ATRIBUTOS
    int cantidadZapatillas;
    int cantidadRemeras;
    int cantidadPantalones;
    static int zapatillasTotalesIngresadas, remerasTotalesIngresadas, pantalonesTotalesIngresados; //todos los atributos iniciados como Static, fue pensado
    static float subTotal;                                              //para que guardara el valor que se le ingresa y no se setee automaticamente en 0 al avanzar por el programa
    static float subTotalZapatilla;                                       //de esta forma evitamos errores.
    static float subTotalRemera;
    static float subTotalPantalon;
    static float pagoContado;
    static float pagoTarjetaDebito;
    static float pagoTarjeta3;
    static float pagoTarjeta6;
    String x, fecha, codigoSeguridad;//Atributos de las tarjetas. Siendo x el numero de tarjeta
    int longitudTarjeta, longitudFecha, longitudCodigoSeguridad; //Atributos utilizados para contar los digitos ingresados como datos en las tarjetas 

    //CONSTRUCTOR VACIO  
    public Proyecto() {

    }

    //CONSTRUCTOR GENERAL
    public Proyecto(int cZapatillas, int cRemeras, int cPantalones) {
        this.cantidadPantalones = cPantalones;
        this.cantidadRemeras = cRemeras;
        this.cantidadZapatillas = cZapatillas;

    }

    //METODOS
    //(precio*cantidad) -> Metodo para calcular el sub total de zapatillas
    public void Zapatillas() {
        float pZapatilla = 7000;
        zapatillasTotalesIngresadas += this.cantidadZapatillas;
        this.subTotalZapatilla += (pZapatilla * this.cantidadZapatillas);
        System.out.println("Precio por: " + this.zapatillasTotalesIngresadas + " zapatilla/s =$ " + this.subTotalZapatilla);
    }

    //(precio*cantidad) -> Metodo para calcular el sub total de remeras
    public void Remeras() {
        float pRemera = 1000;
        remerasTotalesIngresadas += this.cantidadRemeras;
        this.subTotalRemera += (pRemera * this.cantidadRemeras);
        System.out.println("Precio por: " + this.remerasTotalesIngresadas + " remera/s =$ " + this.subTotalRemera);
    }

    //(precio*cantidad) -> Metodo para calcular el sub total de pantalones
    public void Pantalones() {
        float pPantalon = 2000;
        pantalonesTotalesIngresados += this.cantidadPantalones;
        this.subTotalPantalon += (pPantalon * this.cantidadPantalones);
        System.out.println("Precio por: " + this.pantalonesTotalesIngresados + " Pantalon/es =$ " + this.subTotalPantalon);
    }

    //Muestra una suma total de TODOS los productos seleccionados
    public void VentasAcumuladas() {
        this.subTotal = (this.subTotalPantalon + this.subTotalRemera + this.subTotalZapatilla);
        System.out.println("El subtotal de todos los productos seleccionados es: " + this.subTotal);
    }

    //Metodo de pago N°1 "Pago Contado."Donde se aprecia un descuento del 20% y en caso de que al compra supere los $50000.00 se hace un 10%extra
    public void PagoContado() {
        System.out.println("\nHas seleccionado Pago de contado");
        System.out.println("Por lo tanto:");
        if (subTotal >= 50000) {
            pagoContado = subTotal - ((subTotal / 100) * 28);//100*0,9*0,8=72  100-72=28 
            System.out.println("El valor a pagar es de: " + pagoContado);
            System.out.println("Muchas gracias Por su compra!!");
        } else {
            pagoContado = subTotal - ((subTotal / 100) * 20);
            System.out.println("El valor a pagar es de: " + pagoContado);
            System.out.println("Muchas gracias Por su compra!!");
        }

    }

    //Metodo de pago N°2 "Debito/Credito 1 Pago". Donde se aprecia un descuento del 20%
    public void PagoTarjetaDebito() {
        System.out.println("\nHas seleccionado Débito/crédito un pago");
        System.out.println("Por lo tento:");
        pagoTarjetaDebito = subTotal - ((subTotal / 100) * 20);
        System.out.println("El valor a pagar es de: " + pagoTarjetaDebito);
    }

    //Metodo de pago N°3 "Credito en tres cuotas".Donde se aprecia un incremento del 5%
    public void PagoCredito3() {
        System.out.println("\nHas seleccionado Crédito en tres coutas");
        System.out.println("Por lo tento:");
        pagoTarjeta3 = subTotal + ((subTotal / 100) * 5);
        System.out.println("El valor a pagar es de: " + pagoTarjeta3);
    }

    //Metodo de pago N°4 "Credito en seis cuotas".Donde se aprecia un incremento del 10%
    public void PagoCredito6() {
        System.out.println("\nHas seleccionado Crédito en seis coutas");
        System.out.println("Por lo tento:");
        pagoTarjeta6 = subTotal + ((subTotal / 100) * 10);
        System.out.println("El valor a pagar es de: " + pagoTarjeta6);
    }

    //Solicitar Datos de Tarjeta
    public void PedirDatosTarjetaCompleto() {
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\nPor favor ingrese los numeros de la tarjeta: ");
            x = entrada.nextLine();
            longitudTarjeta = x.length();
            if (longitudTarjeta == 16) { //Gracias a esta condición, el proceso avanzara solo si se introduce 16 digitos, es decir los números totales de la tarjeta
                do {                    //caso contrario se repite el bucle.
                    System.out.println("\nPor favor ingrese la fecha de vencimiento de la tarjeta: ");
                    System.out.println("Recuerde ingresar los datos de forma continua");
                    fecha = entrada.nextLine();;
                    longitudFecha = fecha.length();
                    if (longitudFecha == 4) { //En este caso solo avanzara si el usuario ingresa 4 digitos, es decir los numeros necesarios para la fecha
                        do {
                            System.out.println("\nPor favor ingrese el codigo de seguridad: ");
                            System.out.println("Recuerde ingresar los datos de forma continua");
                            codigoSeguridad = entrada.nextLine();
                            longitudCodigoSeguridad = codigoSeguridad.length();
                            if (longitudCodigoSeguridad == 3) { //Por ultimo, el proceso finalizara si el codigo de seguridad ingresado es de 3 digitos
                                System.out.println("\nUsted ha ingresado la tarjeta con numero:"
                                        + x + " fecha de vencimiento: " + fecha
                                        + " Codigo de seguridad: " + codigoSeguridad);
                                System.out.println("Procesando pago..");
                                System.out.println("Pago Aprobado");
                                System.out.println("Muchas gracias por su compra");
                            } else {
                                System.out.println("Codigo incorrecto, ingrese nuevamente");
                            }
                        } while (longitudCodigoSeguridad != 3);
                    } else {
                        System.out.println("Fecha incorreta, ingrese nuevamente");
                    }
                } while (longitudFecha != 4);

            } else {
                System.out.println("Incorrecto, ingrese nuevamente");
            }
        } while (longitudTarjeta != 16);
    }
}
