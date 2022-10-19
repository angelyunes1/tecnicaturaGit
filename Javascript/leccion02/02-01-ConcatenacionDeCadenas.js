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

nombre += apellido //Concatenamos usando el operador simplificado
console.log(nombre)