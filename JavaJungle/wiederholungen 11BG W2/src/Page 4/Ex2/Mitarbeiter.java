package org.prin.page4.ex2;

public class Mitarbeiter {
    private int id;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private Arbeitsvertrag arbeitsvertrag; // Referenz auf den Arbeitsvertrag

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

    public Arbeitsvertrag getArbeitsvertrag() {
        return arbeitsvertrag;
    }

    public void setArbeitsvertrag(Arbeitsvertrag arbeitsvertrag) {
        this.arbeitsvertrag = arbeitsvertrag;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
}
