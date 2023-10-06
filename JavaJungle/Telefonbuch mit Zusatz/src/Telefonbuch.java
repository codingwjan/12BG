import java.util.ArrayList;

public class Telefonbuch {
    private ArrayList<User> users = new ArrayList<>();

    public User searchUserName(String vorname) {
        for (User user : users) {
            if (user.getVorname().equals(vorname)) {
                return user;
            }
        }
        return null;
    }

    public User searchUserNumber(int telefonnummer) {
        for (User user : users) {
            if (user.getTelefonnummer() == telefonnummer) {
                return user;
            }
        }
        return null;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(int telefonnummer) {
        User userToDelete = searchUserNumber(telefonnummer);
        if (userToDelete == null) {
            System.out.println("No user found with this phone number.");
        } else {
            users.remove(userToDelete);
            System.out.println("User found and deleted.");
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
