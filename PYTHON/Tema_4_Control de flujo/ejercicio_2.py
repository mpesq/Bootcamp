# Escribe un programa capaz de mostrar todos los números impares desde un número de inicio y otro final.
#
# Por ejemplo: teniendo numero_inicial = 2 y numero_final = 8, el programa debe imprimir por consola: [3, 5, 7]

numero_inicial: int = int(input("Introduce el número inicial "))
numero_final: int = int(input("Introduce el número final "))
resultado: [int] = []

while numero_inicial >= numero_final:
    numero_final: int = int(input("El número final tiene que ser mayor que el inicial!!! Introduce otro número final: "))

for valor in range(numero_inicial, numero_final + 1):
    if not (valor % 2) == 0:
        resultado.append(valor)

print(resultado)