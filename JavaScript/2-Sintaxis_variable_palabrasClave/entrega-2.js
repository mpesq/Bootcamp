/* Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:

- Tu nombre (string)

- Tu edad (number)

- ¿Eres desarrollador? (boolean)

- Tu fecha de nacimiento (Date)

- Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url) */

const lista = [
  "Marc",
  36,
  true,
  new Date(1986, 4, 10), // En el tipo Date los meses van del 0 al 11
  {
    titulo: "Quién se ha llevado mi queso?",
    autor: "Spencer Johnson",
    fecha: new Date(1998, 8, 8),
    url: "https://www.amazon.es/%C2%BFQui%C3%A9n-llevado-queso-Narrativa-empresarial/dp/8495787091",
  },
];

console.log(lista);
