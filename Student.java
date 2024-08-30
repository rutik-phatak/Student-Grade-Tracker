package rutik;
              
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create an array to store student grades
        int[] grades = new int[numStudents];

        // Input loop to get grades from the teacher
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Calculate average, highest, and lowest scores
        double average = calculateAverage(grades);
        int highest = calculateHighestScore(grades);
        int lowest = calculateLowestScore(grades);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        scanner.close();
    }

    /**
     * Calculate the average grade of students.
     *
     * @param grades an array of student grades
     * @return the average grade
     */
    private static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    /**
     * Calculate the highest grade of students.
     *
     * @param grades an array of student grades
     * @return the highest grade
     */
    private static int calculateHighestScore(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    /**
     * Calculate the lowest grade of students.
     *
     * @param grades an array of student grades
     * @return the lowest grade
     */
    private static int calculateLowestScore(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
