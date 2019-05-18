package clases;

/**
 *
 * @author damian
 */
public class classMain {

    public static void main(String[] args) {

        padreAbstracta mensajero = new hijaConsulta();
        mensajero.setSaldo(5000);
        mensajero.operaciones();
    }
}
