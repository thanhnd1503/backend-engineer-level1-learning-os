package immutability;

import java.util.ArrayList;
import java.util.List;

// Verification for the fixed Statement class (provided by the agent).
// Write predictions for (A)-(D) BEFORE running.
public class StatementCheck {
    public static void main(String[] args) {
        List<String> txs = new ArrayList<>();
        txs.add("T1");
        Statement original = new Statement("12345", txs, 1000);

        txs.add("Fake");
        System.out.println("(A) " + original.getTransactions());

        Statement withFee = original.applyFee(50);
        System.out.println("(B) " + original.getClosingBalance());
        System.out.println("(C) " + withFee.getClosingBalance());

        original.getTransactions().add("Fake2");
        System.out.println("(D) " + original.getTransactions());
    }
}

// Predictions (write before running):
// (A) T1
// (B) 1000
// (C) 950
// (D) immutability.StatementCheck.main(StatementCheck.java:21)
