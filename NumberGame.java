import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random guesedNumber = new Random();

            int result = guesedNumber.nextInt(100) + 1; //generates random number btn 1 = 100
            System.out.println(result);
            int number = 0;
            int guessAttempts = 0;
            boolean playAgain = false;
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
                    break;
                }            
                guessAttempts++;
            }
            
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
