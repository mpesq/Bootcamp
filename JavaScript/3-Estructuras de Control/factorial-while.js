let numero = 10;
let factorial = numero;
let i = numero - 1;

factorialWhile: while (i > 0) {
  factorial *= i;
  i--;
}

console.log(factorial);
