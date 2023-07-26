package ru.michaelshell.patterns.behavioral.chainofresponsibility;

/**
 * @author Mikhail Sheludyakov
 */
public class UsernameCheckHandler extends Handler {

    private final Database database;

    public UsernameCheckHandler(Database database) {
        this.database = database;
    }

    @Override
    boolean handle(String username, String password) {
        if (!database.isValidUsername(username)) {
            System.out.println("Invalid username");
            return false;
        }
        return handleNext(username, password);
    }
}
