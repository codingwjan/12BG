// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Kunde k1 = new Kunde(244, "Marving");
        Kunde k2 = new Kunde(599, "Philipp");
        Kunde k3 = new Kunde(732, "Gebauer");
        Kunde k4 = new Kunde(123, "Klaus");

        Kunde[] kunden = {k1, k2, k3, k4};

        int gesucht = 599;

        SearchArray searchArray = new SearchArray();
        System.out.println(searchArray.search(kunden, gesucht));
    }
}