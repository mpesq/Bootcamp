public class EstructurasDeControl {

    public static void main(String[] args) {

        String[] nombres = {"Manuel", "Roberto", "Mario"};
        String resultado = "";
        boolean esPrimero = true;

        for(String nombre : nombres) {
            if(esPrimero) {
                resultado = resultado + nombre;
                esPrimero = false;
            } else {
                resultado = resultado + " " + nombre;
            }
        }

        System.out.println(resultado);
    }
}
