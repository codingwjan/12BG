public class User {
    private String vorname;
    private int telefonnummer;

    public User(String vorname, int telefonnummer) {
        this.vorname = vorname;
        this.telefonnummer = telefonnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }
}
