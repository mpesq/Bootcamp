/*Crea un archivo JS que contenga las siguientes líneas

- Una variable que contenga tu altura en centímetros (entero)

- Una variable que contenga tu altura en metros (número de coma flotante)

- Una variable que contenga tu peso en kilogramos (número de coma flotante)

- Una variable que contenga tu altura en metros redondeada hacia arriba

- Una variable que contenga tu peso en kilogramos redondeado hacia abajo

- Una variable que contenga si "el máximo valor que se puede obtener en Javascript + 1" es igual al máximo valor que se puede obtener en Javascript
*/

let alturaCM = 170;
let alturaM = 1.71;
let peso = 83.4;

let alturaMRoundedUp = Math.ceil(alturaM);
let pesoRoundedDown = Math.floor(peso);

console.log(alturaMRoundedUp);
console.log(pesoRoundedDown);

esIgual = Number.MAX_VALUE + 1 === Number.MAX_VALUE;

console.log(esIgual)

