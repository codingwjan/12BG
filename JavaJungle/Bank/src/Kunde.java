// Kunde.java
public class Kunde {
    private int Kundennummer;
    private String Vorname;
    private String Nachname;
    private Konto konto; // Assuming one account for simplicity

    // Getter and Setter for Kundennummer
    public int getKundennummer() {
        return Kundennummer;
    }

    public void setKundennummer(int Kundennummer) {
        this.Kundennummer = Kundennummer;
    }

    // Getter and Setter for Vorname
    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String Vorname) {
        this.Vorname = Vorname;
    }

    // Getter and Setter for Nachname
    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String Nachname) {
        this.Nachname = Nachname;
    }

    // Methods
    public double abfragenKontostand() {
        return konto.kontostandAbfragen();
    }

    public void einzahlenAufKonto(double betrag) {
        konto.einzahlen(betrag);
    }

    public boolean abhebenVonKonto(double betrag) {
        return konto.auszahlen(betrag);
    }

    public boolean ueberweisen(double betrag, Konto zielKonto) {
        return konto.ueberweisen(zielKonto, betrag);
    }
}
