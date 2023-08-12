package JavaProgram.Projects;

/* 
 * About:-
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class IMPROVED_CGPA_Calculator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mapping of grades to grade points
        Map<String, Integer> gradePoints = new HashMap<>();
        gradePoints.put("S", 10);
        gradePoints.put("A", 9);
        gradePoints.put("B", 8);
        gradePoints.put("C", 7);
        gradePoints.put("D", 6);
        gradePoints.put("E", 5);

        System.out.print("Enter your current CGPA: ");
        float currentCGPA = scanner.nextFloat();

        System.out.print("Enter your total credits: ");
        int totalCredits = scanner.nextInt();

        System.out.print("Enter the grade you want to replace (S, A, B, C, D, E): ");
        String originalGrade = scanner.next();

        System.out.print("Enter the improved grade (S, A, B, C, D, E): ");
        String improvedGrade = scanner.next();

        System.out.print("Enter the credits of the course: ");
        int courseCredits = scanner.nextInt();

        // Calculate total credit points before improvement
        float totalCreditPointsBefore = currentCGPA * totalCredits;

        // Calculate total credit points after improvement
        float totalCreditPointsAfter = totalCreditPointsBefore
                - (gradePoints.get(originalGrade) * courseCredits)
                + (gradePoints.get(improvedGrade) * courseCredits);

        // Calculate new CGPA
        float newCGPA = totalCreditPointsAfter / totalCredits;

        System.out.printf("Your new CGPA after improving the grade from %s to %s will be approximately: %.2f%n",
                          originalGrade, improvedGrade, newCGPA);
    }
}

