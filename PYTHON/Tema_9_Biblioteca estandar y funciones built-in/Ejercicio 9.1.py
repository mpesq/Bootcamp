#Crea un script que le pida al usuario una lista de países (separados por comas).
# Éstos se deben almacenar en una lista. No debería haber países repetidos (haz uso de set).
# Finalmente, muestra por consola la lista de países ordenados alfabéticamente y separados por comas.

def capitalizePaises(setPaises):
    salida = set()
    for pais in setPaises:
        salida.add(pais.capitalize())
    return salida

def main():
    entrada = input("Introduce paises separados por comas: ")
    setPaises = set(entrada.split(','))
    sorted(setPaises, reverse=False)
    setPaises = capitalizePaises(setPaises)
    salida = ','.join(setPaises)
    print(salida)

if __name__ == '__main__':
    main()
