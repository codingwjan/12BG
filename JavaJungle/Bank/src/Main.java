public class Main {
    public static void main(String[] args) {
        System.out.println("Starting tests...");

        // Create accounts
        Konto konto1 = new Konto("DE123456789", 100.0);
        Konto konto2 = new Konto("DE987654321", 50.0);

        // Create a customer
        Kunde kunde1 = new Kunde();
        kunde1.setKundennummer(1);
        kunde1.setVorname("John");
        kunde1.setNachname("Doe");

        // Test deposit
        konto1.einzahlen(50.0);
        System.out.println("Test 1 (Deposit): Expected 150.0, Got " + konto1.kontostandAbfragen());

        // Test withdrawal
        boolean withdrawStatus = konto1.auszahlen(50.0);
        System.out.println("Test 2 (Withdraw): Expected true, Got " + withdrawStatus);

        // Test insufficient funds
        withdrawStatus = konto1.auszahlen(200.0);
        System.out.println("Test 3 (Insufficient Funds): Expected false, Got " + withdrawStatus);

        // Test transfer
        boolean transferStatus = konto1.ueberweisen(konto2, 50.0);
        System.out.println("Test 4 (Transfer): Expected true, Got " + transferStatus);

        // Test account balance after transfer
        System.out.println("Test 5 (Balance After Transfer): Expected 50.0, Got " + konto1.kontostandAbfragen());

        System.out.println("Tests completed.");
    }
}