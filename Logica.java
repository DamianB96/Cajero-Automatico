package clases;

import java.util.Scanner;

/**
 *
 * @author damian
 */
public abstract class Logica {

    Scanner in = new Scanner(System.in);

    protected int transacciones, retiro, deposito;
    private static int saldo;

    public void operaciones() {
        int volatil = 0;
        int select = 0;
        do {
            do {
                System.out.println("Seleccione una opcion:");
                System.out.println("    1. Consulta tu saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo .");
                System.out.println("    4. Salir.");
                select = in.nextInt();

                if (select >= 1 && select <= 4) {
                    volatil = 1;
                } else {
                    System.out.println("*************************************************************");
                    System.out.println("*La opcion elegida no existe, por favor, intentelo de nuevo.*");
                    System.out.println("*************************************************************");
                }
            } while (volatil == 0);

            if (select == 1) {
                Logica mensajero = new Consulta();
                mensajero.transacciones();
            } else if (select == 2) {
                Logica mensajero = new Retiro();
                mensajero.transacciones();
            } else if (select == 3) {
                Logica mensajero = new Deposito();
                mensajero.transacciones();
            } else if (select == 4) {
                System.out.println("**********************");
                System.out.println("Gracias, vuelva pronto");
                System.out.println("**********************");

            }

        } while (volatil != 2);
    }

    public void retiro() {
        retiro = in.nextInt();
    }

    public void deposito() {
        deposito = in.nextInt();
    }

    public abstract void transacciones();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
