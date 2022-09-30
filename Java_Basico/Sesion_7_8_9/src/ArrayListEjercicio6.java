import java.util.ArrayList;

public class ArrayListEjercicio6 {

    /*
    Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    A continuación, con otro bucle, recórrelo y elimina los numeros pares.
    Por último, vuelve a recorrerlo y muestra el ArrayList final.
    Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno
     */

    public static void main(String[] args) {

        ArrayList<Integer> diez = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            diez.add(i);
        }

        for (int i = 0; i < diez.size(); i++) {
            if (diez.get(i) % 2 == 0) diez.remove(i);
        }

        System.out.println(diez);
    }


}
