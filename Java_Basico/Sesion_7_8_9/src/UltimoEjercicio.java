import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UltimoEjercicio {
    /*
    Sorpréndenos creando un programa de tu elección que utilice:
    InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

    Mi programa lee un archivo txt con numeros, los multiplica por 2 y los imprime en otro archivo txt.
    Ha de ser una linea de enteros separados por espacios.
    Me ha faltado el HashMap pero no se me ha ocurrido nada para implementarlo.
     */

    public static String deBytesAString(byte[] arrayBytes) {
        StringBuilder strb = new StringBuilder();
        for(byte dato : arrayBytes) {
            strb.append((char)dato);
        }
        return strb.toString();
    }

    public static ArrayList<Integer> introEnArrayList(String[] strings) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String str : strings) {
            arrayList.add(Integer.parseInt(str));
        }
        return arrayList;
    }

    private static String dobleAString(ArrayList<Integer> arrayListInt) {
        String resultado = "";
        for (int i = 0; i < arrayListInt.size(); i++) {
            resultado = resultado + (arrayListInt.get(i) * 2);
            if (i < arrayListInt.size() - 1) {
                resultado = resultado + " ";
            }
        }
        return resultado;
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo:");
        String entrada = scanner.nextLine();
        try {
            InputStream input = new FileInputStream(entrada);
            byte[] datos = input.readAllBytes();
            input.close();
            String[] arrayStrings = deBytesAString(datos).split(" ");
            ArrayList<Integer> arrayListInt = introEnArrayList(arrayStrings);
            String doble = dobleAString(arrayListInt);

            datos = doble.getBytes();
            System.out.println("Introduce la ruta de destino:");
            String salida = scanner.nextLine();
            PrintStream output = new PrintStream(salida);
            output.write(datos);
            output.close();



        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }


}
