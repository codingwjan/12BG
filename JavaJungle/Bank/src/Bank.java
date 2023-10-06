import java.util.ArrayList;

public class Bank {
    private ArrayList<Konto> konten = new ArrayList<>();
    private ArrayList<Kunde> kunden = new ArrayList<>();

    public void addKonto(Konto konto) {
        konten.add(konto);
    }

    public void addKunde(Kunde kunde) {
        kunden.add(kunde);
    }

    //add ability to search for a customer by name
    public Kunde searchKunde(String name) {
        for (Kunde kunde : kunden) {
            if (kunde.getVorname().contains(name) || kunde.getNachname().contains(name)) {
                if (kunde.getVorname().equals(name) || kunde.getNachname().equals(name)) {
                    System.out.println("Customer found:");
                    System.out.println(kunde.getVorname() + " " + kunde.getNachname());
                    return kunde;
                } else {
                    System.out.println("Multiple customers found. Here are the results:");
                    for (Kunde kunde1 : kunden) {
                        if (kunde1.getVorname().contains(name) || kunde1.getNachname().contains(name)) {
                            System.out.println(kunde1.getVorname() + " " + kunde1.getNachname());
                        }
                    }
                }
            } else {
                System.out.println("No customers found.");
            }
        }
        return null;
    }
}
