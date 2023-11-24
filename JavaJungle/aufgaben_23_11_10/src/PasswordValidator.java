public class PasswordValidator {

    public static void main(String[] args) {
        String password = PasswordGenerator.generatePassword(20);
        // Beispiel für die Verwendung der pruefen-Methode
        boolean isValid = pruefen(password, 8, 99);
        System.out.println("Das password ist: " + password);
        System.out.println("Das Passwort ist gültig: " + isValid);
    }

    public static boolean pruefen(String password, int minLength, int maxLength) {
        if (password.length() < minLength || password.length() > maxLength) {
            return false; // Überprüfung der Länge
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }

            if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
                return true; // Alle Bedingungen erfüllt
            }
        }

        return false; // Mindestens eine Bedingung nicht erfüllt
    }
}
