package ru.michaelshell.patterns.behavioral.chainofresponsibility;

/**
 * @author Mikhail Sheludyakov
 */
public class PasswordCheckFilter extends Filter {

    private final Database database;

    public PasswordCheckFilter(Database database) {
        this.database = database;
    }

    @Override
    void doFilter(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            throw new RuntimeException("Invalid password");
        }
       doFilterNext(username, password);
    }
}
