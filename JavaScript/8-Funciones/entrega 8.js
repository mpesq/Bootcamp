/*
Crea un archivo JS que contenga las siguientes líneas

- Una función sin parámetros que devuelva siempre "true"

- Una función asíncrona que utilice un setTimeout y pase por consola un "Hola soy una promesa" 5 segundos después de haberse ejecutado

- Una función generadora de índices pares automáticos
*/

function returnTrue() {
  return true;
}

async function returnPromise() {
    return setTimeout(() => console.log("Hola soy una promesa"), 5000)
}

function* autoPair() {
    let par = 0;
    while(true) {
        par += 2;
        yield par;
    }
}

if(returnTrue()) {
    console.log("true");
}

returnPromise();

const pair = autoPair();

console.log(pair.next());
console.log(pair.next());
console.log(pair.next());
console.log(pair.next());