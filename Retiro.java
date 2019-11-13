package clases;

/**
 *
 * @author damian
 */
public class Retiro extends Logica {

    @Override
    public void transacciones() {

        System.out.println("Cuanto deseas retirar? ");
        retiro();

        if (retiro <= getSaldo()) {
            transacciones = getSaldo();

            setSaldo(transacciones - retiro);

            System.out.println("************************");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("************************");
        } else {
            System.out.println("*************************************************");
            System.out.println("Su saldo es insuficiente para esta transferencia.");
            System.out.println("*************************************************");
        }
    }
}
