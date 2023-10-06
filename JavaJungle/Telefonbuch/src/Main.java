// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Telefonbuch telefonbuch = new Telefonbuch();

        System.out.println("=== Start Test ===");

        // Test 1: Eintrag hinzufügen
        System.out.println("--- Test 1: Eintrag hinzufügen ---");
        telefonbuch.addUser(new User("Jan", 12345));
        System.out.println("Added: Jan | 12345");
        telefonbuch.addUser(new User("Anna", 67890));
        System.out.println("Added: Anna | 67890");
        telefonbuch.addUser(new User("Tom", 11223));
        System.out.println("Added: Tom | 11223");
        telefonbuch.addUser(new User("Jane", 44556));
        System.out.println("Added: Jane | 44556");

        // Test 2: Nach Vorname suchen
        System.out.println("--- Test 2: Suche nach Vorname ---");
        User user1 = telefonbuch.searchUserName("Jan");
        if (user1 != null) {
            System.out.println("Expected: 12345");
            System.out.println("Got: " + user1.getTelefonnummer());
        }

        // Test 3: Eintrag nach Telefonnummer suchen
        System.out.println("--- Test 3: Suche nach Telefonnummer ---");
        User user2 = telefonbuch.searchUserNumber(67890);
        if (user2 != null) {
            System.out.println("Expected: Anna");
            System.out.println("Got: " + user2.getVorname());
        }

        // Test 4: Eintrag löschen
        System.out.println("--- Test 4: Eintrag löschen ---");
        telefonbuch.deleteUser(11223);
        User user3 = telefonbuch.searchUserNumber(11223);
        System.out.println("Expected: null");
        System.out.println("Got: " + user3);

        System.out.println("=== End Test ===");
    }
}