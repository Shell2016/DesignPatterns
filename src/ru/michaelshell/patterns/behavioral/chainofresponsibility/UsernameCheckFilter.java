package ru.michaelshell.patterns.behavioral.chainofresponsibility;

/**
 * @author Mikhail Sheludyakov
 */
public class UsernameCheckFilter extends Filter {

    private final Database database;

    public UsernameCheckFilter(Database database) {
        this.database = database;
    }

    @Override
    void doFilter(String username, String password) {
        if (!database.isValidUsername(username)) {
            throw new RuntimeException("Invalid username");
        }
        doFilterNext(username, password);
    }
}
