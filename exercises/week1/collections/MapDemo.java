package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        String[] logins = { "a@x.com", "b@x.com", "a@x.com", "c@x.com", "a@x.com" };
        Map<String, Integer> loginCounts = new HashMap<>();

        for (String login : logins) {
            if (loginCounts.containsKey(login)) {
                loginCounts.put(login, loginCounts.get(login) + 1);
            } else {
                loginCounts.put(login, 1);
            }
        }
        System.out.println("Login counts: " + loginCounts);
        System.out.println(loginCounts.get("a@x.com"));

        int nA = loginCounts.getOrDefault("a@x.com", 0);
        int nZ = loginCounts.getOrDefault("z@x.com", 0);

        System.out.println("nA = " + nA);
        System.out.println("nZ = " + nZ);
    }
}
