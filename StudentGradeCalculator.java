import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> subjects = new ArrayList<String>();

        int i = 0;

        while (i < 5) {
            System.out.print("Enter marks : ");
            String marks = scanner.nextLine(); 
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
        double percentage = sum / 5;
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
