public class Konto {
    private String iban;
    private Double kontostand;

    public Konto(String iban, Double kontostand) {
        this.iban = iban;
        this.kontostand = kontostand;
    }

    public double kontostandAbfragen() {
        return this.kontostand;
    }

    public void einzahlen(Double betrag) {
        this.kontostand += betrag;
    }

    public boolean auszahlen(Double betrag) {
        if (this.kontostand - betrag >= 1 && betrag > 0) {
            this.kontostand -= betrag;
            return true;
        }
        return false;
    }

    public boolean ueberweisen(Konto ziel, Double betrag) {
        if (auszahlen(betrag)) {
            ziel.einzahlen(betrag);
            return true;
        }
        return false;
    }
}
