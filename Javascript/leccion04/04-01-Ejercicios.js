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

//evitar repetir tu codigo
//Dry don't repeat yourself
//let days = ['Lunes','Martes','Miercoles','Jueves','Viernes','Sabado','Domingo'];
let days= "Miercoles"

switch(days){
    case 'Lunes':
        console.log('Hoy es: '+days)
        break;
    case 'Martes':
        console.log('Hoy es: '+days)
        ;break
    case 'Miercoles':
       console.log('Hoy es: '+days)  
       break;  
    case 'Jeuves':
        console.log('Hoy es: '+days)  
        break;  
    case 'Viernes':
       console.log('Hoy es: '+days)  
       break; 
    case 'Sabado':
        console.log('Hoy es: '+days)  
        break; 
    case 'Domingo':
       console.log('Hoy es: '+days)  
       break; 
    default:
        console.log("error al ingresar el dia")
        break;
       
}
//Esta es la opcion mejorada
let days2 = ['Lunes','Martes','Miercoles','Jueves','Viernes','Sabado','Domingo'];
function getDay(n){
    if (n<1 || n >7){
        throw new Error('Out of range');
    }
    return days2[n-1];
}
console.log(getDay(5));


let month = 11

switch(month){
    case 1:
        console.log("Es enero")
        break;
    case 2:
        console.log("Es febrero")
        break;
    case 3:
        console.log("Es marzo")
        break;
    case 4:
        console.log("Es abril")
        break;
    case 5:
        console.log("Es mayo")
        break;
    case 6:
        console.log("Es junio")
        break;
    case 7:
        console.log("Es julio")
        break;
    case 8:
        console.log("Es agosto")
        break;
    case 9:
        console.log("Es septiembre")
        break;
    case 10:
        console.log("Es Octubre")
        break;
    case 11:
        console.log("Es Noviembre")
        break;
    case 12:
        console.log("Es Diciembre")
        break;
    default:
        console.log("error al ingresar el mes")
        break;
    
}

let month2 = ['Enero','Febrero','Marzo','Abril',"Mayo",'Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'];
function getMonth(n){
    if(n < 1 || n > 12){
        throw new console.error('out of range');
    }
    return month2[n-1];

}
console.log(getMonth(12));