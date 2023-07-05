public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class AuthenticationExample {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password123";

        try {
            authenticate(username, password);
            System.out.println("Authentication successful!");
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }

    public static void authenticate(String username, String password) throws AuthenticationException {
        
        if (!username.equals("admin") || !password.equals("password123")) {
            throw new AuthenticationException("Invalid username or password");
        }
    }
}
