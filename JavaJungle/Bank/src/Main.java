public class Main {
    public static void main(String[] args) {
        System.out.println("Starting tests...");

        // Initialize Bank
        Bank myBank = new Bank();

        // Create accounts
        Konto konto1 = new Konto("DE123456789", 100.0);
        Konto konto2 = new Konto("DE987654321", 50.0);

        // Add accounts to bank
        myBank.addKonto(konto1);
        myBank.addKonto(konto2);

        // Create a customer
        Kunde kunde1 = new Kunde();
        kunde1.setKundennummer(1);
        kunde1.setVorname("KingDiva");
        kunde1.setNachname("61");

        // Add customer to bank
        myBank.addKunde(kunde1);

        // Search for a customer by name
        Kunde searchedKunde = myBank.searchKunde("KingDiva");

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

        // Test for negative amount
        boolean negativeAmount = konto1.auszahlen(5000.0);
        System.out.println("Test 6 (Negative Amount): Expected false, Got " + negativeAmount);

        System.out.println("Test completed…");
    }
}
