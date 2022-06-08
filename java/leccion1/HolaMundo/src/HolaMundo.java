
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) { //psvm + tabulador
        /*  System.out.println("hola mundo desde java"); //sout +tabulador
        
        int miVariable = 10;   //int para definir la variable como entero 
        System.out.println(miVariable);
        miVariable = 5; //reutilizamos la variable, no ponemos int porque ya esta definida en linea 6, si la definimos de nuevo salta error
        System.out.println(miVariable);
        //tipo String 
        String miVariableCadena = "bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
         */

        // Var - inferencia  de tipos en java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        // soutv + tab
        // Reglas para definir una variable en java

        var usuario = "Oslvaldo";
        var titular = "ingeniero";
        var union = titular + " " + usuario;
        System.out.println("union = " + union);*/
 /*var usuario = "Oslvaldo";
        var a = 8;
        var b = 4;
        System.out.println(a + b); // como var le da automaticamente el tipo int a un numero, en este caso se suman
        System.out.println(usuario + a + b); //como aca empieza con ("letras") lee todo como cadena y no suma
        System.out.println(usuario + (a + b)); // al ponerle (a+b)) cambia la prioridad, por eso lo suma */
        // EJERCICIO: Caracter especiales con java
        /*var nombre = "Natalia";
        System.out.println("\nnueva linea: \n"+nombre); // al poner \n realizamos un salto de linea
        System.out.println("Tabulador: \t" + nombre); // al poner \t realiza un espacio para centrar    
        System.out.println("\t\t.:Menu:."); // se pueden poner varias juntas 
        System.out.println("Retroceso: \b\b" + nombre); // caracter de retroceso
        System.out.println("comillas simplres: \'" + nombre+"\'");
        System.out.println("comillas dobles: \""+nombre+"\"");*/
        //clase SCANER
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);*/
 /*Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        var tituloLibro = entrada2.nextLine();
        System.out.println("Ingrese el nombre del autor del libro: ");
        var autorLibro = entrada2.nextLine();
        System.out.println("el libro: "+" "+tituloLibro+" "+"fue escrito por: "+" "+autorLibro);/*
                      
               

        /*byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);  
        System.out.println("valor minimo del Byte:"+ Byte.MIN_VALUE);
        System.out.println("valor maximo del Byte:"+ Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);  
        System.out.println("valor minimo del Short:"+ Short.MIN_VALUE);
        System.out.println("valor maximo del Short:"+ Short.MAX_VALUE);
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);  
        System.out.println("valor minimo del Int:"+ Integer.MIN_VALUE);
        System.out.println("valor maximo del Int:"+ Integer.MAX_VALUE); 
        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);  
        System.out.println("valor minimo del Int:"+ Long.MIN_VALUE);
        System.out.println("valor maximo del Int:"+ Long.MAX_VALUE);*/
 /* float numFloat =3.4028235E38F;   //por default al poner un numero decimal lo toma como double por eso hay que poner una F
        //otra forma seria           float numFloat =(float) 10.0;
        System.out.println("numFloat= "+numFloat);
        System.out.println("El valor minimo de float:"+ Float.MIN_VALUE);
        System.out.println("El valor maximo de float:"+ Float.MAX_VALUE);
        
        double numDouble =1.7976931348623157E308D;
        System.out.println("numFloat= "+numDouble);
        System.out.println("El valor minimo de Double:"+ Double.MIN_VALUE);
        System.out.println("El valor maximo de Double:"+ Double.MAX_VALUE);*/
        //inferencia de tipo VAR y tipos primitivos
        /*var numEntero = 20; //las literales sin puntos automaticamente son de tipo INT
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //automaticamente con el punto decimal se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
        var numDOuble = 10.0;
        System.out.println("numDOuble = " + numDOuble);*/
        //tipos primitivos char  
        /*  char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char verCaracter = '\u0024'; //indicamos a java la asignacion con el codigo unicode
        System.out.println("verCaracter = " + verCaracter);
        
        char verCaracterDecimal =36; //valor decimal del juego de caracter unicode  
        System.out.println("verCaracterDecimal = " + verCaracterDecimal);
        
        char verCaracterSimbolo = '$'; // UN caracter especial, podemos copiar y pegar de unicode 
        System.out.println("verCaracterSimbolo = " + verCaracterSimbolo);
        //
        //
        var verCaracter1 = '\u0024'; //indicamos a java la asignacion con el codigo unicode
        System.out.println("verCaracter1 = " + verCaracter1);
        
        var verCaracterDecimal1 =(char)36; //en este caso no lo toma como un caracter char, lo toma como un numero entero de tipo int(automaticamente). por eso se pone en parentesis char , para que se asigne el simbolo
        System.out.println("verCaracterDecimal1 = " + verCaracterDecimal1);
        
        var verCaracterSimbolo1 = '$'; // UN caracter especial, podemos copiar y pegar de unicode 
        System.out.println("verCaracterSimbolo1 = " + verCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterchar = 'b';
        System.out.println("caracterchar = " + caracterchar); */
        //tipos primitivos tipos booleanos
        /* var varbool = true;
        System.out.println("varbool = " + varbool);
        
        if (varbool) { 
            System.out.println("la bandera es verde");
        }
        else{
            System.out.println("la vandera es roja");
        }
         */
 /*
        //algoritmo: es mayor de edad?
        var edad = 30; //literal tener presente la inferencia de tipos
        //var adulto = edad >= 18; //esta es una expresion booleana 
        
        if (edad >=18){
            System.out.println("eres mayor de edad");
        }
        else {
            System.out.println("eres menor de edad ");
        }*/
        //conversion de tipos primitivos 
