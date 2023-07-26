package ru.michaelshell.patterns.behavioral.chainofresponsibility;


/**
 * @author Mikhail Sheludyakov
 */
public class AuthService {

    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("Authentication successful");
            return true;
        }
        System.out.println("Auth error!");
        return false;
    }

}
