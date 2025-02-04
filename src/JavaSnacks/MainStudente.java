package JavaSnacks;

public class MainStudente {
    public static void main(String[] args) {
        // Creazione di un oggetto Studente
        Studente studente1 = new Studente("Anselmo", "Bitta", 24);

        // Stampa delle informazioni dello studente
        System.out.println(studente1.getInfo());
    }
}
