import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Telefonbuch telefonbuch = new Telefonbuch();

        while (true) {
            System.out.println("Choose an action (a: Add, s: Search by Name, n: Search by Number, ls: List all users, d: Delete, q: Quit): ");
            String action = scanner.nextLine();

            if ("a".equals(action)) {
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter phone number: ");
                int number = Integer.parseInt(scanner.nextLine());
                telefonbuch.addUser(new User(name, number));
                System.out.println("User added.");

            } else if ("s".equals(action)) {
                System.out.println("Enter name to search: ");
                String name = scanner.nextLine();
                User foundUser = telefonbuch.searchUserName(name);
                System.out.println(foundUser != null ? "User found with number: " + foundUser.getTelefonnummer() : "No user found.");

            } else if ("n".equals(action)) {
                System.out.println("Enter number to search: ");
                int number = Integer.parseInt(scanner.nextLine());
                User foundUser = telefonbuch.searchUserNumber(number);
                System.out.println(foundUser != null ? "User found with name: " + foundUser.getVorname() : "No user found.");

            } else if ("ls".equals(action)) {
                System.out.println("Listing all users:");
                for (User user : telefonbuch.getUsers()) {
                    System.out.println(user.getVorname() + " " + user.getTelefonnummer());
                }
            }else if ("d".equals(action)) {
                System.out.println("Enter number to delete: ");
                int number = Integer.parseInt(scanner.nextLine());
                telefonbuch.deleteUser(number);

            } else if ("q".equals(action)) {
                System.out.println("Exiting...");
                break;
            }
        }
        scanner.close();
    }
}