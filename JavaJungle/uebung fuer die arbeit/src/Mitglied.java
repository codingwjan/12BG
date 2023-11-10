public class Mitglied {
    private int autowert;
    private int mitgliedsnummer;
    private String name;
    private String vorname;
    private int pin;

    public Mitglied() {

    }

    public int getAutowert() {
        return autowert;
    }

    public void setAutowert(int autowert) {
        this.autowert = autowert;
    }

    public int getMitgliedsnummer() {
        return mitgliedsnummer;
    }

    public void setMitgliedsnummer(int mitgliedsnummer) {
        this.mitgliedsnummer = mitgliedsnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
