package ru.michaelshell.patterns.behavioral.chainofresponsibility;

/**
 * @author Mikhail Sheludyakov
 */
public class ChainRunner {
    public static void main(String[] args) {
        var database = new Database();
        Handler handler = new UsernameCheckHandler(database);
        handler.setNextHandler(new PasswordCheckHandler(database));
        final var authService = new AuthService(handler);

        authService.logIn("user", "pass");
        System.out.println("----------------------");
        authService.logIn("admin", "pass");
        System.out.println("----------------------");
        authService.logIn("admins", "pass");

    }
}
