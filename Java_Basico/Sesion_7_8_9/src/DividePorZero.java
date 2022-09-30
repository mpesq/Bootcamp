import java.util.Scanner;

public class DividePorZero {

    /*
    Crea una función DividePorCero.
     Esta, debe generar una excepción ("throws") a su llamante del
     tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
     Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
     Finalmente, mostraremos en cualquier caso: "Demo de código".
     */

    public static int dividir(int dividendo, int divisor) throws ArithmeticException {
        return dividendo / divisor;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 enteros:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            System.out.println(dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }
}
