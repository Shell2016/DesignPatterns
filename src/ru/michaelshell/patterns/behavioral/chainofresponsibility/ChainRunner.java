package ru.michaelshell.patterns.behavioral.chainofresponsibility;

/**
 * @author Mikhail Sheludyakov
 */
public class ChainRunner {
    public static void main(String[] args) {
        var database = new Database();
        Filter filter = new UsernameCheckFilter(database);
        filter.setNextFilter(new PasswordCheckFilter(database));
        final var authService = new AuthService(filter);

        try {
            authService.logIn("user", "pass");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            authService.logIn("admin", "pass");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            authService.logIn("admins", "pass");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
