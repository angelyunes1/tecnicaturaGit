var nombre = 'Jose';
var apellido = 'Montes';
var nombreCompleto = nombre +' '+ apellido;// Primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = 'Ariel'+' '+'Bentacud'; // Segunda concatenacion
console.log(nombreCompleto2);
var juntos = nombre + 219; //lee de izquierda a derecha siguiendo la cadena, lee el numero como tipo str
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);
juntos = nombre + (78 + 17); //Aqui se puede diferenciar los tipos de datos con parentecis, es decir str y (int)
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos); //lee de izquierda a derecha siguiendo la cadena, como en este caso empieza con int, hace la suma

nombre += apellido //Tercera conquetanacion Concatenamos usando el operador simplificado
console.log(nombre)

//Hoy ya no se usa var, se utiliza let y const
let nombre2 = 'Pedro';
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Peres"; una constante no puede ser modificada
console.log(apellido2)

let x, y; //se pueden crear  varias variables dentro de una misma linea
x = 17, y = 21; //Se puede hacer asignacion de varias variables dentro de la misma linea
let z = x + y; // se asigna el valor de la operacion
console.log(z)

let _1num = 31; // no utilizar numeros para iniciar el nombre de una variable
let rompiendo  ="rompe";// No utilizar palabras recervadas para variables
console.log(_1num)
console.log(rompiendo)
