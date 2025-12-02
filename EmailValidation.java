import java.util.Scanner;

// Custom Exception (inside same file)
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
            System.out.println("Valid email!");
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    // Method to validate email
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain '@' symbol!");
        }
    }
}
