import java.util.Date;

public class Buchung {
    private int autowert;
    private int buchungsnummer;
    private Date buchungsdatum;
    private Date nutzungsbeginn;
    private Date nutzungsende;

    public Buchung() {

    }

    public int getAutowert() {
        return autowert;
    }

    public void setAutowert(int autowert) {
        this.autowert = autowert;
    }

    public int getBuchungsnummer() {
        return buchungsnummer;
    }

    public void setBuchungsnummer(int buchungsnummer) {
        this.buchungsnummer = buchungsnummer;
    }

    public Date getBuchungsdatum() {
        return buchungsdatum;
    }

    public void setBuchungsdatum(Date buchungsdatum) {
        this.buchungsdatum = buchungsdatum;
    }

    public Date getNutzungsbeginn() {
        return nutzungsbeginn;
    }

    public void setNutzungsbeginn(Date nutzungsbeginn) {
        this.nutzungsbeginn = nutzungsbeginn;
    }

    public Date getNutzungsende() {
        return nutzungsende;
    }

    public void setNutzungsende(Date nutzungsende) {
        this.nutzungsende = nutzungsende;
    }

    public Date getNuzungsende() {
        return nutzungsende;
    }

    public void setNuzungsende(Date nuzungsende) {
        this.nutzungsende = nuzungsende;
    }
}
