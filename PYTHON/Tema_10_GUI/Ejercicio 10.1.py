#En este ejercicio tenéis que crear una lista de RadioButton que muestre la opción que se ha seleccionado
# y que contenga un botón de reinicio para que deje
# Al principio no tiene que haber una opción seleccionada.

#libreria tkinter para crear GUI



import tkinter
from tkinter import ttk

def Reiniciar(event):
    selected.set(None)


window = tkinter.Tk() #crea ventana

window.columnconfigure(0, weight=1)
window.columnconfigure(1, weight=3)

selected = tkinter.StringVar()

rb1 = ttk.Radiobutton(window, text='valor 1', value='1', variable=selected)
rb2 = ttk.Radiobutton(window, text='valor 2', value='2', variable=selected)
rb3 = ttk.Radiobutton(window, text='valor 3', value='3', variable=selected)
button = tkinter.Button(window, text='Reiniciar')

rb1.grid(column=0, row=1, pady=5, padx=5)
rb2.grid(column=0, row=2, pady=5, padx=5)
rb3.grid(column=0, row=3, pady=5, padx=5)
button.grid(column=0, row=4, pady=5, padx=5, columnspan=2)

button.bind('<Button-1>', Reiniciar)
window.mainloop() # loop para mantener el programa en ejecucion