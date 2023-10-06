import java.util.ArrayList;

public class Telefonbuch {

    private ArrayList<User> users = new ArrayList<User>();

    // Search for an entry by first name
    public User searchUserName(String vorname) {
        for (User user : users) {
            if (user.getVorname().equals(vorname)) {
                return user;
            }
        }
        return null;
    }

    // Search for an entry by phone number
    public User searchUserNumber(int telefonnummer) {
        for (User user : users) {
            if (user.getTelefonnummer() == telefonnummer) {
                return user;
            }
        }
        return null;
    }

    // Add an entry
    public void addUser(User user) {
        users.add(user);
    }

    // Delete an entry by phone number
    public void deleteUser(int telefonnummer) {
        User userToDelete = searchUserNumber(telefonnummer);
        if (userToDelete == null) {
            System.out.println("No user found with this phone number.");
        } else {
            users.remove(userToDelete);
            System.out.println("User found and deleted.");
        }
    }
}