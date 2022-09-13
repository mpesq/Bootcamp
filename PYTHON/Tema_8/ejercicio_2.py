# En este segundo ejercicio, tendréis que crear un archivo py y dentro crearéis una clase Vehículo,
# haréis un objeto de ella, lo guardaréis en un archivo y luego lo cargamos.

from pickle import *

class Vehiculo:

    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo

    def __str__(self):
        return self.marca + ": " + self.modelo

Coche1 = Vehiculo("Volkswagen", "Golf")

archivo = open('vehiculos.txt', 'w+b')
dump(Coche1, archivo)
archivo.seek(0)
nuevoVehiculo = load(archivo)
print(nuevoVehiculo)
archivo.close()