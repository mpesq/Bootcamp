import java.util.Vector;

public class ExerciseVector {

    /*
    Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
    Elimina el 2o y 3er elemento y muestra el resultado final.
     */

    public static void main(String[] args) {
        Vector<String> nombres = new Vector<>();
        nombres.add("Marc");
        nombres.add("Victor");
        nombres.add("Roberto");
        nombres.add("Julia");
        nombres.add("Ana");

        nombres.remove(1);
        nombres.remove(2);

        System.out.println(nombres);
    }
}
