import java.util.stream.IntStream;

public class Main {

    //Factoral funcional
    public static int factorial(int n) {
        return IntStream.rangeClosed(1,n).reduce(1, (a,b) -> a * b);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
