#En este segundo ejercicio, tendréis que crear un programa que tenga una clase
# llamada Alumno que tenga como atributos su nombre y su nota.
# Deberéis de definir los métodos para inicializar sus atributos,
# imprimirlos y mostrar un mensaje con el resultado de la nota y si ha aprobado o no.
class Alumno:

    def inicializar(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def imprimir(self):
        print(f"Nombre: {self.nombre}")
        print(f"Nota: {self.nota}")

    def aprobado(self):
        if self.nota < 5:
            print("No ha aprobado\n")
        else:
            print("Sí ha aprobado\n")

Mario = Alumno()

Mario.inicializar("Mario", 5)
Mario.imprimir()
Mario.aprobado()

Jose = Alumno()
Jose.inicializar("Jose", 4.5)
Jose.imprimir()
Jose.aprobado()