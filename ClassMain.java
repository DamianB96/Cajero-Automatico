package clases;

/**
 *
 * @author damian
 */
public class ClassMain {

    public static void main(String[] args) {

        Logica mensajero = new Consulta();
        mensajero.setSaldo(5000);
        mensajero.operaciones();
    }
}
