import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        int grade = input.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("Grade: A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Grade: B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Grade: C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Grade: D");
        } else if (grade < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Grade: null");
        }
    }
}
