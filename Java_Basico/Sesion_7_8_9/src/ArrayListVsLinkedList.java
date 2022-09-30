import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    /*
    Crea un ArrayList de tipo String, con 4 elementos.
    Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Manzana");
        list.add("Melón");
        list.add("Sandía");
        list.add("Naranja");


        LinkedList<String> listLink = new LinkedList<>();
        for (String fruta : list) {
            listLink.add(fruta);
        }

        System.out.println("Recorriendo ArrayList:");
        for (String fruta : list) {
            System.out.println(fruta);
        }

        System.out.println("\nRecorriendo LinkedList:");
        for (int i = 0; i < listLink.size(); i++) {
            System.out.println(listLink.get(i));
        }



    }
}
