let numero = 10;
let factorial = numero;
let i = numero - 1;

factorialWhile: while (i >= 0) {
  if (i == 0) {
    break;
  }
  factorial *= i;
  i--;
}

console.log(factorial);
