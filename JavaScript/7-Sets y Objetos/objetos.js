/*Crea un archivo llamado objetos.js que contenga las siguientes líneas

- Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)

- Una variable que obtenga tu edad a partir del objeto anterior

- Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s

- Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor
*/

const obj = {
  nombre: "Marc",
  apellido: "Pesquera",
  edad: 36,
  altura: 1.7,
  eresDesarrollador: true,
};

const varEdad = obj.edad;
console.log(varEdad);

const listObj = [
  {
    ...obj,
  },
  {
    nombre: "Javi",
    apellido: "Albert",
    edad: 35,
    altura: 1.9,
    eresDesarrollador: false,
  },
  {
    nombre: "Borja",
    apellido: "Igual",
    edad: 32,
    altura: 1.95,
    eresDesarrollador: false,
  },
];

console.log(listObj)

const listObjOrdenada = listObj.sort((a, b) => b.edad - a.edad);

console.log(listObjOrdenada);