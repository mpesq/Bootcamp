#En este ejercicio tendréis que crear una tabla llamada Alumnos que constará de tres columnas: la columna id de tipo entero,
# la columna nombre que será de tipo texto y la columna apellido que también será de tipo texto.

#Una vez creada la tabla, tenéis que insertarle datos, como mínimo tenéis que insertar 8 alumnos a la tabla.

#Por último, tienes que realizar una búsqueda de un alumno por nombre y mostrar los datos por consola.

import sqlite3

def crear_tabla():
    conn = sqlite3.connect('mifichero.db')
    cursor = conn.cursor()
    rows = cursor.execute("CREATE TABLE alumnos(id INT, nombre TEXT, apellido TEXT)")
    conn.commit()
    cursor.close()
    conn.close()

def introducir_valores():
    conn = sqlite3.connect('mifichero.db')
    cursor = conn.cursor()
    cursor.execute("INSERT INTO alumnos VALUES(1, 'Javier', 'García')")
    cursor.execute("INSERT INTO alumnos VALUES(2, 'Ramiro', 'Romero')")
    cursor.execute("INSERT INTO alumnos VALUES(3, 'Manuel', 'González')")
    cursor.execute("INSERT INTO alumnos VALUES(4, 'Marcos', 'Palanques')")
    cursor.execute("INSERT INTO alumnos VALUES(5, 'Mario', 'Pesquera')")
    cursor.execute("INSERT INTO alumnos VALUES(6, 'Roberto', 'Pascual')")
    cursor.execute("INSERT INTO alumnos VALUES(7, 'Jose', 'Ramírez')")
    cursor.execute("INSERT INTO alumnos VALUES(8, 'Juanjo', 'Pérez')")
    conn.commit()
    cursor.close()
    conn.close()

def buscar_alumno(nombre, apellido):
    conn = sqlite3.connect('mifichero.db')
    cursor = conn.cursor()
    rows = cursor.execute(f"SELECT * FROM alumnos WHERE nombre = '{nombre}' and apellido = '{apellido}'")
    for row in rows:
        print(row)

    cursor.close()
    conn.close()

def main():
    crear_tabla()
    introducir_valores()
    buscar_alumno('Marcos', 'Palanques')

if __name__ == "__main__":
    main()