package clases;

/**
 *
 * @author damian
 */
public class Consulta extends Logica {

    @Override
    public void transacciones() {
        System.out.println("**********************");
        System.out.println("Tu saldo actual es de: " + getSaldo());
        System.out.println("**********************");
    }
}
