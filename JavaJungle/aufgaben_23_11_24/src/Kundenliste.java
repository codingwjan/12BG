public class Kundenliste
{
    Kunde erster = null; //Referenz (Verweis) auf den ersten Kunden in der Liste
    private int anzahl = 0;

    //diese Methode existiert nur fuer Testzwecke und kann spaeter entfernt werden
    public void erzeugenTestliste()
    {
        Kunde kunde1 = new Kunde(4711, "Meier");
        Kunde kunde2 = new Kunde(4766, "Lehmann");
        Kunde kunde3 = new Kunde(4722, "Schulze");
        erster = kunde1;
        kunde1.setNachfolger(kunde2);
        kunde2.setNachfolger(kunde3);

    }

    //diese Methode existiert nur fuer Testzwecke und kann spaeter entfernt werden
    public void ausgebenTestliste()
    {
        if(erster == null)
        {
            return;
        }

        Kunde kunde = erster;

        do
        {
            System.out.println(kunde.getNummer() + " " + kunde.getNachname());
            kunde = kunde.getNachfolger();
        }
        while(kunde != null);
    }

    public int getAnzahl()
    {
        return anzahl;
    }

    public void einfuegenAnfang(Kunde kunde)
    {
        if (erster == null)
        {
            erster = kunde;
        }
        else
        {
            kunde.setNachfolger(erster);
            erster = kunde;
        }
        anzahl++;
    }

    public void einfuegenEnde(Kunde kunde)
    {
        if (erster == null)
        {
            erster = kunde;
        }
        else
        {
            Kunde aktueller = erster;
            while (aktueller.getNachfolger() != null)
            {
                aktueller = aktueller.getNachfolger();
            }
            aktueller.setNachfolger(kunde);
        }
        anzahl++;
    }

    public Kunde suchen(int kundennummer)
    {
        Kunde aktueller = erster;
        while (aktueller != null && aktueller.getNummer() != kundennummer)
        {
            aktueller = aktueller.getNachfolger();
        }
        return aktueller;
    }

    public boolean loeschen(int kundennummer) {
        if (erster == null) {
            return false;
        } else if (erster.getNummer() == kundennummer) {
            erster = erster.getNachfolger();
            anzahl--;
            return true;
        } else {
            Kunde aktueller = erster;
            while (aktueller.getNachfolger() != null && aktueller.getNachfolger().getNummer() != kundennummer) {
                aktueller = aktueller.getNachfolger();
            }
            if (aktueller.getNachfolger() == null) {
                return false;
            } else {
                aktueller.setNachfolger(aktueller.getNachfolger().getNachfolger());
                anzahl--;
                return true;
            }
        }
    }
}
