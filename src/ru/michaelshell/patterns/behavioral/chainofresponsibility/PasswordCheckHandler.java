package ru.michaelshell.patterns.behavioral.chainofresponsibility;

/**
 * @author Mikhail Sheludyakov
 */
public class PasswordCheckHandler extends Handler{

    private final Database database;

    public PasswordCheckHandler(Database database) {
        this.database = database;
    }

    @Override
    boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Invalid password");
            return false;
        }
        return handleNext(username, password);
    }
}
