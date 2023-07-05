import java.util.Scanner;

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class AuthenticationExample {
    public static void main(String[] args) {
        try {
            authenticateUser();
            System.out.println("Authentication successful!");
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }

    public static void authenticateUser() throws AuthenticationException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (!username.equals("admin") || !password.equals("password123")) {
            throw new AuthenticationException("Invalid username or password");
        }
    }
}
