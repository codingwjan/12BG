import java.security.SecureRandom;

public class PasswordGenerator {

    public static void main(String[] args) {
        // Beispiel: Generierung eines 12 Zeichen langen Passworts
        String password = generatePassword(12);
        System.out.println(password);
    }

    public static String generatePassword(int length) {
        String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characterSet.length());
            sb.append(characterSet.charAt(randomIndex));
        }

        return sb.toString();
    }
}
