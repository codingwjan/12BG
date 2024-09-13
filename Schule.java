import java.util.ArrayList;

public class Schule {
    private ArrayList<Schueler> schueler;
    private String name;

    public Schule(String name) {
        this.schueler = new ArrayList<>(); // Initialize the list here
        this.name = name;
    }

    public void addSchueler(Schueler s) {
        schueler.add(s);
    }

    public Schueler findeSchueler(Schueler s) {
        for (Schueler sch : schueler) {
            if (sch.equals(s)) {
                return sch;
            }
        }
        System.out.print("Schueler nicht gefunden");
        return null;
    }

    public void entferneSchueler(Schueler s) {
        if (!schueler.remove(s)) {
            System.out.print("Schueler konnte nicht entfernt werden");
        }
    }

    public void fuegeSchuelerKontaktaddresseHinzu(Schueler s, String hinzuFuegenTyp, String hinzuFuegenWert) {
        if (schueler.contains(s)) {
            s.fuegeKontaktadresseHinzu(hinzuFuegenTyp, hinzuFuegenWert);
        } else {
            System.out.print("Schueler nicht gefunden");
        }
    }

    public void aenderSchuelerKontaktaddresse(Schueler s, String zuLoeschenWert, String hinzuFuegenTyp, String hinzuFuegenWert) {
        if (schueler.contains(s)) {
            s.loescheKontakadresse(zuLoeschenWert);
            s.fuegeKontaktadresseHinzu(hinzuFuegenTyp, hinzuFuegenWert);
        } else {
            System.out.print("Schueler nicht gefunden");
        }
    }

    public void entferneSchuelerKontaktaddresse(Schueler s, String zuLoeschenWert) {
        if (schueler.contains(s)) {
            s.loescheKontakadresse(zuLoeschenWert);
        } else {
            System.out.print("Schueler nicht gefunden");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}