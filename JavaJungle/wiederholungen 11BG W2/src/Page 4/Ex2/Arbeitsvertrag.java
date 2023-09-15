package org.prin.page4.ex2;

public class Arbeitsvertrag {
    private int mitarbeiterId;
    private String taetigkeitsbeschreibung;
    private double gehalt;

    public Arbeitsvertrag(int mitarbeiterId, String taetigkeitsbeschreibung, double gehalt) {
        this.mitarbeiterId = mitarbeiterId;
        this.taetigkeitsbeschreibung = taetigkeitsbeschreibung;
        this.gehalt = gehalt;
    }

    public int getMitarbeiterId() {
        return mitarbeiterId;
    }

    public String getTaetigkeitsbeschreibung() {
        return taetigkeitsbeschreibung;
    }

    public double getGehalt() {
        return gehalt;
    }
}
