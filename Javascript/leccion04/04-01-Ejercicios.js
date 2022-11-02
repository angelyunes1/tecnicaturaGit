


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