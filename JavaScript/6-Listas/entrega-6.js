/*Crea un archivo JS que contenga las siguientes líneas

- Una variable que contenga la lista de la compra (mínimo 5 elementos)

- Modifica la lista de la compra y añádele "Aceite de Girasol"

- Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol"

- Una lista de tus 3 películas favoritas (objetos con propiedades: titulo, director, fecha)

- Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter)

- Una nueva lista que contenga los directores de la lista de películas original (utilizando map)

- Una nueva lista que contenga los títulos de la lista de películas original (utilizando map)

- Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat)

- Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación)
*/

const listaCompra = [
  "agua",
  "papel wc",
  "detergente lavadora",
  "lechuga",
  "naranjas",
];
console.log(listaCompra);

listaCompra.push("Aceite de Girasol");
console.log(listaCompra);

listaCompra.pop();
console.log(listaCompra);

const peliculas = [
  {
    titulo: "Intocable",
    director: "Olivier Nekache y Éric Toledano",
    fecha: new Date(2011, 10, 2)
  },
  {
    titulo: "La lista de Schindler",
    director: "Steven Spielberg",
    fecha: new Date(1993, 10, 30)
  },
  {
    titulo: "Forrest Gump",
    director: "Robert Zemeckis",
    fecha: new Date(1994, 6, 6)
  }
];

const peliculasPosteriores = peliculas.filter(peli => peli.fecha > new Date(2010, 0, 1));
console.log(peliculasPosteriores);

const directores = peliculas.map(peli => {
    return peli.director;
});
console.log(directores)

const titulos = peliculas.map(peli => {
    return peli.titulo;
});
console.log(titulos);

const directoreTitulos1 = directores.concat(titulos);
console.log(directoreTitulos1);

const directoreTitulos2 = [...directores, ...titulos];
console.log(directoreTitulos2);