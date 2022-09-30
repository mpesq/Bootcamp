public class ArrayUnidimensional {
    /*
    Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
     */

    public static void main(String[] args) {
        String[] arrayUni = {"Messi", "Ronaldo", "Mbappe", "Neymar", "Vinicius"};
        for (String jugador : arrayUni) {
            System.out.println(jugador);
        }
    }
}
