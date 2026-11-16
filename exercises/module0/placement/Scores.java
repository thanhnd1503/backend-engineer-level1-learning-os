package exercises.module0.placement;

public class Scores {
    public static double average(int[] scores) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Scores array cannot be null or empty");
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static int countPassed(int[] scores, int threshold) {
        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Scores array cannot be null or empty");
        }
        if (threshold < 0 || threshold > 10) {
            throw new IllegalArgumentException("Threshold must be between 0 and 10");
        }
        int count = 0;
        for (int score : scores) {
            if (score >= threshold) {
                count++;
            }
        }
        return count;
    }

    public static String grade(double avg) {
        if (avg < 0 || avg > 10) {
            throw new IllegalArgumentException("Average score must be between 0 and 10");
        }
        if (avg >= 8) {
            return "Gioi";
        } else if (avg >= 6.5) {
            return "Kha";
        } else if (avg >= 5) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }
}
