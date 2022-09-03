# Escribe un programa que sea capaz de mostrar los números del 1 al 100 en orden inverso.

orden_normal: int = []

for i in range(1, 100 + 1):
    orden_normal.append(i)

orden_inverso: int = sorted(orden_normal, reverse = True)

print(orden_inverso)