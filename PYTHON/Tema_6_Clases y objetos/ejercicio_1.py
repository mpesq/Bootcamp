4#En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:

#Color

#Ruedas

#Puertas

#Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:

#Velocidad

#Cilindrada

#Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.

class Vehicle:
    _colour: str = None
    _ruedas: int = None
    _puertas: int = None

    def __init__(self, _colour: str, _ruedas: int, _puertas: int):
        self._colour = _colour
        self._ruedas = _ruedas
        self._puertas = _puertas

class Car(Vehicle):
    _velocidad: int = None
    _cilindrada: int = None

    def __init__(self, _colour: str, _ruedas: int, _puertas: int, _velocidad, _cilindrada ):
        super().__init__(_colour, _ruedas,_puertas)
        self._velocidad =_velocidad
        self._cilindrada = _cilindrada

coche = Car("Red", 4, 4, 250, 2000)
print(f"Color: {coche._colour}")
print(f"Ruedas: {coche._ruedas}")
print(f"Puertas: {coche._puertas}")
print(f"Velocidad: {coche._velocidad}")
print(f"Cilindrada: {coche._cilindrada}")
