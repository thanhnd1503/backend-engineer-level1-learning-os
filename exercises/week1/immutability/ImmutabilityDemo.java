package immutability;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Part 2 (read and predict): code provided by the agent.
// Write your predictions for lines (1)-(6) BEFORE running.
public class ImmutabilityDemo {

    record Money(long amount, String currency) {
        Money add(Money other) {
            return new Money(amount + other.amount, currency);
        }
    }

    // Copies the link (not protected)
    static class UnsafeOrder {
        private final List<String> items;

        UnsafeOrder(List<String> items) {
            this.items = items;
        }

        List<String> getItems() {
            return items;
        }
    }

    // Defensive copy (protected)
    static class SafeOrder {
        private final List<String> items;

        SafeOrder(List<String> items) {
            this.items = List.copyOf(items);
        }

        List<String> getItems() {
            return items;
        }
    }

    public static void main(String[] args) {
        String s = "an";
        s.concat("h");
        System.out.println("(1) " + s);

        Money balance = new Money(100, "VND");
        balance.add(new Money(50, "VND"));
        System.out.println("(2) " + balance.amount());

        Set<Money> seen = new HashSet<>();
        seen.add(new Money(100, "VND"));
        System.out.println("(3) " + seen.contains(new Money(100, "VND")));

        List<String> list = new ArrayList<>();
        list.add("A1");
        UnsafeOrder unsafe = new UnsafeOrder(list);
        SafeOrder safe = new SafeOrder(list);
        list.add("B2");
        System.out.println("(4) " + unsafe.getItems());
        System.out.println("(5) " + safe.getItems());

        safe.getItems().add("C3");
        System.out.println("(6) " + safe.getItems());
    }
}

// Predictions (write before running):
// (1) anh
// (2) 150
// (3) true
// (4) [A1, B2]
// (5) [A1]
// (6) UnsupportedOperationException
