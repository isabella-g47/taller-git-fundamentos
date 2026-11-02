package co.edu.uniremington.gitworkshop;
import java.util.Scanner;
public class GradeCalculator {
    static final double WEIGHT = 0.25;
    static final double PASSING_GRADE = 3.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double g1 = scanner.nextDouble();
        double g2 = scanner.nextDouble();
        double g3 = scanner.nextDouble();
        double g4 = scanner.nextDouble();
        double finalGrade = (g1 + g2 + g3 + g4) * WEIGHT;
        System.out.println("Nota definitiva: " + finalGrade);
        if (passed(finalGrade)) {
            System.out.println("Aprobó el curso.");
        } else {
            System.out.println("No aprobó el curso.");
        }
    }
    static boolean passed(double finalGrade) {
        return finalGrade >= PASSING_GRADE;
    }
}