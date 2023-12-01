public class Main
{
    public static void main(String[] args)
    {
        Shop shop = new Shop();
        shop.erzeugenTestliste();
        shop.ausgebenTestliste();

        shop.bestellen(4711, 100);
        shop.bestellen(4766, 200);

        // Implement getErsterKunde() and getLetzterKunde()
        Kunde ersterKunde = shop.getErsterKunde();
        Kunde letzterKunde = shop.getLetzterKunde();

        System.out.println("Erster Kunde: " + ersterKunde.getNummer() + " " + ersterKunde.getNachname());
        System.out.println("Letzter Kunde: " + letzterKunde.getNummer() + " " + letzterKunde.getNachname());

        System.out.println("Umsatz: " + shop.getUmsatz() + "€"); // Gibt 300 zurück
    }
}
