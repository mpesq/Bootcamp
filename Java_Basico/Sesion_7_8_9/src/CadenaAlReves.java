public class CadenaAlReves {

    /*
    Escribe el código que devuelva una cadena al revés.
    Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
     */

    public static String reverse(String texto) {
        StringBuilder strb = new StringBuilder(texto);
        return strb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hola mundo"));
    }
}
