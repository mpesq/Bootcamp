# Escribe un programa en la consola de python que pida al usuario su peso (en kg) y estatura (en metros),
# calcule el índice de masa corporal y lo almacene en una variable,
# e imprima por pantalla la frase Tu índice de masa corporal es donde es el índice de masa corporal calculado
# redondeado con dos decimales.

peso = input("Introduce tu peso en Kg: ")
estatura = input("Introduce tu estatura en m: ")
indiceMasaCorporal = round(float(peso)/float(estatura)**2, 2)
print("Tu índice de masa corporal es: " + str(indiceMasaCorporal))