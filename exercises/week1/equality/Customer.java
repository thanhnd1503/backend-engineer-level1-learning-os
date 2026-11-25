package equality;

import java.util.Objects;

// Part 3 (review flawed code): written by the agent with planted defects,
// like code an AI assistant might generate. Do not run it yet.
//
// Business rule: two Customer objects are the same customer
// when they have the same customerId. customerId is assigned once and never changes.
// Customers are stored in HashSet<Customer> and used as HashMap keys.
public class Customer {
    private final String customerId;
    private String phoneNumber;
    private String name;

    public Customer(String customerId, String phoneNumber, String name) {
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Customer other))
            return false;
        return customerId.equals(other.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }
}
