package Sesion2;

import java.util.function.Function;



public class Funcionales {

    //Funciónes de alto nivel mediante lambda
    private Function<String, String> toMayus = (x) -> x.toUpperCase();
    private Function<Integer,Integer> sumador = (x) -> x.sum(x, x);

    public void pruebas() {
        Saluda(toMayus, "Victor ");

        //System.out.println(toMayus.apply("Victor"));
        //System.out.println(sumador.apply(5));
    }

    public void Saluda(Function<String, String> mifuncion, String nombre) {
        mifuncion.apply(nombre);
    }
}
