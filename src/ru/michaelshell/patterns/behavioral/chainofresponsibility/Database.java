package ru.michaelshell.patterns.behavioral.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mikhail Sheludyakov
 */
public class Database {

    Map<String, String> map = new HashMap<>();

    public Database() {
        map.put("user", "pass");
        map.put("admin", "adminpass");
    }

    public boolean isValidUsername(String username) {
        return map.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return password.equals(map.get(username));
    }
}
