public class ArrayBidimensional {

    /*
    Crea un array bidimensional de enteros y recórrelo, mostrando la posición
    y el valor de cada elemento en ambas dimensiones.
     */

    public static void main(String[] args) {
        int[][] arrayBidi = {{3, 8, 9}, {7, 4, 5}, {3, 2, 1}};
        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Fila: "+ (i + 1) + " Columna: " + (j + 1) + " -> " + arrayBidi[i][j]);
            }
        }
    }
}
