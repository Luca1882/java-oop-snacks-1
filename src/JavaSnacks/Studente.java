package JavaSnacks;

public class Studente {
    private String nome;
    private String cognome;
    private int eta;

    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        }
    public String getInfo () {
        return nome + " " + cognome + ", " + eta + " anni";
    }
}