//        var edad = Integer.parseInt ("20");
//        System.out.println("edad = " + (edad +1));
//        var valorPi = Double.parseDouble("3.1416");
//        System.out.println("valorPi = " + valorPi);
//       
//       //Pedir un valor
//        var entrada = new Scanner(System.in);
//        System.out.println("digite su edad: ");
//        edad = Integer.parseInt(entrada.nextLine());
//        System.out.println("edad = " + edad);
        //conversion de tipos primitibos PARTE 2
//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto);
//        
//        var fraseChar = "programadores".charAt(12);
//        System.out.println("fraseChar = " + fraseChar);
//        
//        System.out.println("digite un caracter :");
//        fraseChar = entrada.nextLine().charAt(0);
//        System.out.println("fraseChar = " + fraseChar);
//        short numEnteroShort = 32767;
//        System.out.println("numEnteroShort = " + numEnteroShort);  
//        System.out.println("valor minimo del Short:"+ Short.MIN_VALUE);
//        System.out.println("valor maximo del Short:"+ Short.MAX_VALUE);
//        int num1 = 5, num2 = 4;
//        var solucion = num1 + num2;
//        System.out.println("solucion de la suma = " + solucion);
//
//        solucion = num1 - num2;
//        System.out.println("solucion de la resta = " + solucion);
//
//        solucion = num1 * num2;
//        System.out.println("solucion de la multiplicacion = " + solucion);
//
//        solucion = num1 / num2;
//        System.out.println("solucion de la divicion = " + solucion); //cunado le asignamos a los numeros el tipo int da resultado tipo int es decir solo numeros entero
//
//        var solucion2 = 3.4 / num2;
//        System.out.println("el resultado de la division es = " + solucion2); //al tener un numero tipo double(3.4) el resultado se le asignara el tipo double por mas que trabaje con un tipo INT
//
//        solucion = num1 % num2; // guarda el resuido de la divicion
//        System.out.println("el resuido de la divicion 5/4 = " + solucion);
//
//        if (num1 % 2 == 0) {
//            System.out.println("el resultado es par");
//        } else {
//            System.out.println("es un numero impar");
//        }
//
//          int varNum1 = 1, varNum2 = 4;
//          var varNum3 = varNum1 + 6 - varNum2; //una operacion
//          System.out.println("varNum3 = " + varNum3);
//          
//          varNum1 += 1; // varNum1 = varnum1 + 1; Operador de composicion
//          System.out.println("varNum1 = " + varNum1);
        //   -=      *=      /=      %=
