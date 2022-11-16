//Ejercicio1:Calcular estacion de ano
let mes =1;
let estacion; //Undifined
if (mes == 1 || mes ==2 || mes ==12 ){
    estacion = "verano";
}
else if(mes == 3 || mes == 4 || mes ==5 ){
    estacion = "Otono ";
}
else if(mes == 7 || mes == 6 || mes ==8 ){
    estacion = " Invierno "
}
else if(mes == 10 || mes == 11 || mes == 9 ){
    estacion = " Primavera ";
}
else{
    estacion ="valor incorrecto";
}
console.log("El mes " +mes+ " se encuentra en la estacion: "+estacion)

//Ejercicio2: Hora del dia 
let hora =5 ;
let mensaje;

if(hora >= 6 && hora <= 11){
    mensaje = "Buen dia";
} 
else if (hora >=12 && hora <= 16){
    mensaje = "hora de la siesta";
}
else if(hora >=17 && hora <= 19){
    mensaje= "buenas tardes";
}
else if(hora >=20 && hora <= 23){
mensaje= "es de noche";

}
else if(hora >=0 && hora <= 5){
    mensaje= "es de noche";
    
    }
else{
    mensaje= "valor incorrecto";
}
console.log(mensaje)


//Estructura Switch(La sintaxis es igual a java)
switch(mes){
    case 1: case 2: case 12:
        estacion = "verano";
        break;
    case 3: case 4: case 5:
        estacion = "otono";
        break;
    case 6: case 7: case 8:
        estacion = "invierno";
        break;
    case 9: case 10: case 11:
        estacion = "primavera";
        break;
    default:
        estacion ="valor incorrecto"
}   
console.log(estacion)


//Ampliamos el uso de var; let; y const;

/*
con var puedes reasignar en cualquier momento;
esta forma parte del ambito global 
Un error es que se sobreescriba 
*/ 
var nombre ="angel";
nombre = "ariel";
console.log(nombre);

function saludar(){
    var nombre3 ='natalia';
    console.log(nombre3);    
}
//console.log(nombre3); //El problema es que aqui no lee el dato de la funcion 


if(true){
    var edad =34;
    console.log(edad);
}
console.log(edad)//En esta funcion, fonciono correctamente, en la estuctura if fallo

/*
let: esta puede ser reasignada en cualquier momento 
la diferencia es que su ambito es de bloque,
o dentro de una funcion
*/ 
function saludar2(){
    let nombre2 ="Angel";
    console.log(nombre2);
}
//console.log(nombre2)

if(true){
    let edad2 =35;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valores constantes que no se pueden reasignar 
*/ 
const fechaNacimiento = 2000;
console.log(fechaNacimiento);
//fechaNacimiento = 2001;
//console.log(fechaNacimiento); //Solo se ejecuta el console anterior