import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> subjects = new ArrayList<String>();

        int i = 1;
        int total = 0;
        while (true) {
            System.out.print("Subject " + i + " marks (quit to exit): ");
            String marks = scanner.nextLine();
            total++;

            if (marks.equals("quit")) {
                break;                
            }

            int results = Integer.valueOf(marks);
            if (results > 100 || results < 0) {
                System.out.println("Invalid marks!");
            } else {
                subjects.add(marks);
            }

            i++;
        }

        int sum = 0;
        for (String subject : subjects) {
            int values = Integer.valueOf(subject);
            sum += values;
        }
        double percentage = sum / total;
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Percentage: " + percentage + " %");

        if (percentage >= 70) {
            System.out.println("Grade: A");            
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

    }
}
