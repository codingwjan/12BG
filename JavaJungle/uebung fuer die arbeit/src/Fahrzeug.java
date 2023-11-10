public class Fahrzeug {
    private String kennzeichen;
    private String modell;
    private String typ;
    private double baujahr;

    public Fahrzeug() {

        Buchung hinzufuegenBuchung = new Buchung();

    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(double baujahr) {
        this.baujahr = baujahr;
    }
}
