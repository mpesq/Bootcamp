#En este segundo ejercicio, tendréis que crear una interfaz sencilla
# la cual debe de contener una lista de elementos seleccionables,
# también debe de tener un label con el texto que queráis.

import tkinter as tk

window = tk.Tk()

lista = ['Seat', 'Volkswagen', 'Audi', 'Kia', 'BMW', 'Toyota']
lista_items = tk.StringVar(value=lista)
listbox_coches = tk.Listbox(window, height=10, listvariable=lista_items)
label = tk.Label(text="Marcas de coche")

listbox_coches.pack(padx=10, pady=10)
label.pack(padx=10, pady=10)
window.mainloop()