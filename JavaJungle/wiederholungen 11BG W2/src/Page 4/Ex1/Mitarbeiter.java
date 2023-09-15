package org.prin.page4.ex1;

public class Mitarbeiter {
    private int id;
    private String vorname;
    private String nachname;
    private String geburtsdatum;

    public Mitarbeiter(int id, String vorname, String nachname, String geburtsdatum) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    public int getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String s) {
        this.geburtsdatum = geburtsdatum;
    }
}
