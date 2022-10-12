// Tipos de datos en javaScrip
/*
Comentarios en multiple lineas
La sintaxis de comentarios es muy similar a Java
*/

//tipo Str
var nombre = 'Ariel'; 
console.log(typeof nombre);
//tipo numerico
nombre = 7;
console.log(typeof nombre)
nombre = 12.5;
console.log(typeof nombre)
//tipo numerico
var numero = 3000;
console.log(numero);

var objeto = {
    nombre : "Ariel",
    apellido : "Bentacud",
    telefono : "261214122"
}
console.log(objeto);
//tipo de dato booleano
var bandera = true;
console.log(bandera);

//Tipo de dato Funcion
function miFuncion(){}
console.log(typeof miFuncion);

// Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipos de dato clase
class Persona {
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona)

//Tipo de dato undefined
var x ; 
console.log(x);

x = undefined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; // null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ['citroen','audi','ford','bmw'];
console.log(autos);
console.log(typeof autos); //Preguntamos que tipo de dato es (object)

var z = ''; 
console.log(z) //esto se refiere a que es una cadena vacia (empty string)
console.log(typeof z)

