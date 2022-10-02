let numero = 7;
let factorial = numero;

factorialFor: for (let i = numero - 1; i > 0; i--) {
  factorial *= i;
}

console.log(factorial);
