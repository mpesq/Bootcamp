import java.util.Scanner;

/**
 * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */

public class Sesion2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio = sc.nextInt();
        System.out.println(precioIva(precio));

    }

    static double precioIva(int precio) {
        return precio * 1.21;
    }
}
