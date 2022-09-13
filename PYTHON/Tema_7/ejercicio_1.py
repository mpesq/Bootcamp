# En este ejercicio tendréis que crear un módulo que contenga las operaciones básicas de una calculadora:
# sumar, restar, multiplicar y dividir.

# Este módulo lo importaréis a un archivo python y llamaréis a las funciones creadas.
# Los resultados tenéis que mostrarlos por consola.

import operaciones as op


def main():
    print(f"4 + 2 = {op.sumar(4, 2)}")
    print(f"4 - 2 = {op.restar(4, 2)}")
    print(f"4 * 2 = {op.multiplicar(4, 2)}")
    print(f"4 / 2 = {op.dividir(4, 2)}")

if __name__ == '__main__':
    main()