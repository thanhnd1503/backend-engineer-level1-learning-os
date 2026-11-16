package exercises.module0.placement;

public class Main {
    public static void main(String[] args) {
        int[] scores = { 7, 4, 9, 5, 10, 3 };

        double avg = Scores.average(scores);
        int passedCount = Scores.countPassed(scores, 5);
        String grade = Scores.grade(avg);

        System.out.println("Average score: " + avg);
        System.out.println("Number of students passed: " + passedCount);
        System.out.println("Grade: " + grade);

    }
}
