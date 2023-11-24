public class JahresStatistik {

    public static void main(String[] args) {

        // Test 1
        boolean ergebnis1 = pruefeID("6258431979");
        System.out.println("Ergebnis 1: " + ergebnis1); // true

        // Test 2
        boolean ergebnis2 = pruefeID("1234567890");
        System.out.println("Ergebnis 2: " + ergebnis2); // false

    }


    public static boolean pruefeID(String idNummer) {

        // Initialisieren der Variablen
        int[] ziffern = new int[idNummer.length()];
        int quersumme1 = 0;
        int quersumme2 = 0;
        int ergebnis = 0;
        int prufziffer = 0;

        // Einlesen der Ziffern der ID-Card-Nummer
        for (int i = 0; i < idNummer.length(); i++) {
            ziffern[i] = idNummer.charAt(i) - '0';
        }

        // Berechnung der Quersummen
        for (int i = 0; i < idNummer.length(); i++) {
            if (i % 2 == 0) {
                quersumme1 += ziffern[i];
            } else {
                quersumme2 += ziffern[i];
            }
        }

        // Berechnung des Ergebnisses
        ergebnis = quersumme1 + quersumme2;

        // Rundung des Ergebnisses auf die nächstgrößere durch 10 teilbare Zahl
        if (ergebnis % 10 != 0) {
            ergebnis += 10;
        }

        // Berechnung der Prüfziffer
        prufziffer = ergebnis % 10;

        // Vergleich der Prüfziffer mit der letzten Ziffer der ID-Card-Nummer
        return ziffern[idNummer.length() - 1] == prufziffer;
    }
}
