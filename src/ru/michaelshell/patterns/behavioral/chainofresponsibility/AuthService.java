package ru.michaelshell.patterns.behavioral.chainofresponsibility;


/**
 * @author Mikhail Sheludyakov
 */
public class AuthService {

    private Filter filter;

    public AuthService(Filter filter) {
        this.filter = filter;
    }

    public void logIn(String username, String password) {
        filter.doFilter(username, password);
        System.out.println("Successful authentication!");
    }

}
