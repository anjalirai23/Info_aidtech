import java.security.SecureRandom;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the desired password length: ");
        int passwordLength = scanner.nextInt();

        String password = generatePassword(passwordLength);
        System.out.println("Generated password: " + password);

        scanner.close();
    }

    public static String generatePassword(int length) {
        // Define the character set
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=<>?";

        // Combine all character sets
        String allCharacters = uppercaseLetters + lowercaseLetters + numbers + specialCharacters;

        // Create a secure random object for generating random numbers
        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();

        // Generate the password
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            char randomChar = allCharacters.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }
}
