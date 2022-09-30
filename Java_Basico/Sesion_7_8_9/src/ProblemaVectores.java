public class ProblemaVectores {
    /*
    Indica cuál es el problema de utilizar un Vector con la capacidad
    por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
     */

    public static void main(String[] args) {
        System.out.println("El problema es que al iniciar el vector crea por debajo un array subyacente" +
                " de tamaño 10 por defecto. Si nosotros sobrepasamos las 10 posiciones,\nautomáticamente" +
                " el tamaño se multiplica por 2, por lo que si el vector es muy grande, desperdiciamos" +
                " mucha memória.");
    }
}
