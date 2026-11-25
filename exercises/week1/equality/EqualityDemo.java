package equality;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

// Part 2 (read and predict): code provided by the agent.
// Write your predictions for lines (1)-(10) BEFORE running.
public class EqualityDemo {

    // Does NOT override equals/hashCode
    static class PlainAccount {
        private final String accountNumber;

        PlainAccount(String accountNumber) {
            this.accountNumber = accountNumber;
        }
    }

    // Overrides both, based on accountNumber
    static class Account {
        private final String accountNumber;

        Account(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Account other))
                return false;
            return accountNumber.equals(other.accountNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(accountNumber);
        }
    }

    public static void main(String[] args) {
        PlainAccount p1 = new PlainAccount("001");
        PlainAccount p2 = new PlainAccount("001");

        System.out.println("(1) " + (p1 == p2));
        System.out.println("(2) " + p1.equals(p2));

        Set<PlainAccount> plainSet = new HashSet<>();
        plainSet.add(p1);
        plainSet.add(p2);
        System.out.println("(3) " + plainSet.size());

        Account a1 = new Account("001");
        Account a2 = new Account("001");

        System.out.println("(4) " + (a1 == a2));
        System.out.println("(5) " + a1.equals(a2));
        System.out.println("(6) " + (a1.hashCode() == a2.hashCode()));

        Set<Account> accountSet = new HashSet<>();
        accountSet.add(a1);
        accountSet.add(a2);
        System.out.println("(7) " + accountSet.size());
        System.out.println("(8) " + accountSet.contains(new Account("001")));

        Map<Account, String> owners = new HashMap<>();
        owners.put(a1, "An");
        System.out.println("(9) " + owners.get(a2));
        System.out.println("(10) " + owners.get(new Account("002")));
    }
}

// Predictions (write before running):
// (1) false
// (2) false
// (3) 2
// (4) false
// (5) true
// (6) true
// (7) 2
// (8) true
// (9) An
// (10) null
