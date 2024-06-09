import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int result = 8;
            int number = 0;
            int guessAttempts = 0;
            while (guessAttempts < 3) {

                System.out.print("Guess number: ");
                number = Integer.valueOf(scanner.nextLine());

                if (number < result) {
                    System.out.println("Too low!");
                    
                }
                if (number > result) {
                    System.out.println("Too high!");
                }
                if (number == result) {
                    System.out.println("Correct!");
                }            
                guessAttempts++;
            }
            
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
