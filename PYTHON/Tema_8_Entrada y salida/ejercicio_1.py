# En este ejercicio, tendréis que crear un archivo py donde creéis un archivo txt,
# lo abráis y escribáis dentro del archivo.
# Para ello, tendréis que acceder dos veces al archivo creado.

def escribir():
    f = open('ejemplo.txt', 'w')
    f.write("Hola, soy Marc, alumno de OpenBootcamp")
    f.close()

def leer() -> str:
    f = open('ejemplo.txt', 'r')
    texto = f.read()
    f.close()
    return texto

def main():
    escribir()
    print(leer())

if __name__ == '__main__':
    main()