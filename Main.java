import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Schule schule = new Schule("PPC");
        Klasse klasse = new Klasse("12BGI");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date geburtsdatum = null;
        try {
            geburtsdatum = dateFormat.parse("03.07.2006");
        } catch (ParseException e) {
            System.out.print("Fehler beim Parsen des Datums");
            e.printStackTrace();
        }

        Schueler schueler1 = new Schueler("big", "petergriffin", geburtsdatum);
        schueler1.fuegeKontaktadresseHinzu("mail", "quicky69420@gmail.com");
        schueler1.fuegeKontaktadresseHinzu("phone", "123456789");

        Schueler schueler2 = new Schueler("small", "petergriffin", geburtsdatum);
        schueler2.fuegeKontaktadresseHinzu("mail", "smallpeter@gmail.com");

        Schueler schueler3 = new Schueler("medium", "petergriffin", geburtsdatum);

        schule.addSchueler(schueler1);
        schule.addSchueler(schueler2);
        schule.addSchueler(schueler3);

        System.out.println("Before deletion:");
        printSchuelerDetails(schueler1);
        printSchuelerDetails(schueler2);
        printSchuelerDetails(schueler3);

        delay();

        schueler1.loescheKontakadresse("123456789");
        schueler2.loescheKontakadresse("smallpeter@gmail.com");

        System.out.println("\nAfter deletion:");
        printSchuelerDetails(schueler1);
        printSchuelerDetails(schueler2);
        printSchuelerDetails(schueler3);

        delay();

        System.out.println("\nKontaktadressen vom Typ 'mail' für schueler1:");
        ArrayList<KontaktAdresse> mailAdressen = schueler1.holeAlleKontaktadressenEinesTyps("mail");
        if (mailAdressen != null) {
            for (KontaktAdresse adresse : mailAdressen) {
                System.out.println("  Typ: " + adresse.getTyp() + ", Wert: " + adresse.getWert());
            }
        }

        delay();

        // Additional tests
        System.out.println("\nTesting findeSchueler method:");
        Schueler foundSchueler = schule.findeSchueler(schueler1);
        if (foundSchueler != null) {
            System.out.println("Schueler found: " + foundSchueler.getVorname() + " " + foundSchueler.getName());
        } else {
            System.out.println("Schueler not found.");
        }

        delay();

        System.out.println("\nTesting entferneSchueler method:");
        schule.entferneSchueler(schueler3);
        printSchuelerDetails(schueler3);

        delay();

        System.out.println("\nTesting fuegeSchuelerKontaktaddresseHinzu method:");
        schule.fuegeSchuelerKontaktaddresseHinzu(schueler1, "fax", "987654321");
        printSchuelerDetails(schueler1);

        delay();

        System.out.println("\nTesting aenderSchuelerKontaktaddresse method:");
        schule.aenderSchuelerKontaktaddresse(schueler1, "987654321", "fax", "111222333");
        printSchuelerDetails(schueler1);

        delay();

        System.out.println("\nTesting entferneSchuelerKontaktaddresse method:");
        schule.entferneSchuelerKontaktaddresse(schueler1, "111222333");
        printSchuelerDetails(schueler1);

        delay();

        // Error message tests
        System.out.println("\nTesting error messages:");
        schueler1.loescheKontakadresse("nonexistent");
        schueler2.holeAlleKontaktadressenEinesTyps("nonexistent");
        schule.entferneSchueler(new Schueler("nonexistent", "student", geburtsdatum));
        schule.fuegeSchuelerKontaktaddresseHinzu(new Schueler("nonexistent", "student", geburtsdatum), "mail", "test@mail.com");
        schule.aenderSchuelerKontaktaddresse(new Schueler("nonexistent", "student", geburtsdatum), "oldValue", "newType", "newValue");
        schule.entferneSchuelerKontaktaddresse(new Schueler("nonexistent", "student", geburtsdatum), "value");
    }

    private static void printSchuelerDetails(Schueler schueler) {
        System.out.println("Vorname: " + schueler.getVorname());
        System.out.println("Name: " + schueler.getName());
        System.out.println("Kontaktadressen:");
        for (KontaktAdresse adresse : schueler.getKontaktadressen()) {
            System.out.println("  Typ: " + adresse.getTyp() + ", Wert: " + adresse.getWert());
        }
    }

    private static void delay() {
        try {
            Thread.sleep(2000); // 2-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}