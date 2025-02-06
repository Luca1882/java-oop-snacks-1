package JavaSnacks;

public class contoBancario {
    private int numeroConto;
    private double saldo;

    //Costruttore
    public contoBancario(String number) {
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    //Metodo di deposito
    public void deposito(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito di " + importo + " effettuato. Saldo attuale " + saldo);
        } else {
            System.out.println("L'importo deve essere positivo");
        }
    }

    //Metodo di prelievo
    public void prelievo(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("E' stato prelevato " + importo + ". Saldo attuale " + saldo);
        } else if (importo > saldo) {
            System.out.println("Saldo insufficiente");
        } else {
            System.out.println("L'importo deve essere positivo");
        }
    }

    //Numero conto
    public int getNumeroConto() {
        return numeroConto;
    }

    //Saldo corrente
    public double getSaldo() {
        return saldo;
    }

}
