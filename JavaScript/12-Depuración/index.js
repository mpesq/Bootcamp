/*
Crea un nuevo fichero JS que contenga las siguientes líneas

- Una función que admita un parámetro "num", y devuelva una lista con esa cantidad de números de la secuencia de Fibonacci (Por ejemplo: num = 6 => Resultado [1, 1, 2, 3, 5, 8])

- Ejecuta la depuración de VSCode para visualizar la ejecución de la función
*/

function fibonacci(num) {
    let resultado = [1, 1];
    for(let i = 2; i < num; i++) {
        resultado.push(resultado[i-2] + resultado[i-1]);
    }
    if(num === 1) {
        resultado.pop();
    }
    else if (num === 0) {
        resultado.splice(0, 2);
    }
    return resultado;
}

console.log(fibonacci(6));