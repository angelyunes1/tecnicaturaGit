//Ejercicio para encontrar numeros pares e impares 
let parInpar = 10;
if(parInpar % 2 ==0){
    console.log("Es un numero par")
}
else{
    console.log("el numero es impar")
}

//Ejercicio: es mayor de edad
let edad = 18, adulto = 18;
if(edad >=adulto){
    console.log("Es mayor de edad")
}
else{
    console.log("Es menor de edad")
}

//Ejercicio:dentro de un rango
let dentroRango = 10; //aqui cambiaremos el valor
let valMin = 0, valorMax =10;
if(dentroRango >=valMin && dentroRango <= valorMax){
    console.log("esta dentro del rango establecido")
}
else{
    console.log('Esta fuera del rango establecido')
}

//Ejercicio:Si el padre puede ir a ver el juego del hijo
let vacaiones = false,diaDescanso = false;
if (vacaiones || diaDescanso){
    console.log("el padre puede asistir al juego de su hijo")
}
else{
    console.log("el padre no puede asistir al juego de su hijo")
}

//Operador ternario
let resultado2 = 3 > 2 ? "verdadero":"falso";
console.log(resultado2)

let numero = 9;
resultado2 =numero % 2 == 0 ? "Es un numero par":"es un numero impar"
console.log(resultado2)

//convertir string a numero
let miNumero = "10";//es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); //Esta es una funcion
console.log(typeof edad2)

//Funcion isNan
if(isNaN(edad2)){//no es un numero = is not a Number (devuelve un resultado booleano)
    console.log("Esta variable no contiene solo numeros")
}
else{
     if (edad2 >=18){
        console.log("Puede votar");
    } 
    else{
        console.log("No puede votar");
    }  
}

//Operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar":"No puede votar";
console.log(resultado3);

