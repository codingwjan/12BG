import java.util.ArrayList;
import java.util.Date;

public class Schueler {
    private String vorname;
    private String name;
    private Date geburtsdatum;
    private ArrayList<KontaktAdresse> kontaktAdresse;

    public Schueler() {
        vorname = "";
        name = "";
        kontaktAdresse = new ArrayList<>();
    }

    public Schueler(String vorname, String name, Date geburtsdatum) {
        this.vorname = vorname;
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        this.kontaktAdresse = new ArrayList<>();
    }

    public String getVorname() {
        return this.vorname;
    }

    public String getName() {
        return this.name;
    }

    public void fuegeKontaktadresseHinzu(String typ, String wert) {
        KontaktAdresse kontaktAdresse = new KontaktAdresse(typ, wert);
        this.kontaktAdresse.add(kontaktAdresse);
    }

    public void loescheKontakadresse(String wert) {
        boolean found = false;
        for (int i = 0; i < kontaktAdresse.size(); i++) {
            if (kontaktAdresse.get(i).getWert().equals(wert)) {
                kontaktAdresse.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.print("Keine Kontaktadresse mit dem Wert " + wert + " gefunden");
        }
    }

    public ArrayList<KontaktAdresse> holeAlleKontaktadressenEinesTyps(String typ) {
        ArrayList<KontaktAdresse> kontaktadressenEinesTyps = new ArrayList<>();
        for (KontaktAdresse adresse : kontaktAdresse) {
            if (adresse.getTyp().equals(typ)) {
                kontaktadressenEinesTyps.add(adresse);
            }
        }
        if (!kontaktadressenEinesTyps.isEmpty()) {
            return kontaktadressenEinesTyps;
        } else {
            System.out.print("Keine Kontaktadresse vom Typ " + typ + " gefunden");
            return null;
        }
    }

    public ArrayList<KontaktAdresse> getKontaktadressen() {
        return this.kontaktAdresse;
    }
}