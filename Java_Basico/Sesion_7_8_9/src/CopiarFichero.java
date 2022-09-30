import java.io.*;
import java.util.Scanner;

public class CopiarFichero {

    /*
    Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
    "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero
    dado en el parámetro "fileIn" al fichero dado en "fileOut".
     */

    public static void copiar(String fileIn, String fileOut) throws Exception {
        try {
            InputStream input = new FileInputStream(fileIn);
            byte[] datos = input.readAllBytes();
            input.close();

            PrintStream output = new PrintStream(fileOut);
            output.write(datos);
            output.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un problema. Vuelve a intentarlo.\n" + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta de origen");
        String origen = scanner.nextLine();
        System.out.println("Introduce la ruta de destino");
        String destino = scanner.nextLine();
        copiar(origen, destino);

    }
}
