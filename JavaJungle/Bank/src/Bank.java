import java.util.ArrayList;

public class Bank {
    private ArrayList<Konto> konten = new ArrayList<>();
    private ArrayList<Kunde> kunden = new ArrayList<>();

    public void addKonto(Konto konto) {
        konten.add(konto);
    }

    public void addKunde(Kunde kunde) {
        kunden.add(kunde);
    }
}
