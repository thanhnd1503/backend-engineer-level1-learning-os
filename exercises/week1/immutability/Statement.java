package immutability;

import java.util.List;

// Part 3 (review flawed code): written by the agent with planted defects,
// like code an AI assistant might generate. Do not run it yet.
//
// Business rule: a Statement is a bank statement for one account and one month.
// Once issued, it must NEVER change: not the account number, not the transactions,
// not the closing balance. Statements are kept for audit and shared across services.
public final class Statement {
    private final String accountNumber;
    private final List<String> transactions;
    private final long closingBalance;

    public Statement(String accountNumber, List<String> transactions, long closingBalance) {
        this.accountNumber = accountNumber;
        this.transactions = List.copyOf(transactions);
        this.closingBalance = closingBalance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public long getClosingBalance() {
        return closingBalance;
    }

    // Deducts a monthly fee from the closing balance
    public Statement applyFee(long fee) {
        return new Statement(accountNumber, transactions, closingBalance - fee);
    }
}

// Review notes (write here):
// Defect 1: accountNumber is not final and can be changed after the Statement
// object is created, violating immutability.
// Example error : Statement statement = new Statement("12345", List.of(),
// 1000);
// statement.accountNumber = "67890"; // This would violate immutability
// Defect 2: transactions can be changed after the Statement
// object is created, violating immutability.
// Example error : Statement statement = new Statement("12345", new
// ArrayList<>(),
// 1000);
// List<String> transactions = statement.getTransactions();
// transactions.add("New Transaction"); // This would violate immutability
// Defect 3: closingBalance is not final and can be changed after the Statement
// object is created, violating immutability.
// Example error : Statement statement = new Statement("12345", List.of(),
// 1000);
// statement.applyFee(500); // This would violate immutability
