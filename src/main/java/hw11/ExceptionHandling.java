package hw11;

public class ExceptionHandling {
    public static void main(String[] args) {
        String login = "mylogin";
        String password = "mypassword";
        String confirmPassword = "mypassword";
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            System.out.println("Values are valid");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Invalid login");
        }
    }
    public static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password");
        }
    }
}
class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}