//         varNum1 = 5;  // Le asigno el valor de 5 a varNum1 cada vez que realizo una de estas operaciones, ya que estas le cambian el valor a la variable y la guarda 
//         varNum1 -= 3;
//         System.out.println("varNum1 = " + varNum1);
//         
//         varNum1 = 5;
//         varNum1 *= 3;
//         System.out.println("varNum1 = " + varNum1);
//         
//         varNum1 = 5;
//         varNum1 /= 3; 
//         System.out.println(" varNum1 = " +  varNum1);
//         
//         varNum1 = 5;
//         varNum1 %= 3;
//         System.out.println("varNum1 = " + varNum1);
        /*   //operadores Unarios: cambio de signo
           var varA = 7;
           var varB = -varA;
           System.out.println("varA = " + varA);
           System.out.println("varB = " + varB); // el resultado sera un numero negativo
           
           //operador de negacion 
           var varC = true; // esta literal por default en java es de tipo boolean
           var varD = !varC; // aqui invertimos el valor
           System.out.println("varC = " + varC);
           System.out.println("varD = " + varD);
           
           //operadores unitarios de INCREMENTO : Preincremento
           var varE = 9; // luego este valor se va a modificar
           var varF = ++varE; //simbolo antes de la variable (++)
           //primero se incrementa la variable y despues se usa su valor
           System.out.println("varE = " + varE); //se incrementa en la unidad
           System.out.println("varF = " + varF); // va a sumar uno
           
           //Post incremento (el simbolo va despues de ka variable)
           var varG =3;
           var varH = varG++; //primero el valor de la variable, luego el incremento (++)
           System.out.println("varG = " + varG);
           System.out.println("varH = " + varH);
         
          //Operadores unitarios de DECREMENTO
          var varI = 4;
          var varJ = --varI;
          System.out.println("varI = " + varI); // la variable ya esta con decremento
          System.out.println("varJ = " + varJ);
          
          //POSTdecremento
          var varK = 8;
          var varL = varK--;
          System.out.println("varK = " + varK);
          System.out.println("varL = " + varL); */
        // operadores de Igualdad y Relaciones
        //operadores de igualdad
        /* var aNum = 5;
          var bNum = 4;
          var cNum =(aNum==bNum);
          System.out.println("cNum = " + cNum);
          
          var dNum = aNum != bNum;
          System.out.println("dNum = " + dNum);
          
          var cadenaA = "hello";
          var cadenaB = "bye bye";
          var cVar = cadenaA == cadenaB;   // aqui realiza una comparacion de referencia de objeto 
          System.out.println("cVar = " + cVar);
          
          var fVar = cadenaA.equals(cadenaB); //aqui realiza la comparacion interna de la variable.
          System.out.println("fVar = " + fVar); 
          
          //Operadores Relacionales
          var gVar = aNum >= bNum; // aqui realiza una doble comparacion si aNum es mayor o igual a bNum 
          System.out.println("gVar = " + gVar); // se puede utilizar tambien > ; >= ; < ; <= ; == ; !=
         
          if (aNum % 2 == 0){
               System.out.println("el numero es par");
       } else {
               System.out.println("EL numero es impar");
               }
          
          var edad = 30;
          var adulto = 18;
          if (edad >= adulto){
              System.out.println(" es mayor de edad");
          }
          else{
              System.out.println("es menor de edad");
          }*/
        //Operadores condicionales AND (&&)y OR(||)
       /* var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var repuesta = valorA >= 0 && valorA <= 10;

        if (repuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }

        var vacaciones = true;
        var diaLibre = false;
        if (vacaciones || diaLibre) {
            System.out.println("Papa puede asistir al juego de su hijo");
        } else {
            System.out.println("Papa no puede asisitir el juego de su hijo");
        }*/
        
       /* // Operador Ternario
       var resultadoT = (5>4) ? "verdadero" : "falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT %2 == 0) ? "es par" : "es impar";
        System.out.println("resultadoT = " + resultadoT); */
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        var solucionAritmetrica = 4 + 5 * 6 / 3; // 4+((5*6)/3) =  4+(30/3) =  4+10 =14
        System.out.println("solucionAritmetrica = " + solucionAritmetrica);
        
        solucionAritmetrica = (4+5) * 6 /3; //  = (9 * 6) /3 = 54/3 =18 
        System.out.println("solucionAritmetrica = " + solucionAritmetrica);
        
        
        
    

    }
}
