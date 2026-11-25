package equality;

import java.util.HashSet;
import java.util.Set;

// Verification for the fixed Customer class (provided by the agent).
// new String(...) simulates IDs read from a database: same content, different String objects.
public class CustomerCheck {
    public static void main(String[] args) {
        Customer c1 = new Customer(new String("C01"), "0909", "An");
        Customer c2 = new Customer(new String("C01"), "0911", "An");

        System.out.println("(A) " + c1.equals(c2));

        Set<Customer> customers = new HashSet<>();
        customers.add(c1);
        customers.add(c2);
        System.out.println("(B) " + customers.size());

        c1.setPhoneNumber("0999");
        System.out.println("(C) " + customers.contains(c1));
    }
}

// Predictions (write before running):
// (A) true
// (B) 1
// (C) true
