
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("        STUDENT GRADE CALCULATOR          ");
        System.out.println("==========================================");

        System.out.print("Enter student name: ");
        String name = sc.hasNextLine() ? sc.nextLine().trim() : "Student";
        if (name.isEmpty()) name = "Student";

        int subjects = readInt(sc, "Enter number of subjects: ", 1, 50);
        String[] subjectNames = new String[subjects];
        int[] marks = new int[subjects];

        int total = 0;
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter name of subject " + (i + 1) + ": ");
            String sub = sc.hasNextLine() ? sc.nextLine().trim() : "";
            subjectNames[i] = sub.isEmpty() ? "Subject " + (i + 1) : sub;
            marks[i] = readInt(sc, "Enter marks obtained in " + subjectNames[i] + " (0-100): ", 0, 100);
            total += marks[i];
        }

        double average = (double) total / subjects;
        String grade = getGrade(average);

        System.out.println("\n================ RESULT ==================");
        System.out.println("Student: " + name);
        System.out.println("------------------------------------------");
        System.out.printf("%-25s %10s%n", "Subject", "Marks");
        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-25s %10d%n", subjectNames[i], marks[i]);
        }
        System.out.println("------------------------------------------");
        System.out.printf("%-25s %6d / %d%n", "Total Marks", total, subjects * 100);
        System.out.printf("%-25s %9.2f%%%n", "Average Percentage", average);
        System.out.printf("%-25s %10s%n", "Grade", grade);
        System.out.println("Remark: " + getRemark(grade));
        System.out.println("==========================================");
        sc.close();
    }

    /** Grade scale based on average percentage. */
    static String getGrade(double avg) {
        if (avg >= 90) return "A+";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 50) return "D";
        if (avg >= 40) return "E";
        return "F";
    }

    static String getRemark(String grade) {
        switch (grade) {
            case "A+": return "Outstanding!";
            case "A":  return "Excellent!";
            case "B":  return "Very Good";
            case "C":  return "Good";
            case "D":  return "Satisfactory";
            case "E":  return "Pass";
            default:   return "Fail - needs improvement";
        }
    }

    /** Reads an integer within [min, max], re-prompting on invalid input. */
    private static int readInt(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextLine()) {
                System.out.println("\nNo more input. Exiting.");
                System.exit(0);
            }
            String line = sc.nextLine().trim();
            try {
                int value = Integer.parseInt(line);
                if (value >= min && value <= max) return value;
                System.out.println("Please enter a value between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }
}
