package JavaSnacks;

import java.util.Scanner;

public class mainConto {
    public static void main(String[] args) {
        contoBancario conto = new contoBancario("12345");
        Scanner scan = new Scanner(System.in);

        // Visualizza numero di conto e saldo
        System.out.println("Numero di conto: " + conto.getNumeroConto());
        System.out.println("Saldo iniziale: " + conto.getSaldo());

        //Deposito
        System.out.println("Digita l'importo che vuoi depositare: ");
        double importoDeposito = scan.nextDouble();
        conto.deposito(importoDeposito);

        //Prelievo
        System.out.println("Inserisci l'importo da prelevare: ");
        double importoPrelievo = scan.nextDouble();
        conto.prelievo(importoPrelievo);

        //Stampa
        System.out.println("Il saldo finale è: " + conto.getSaldo());
    }
}
