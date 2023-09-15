package org.prin.page4.ex1;
public class Main {
    public static void main(String[] args) {
        // Mitarbeiter erstellen
        Mitarbeiter frauJacobsDallmayr = new Mitarbeiter(4711, "Melitta", "Jacobs-Dallmayr", "");

        // Arbeitsvertrag erstellen
        Arbeitsvertrag arbeitsvertrag = new Arbeitsvertrag(frauJacobsDallmayr.getId(), "Kaffee-Koch", 4000.0);

        // Geburtsdatum von Frau Jacobs-Dallmayr setzen
        frauJacobsDallmayr.setGeburtsdatum("01.01.1980");

        // Attribute ausgeben
        System.out.println("Mitarbeiter ID: " + frauJacobsDallmayr.getId());
        System.out.println("Vorname: " + frauJacobsDallmayr.getVorname());
        System.out.println("Nachname: " + frauJacobsDallmayr.getNachname());
        System.out.println("Geburtsdatum: " + frauJacobsDallmayr.getGeburtsdatum());
        System.out.println("Tätigkeitsbeschreibung: " + arbeitsvertrag.getTaetigkeitsbeschreibung());
        System.out.println("Gehalt: " + arbeitsvertrag.getGehalt() + " Euro");
    }
}
