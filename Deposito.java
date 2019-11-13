package clases;

/**
 *
 * @author damian
 */
public class Deposito extends Logica {

    @Override
    public void transacciones() {

        System.out.println("Cuanto deseas depositar? ");
        deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);

        System.out.println("*****************************");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es de: " + getSaldo());
        System.out.println("*****************************");
    }
}
