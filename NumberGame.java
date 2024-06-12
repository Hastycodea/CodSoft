import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        boolean playAgain = true;
        int roundsWon = 0;

        // to be worked on
        int numberOfRounds = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have ONLY 8 guesses");

        while (playAgain) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(100) + 1;
            System.out.println("");
            int numberOfAttempts = 0;

            while (numberOfAttempts < 8) {
                int remaining = 7 - numberOfAttempts;

                System.out.print("Guess number between 1-100: ");
                int input = Integer.valueOf(scanner.nextLine());
                numberOfAttempts++;

                if (input == randomNumber) {
                    System.out.println("Correct!");
                    roundsWon++;
                    break;
                } else if (input < randomNumber) {
                    System.out.println("Too low!");
                    System.out.println("Remaining Attempts: " + remaining);
                    continue;
                } else {
                    System.out.println("Too high");
                    System.out.println("Remaining Attempts: " + remaining);

                }

            }
            numberOfRounds++;

            if (numberOfAttempts == 8) {
                System.out.println("You've used all the attempts, the correct number was " + randomNumber);                
            }

            System.out.println("Do you want to play again? (yes/no)");
            String confirm = scanner.nextLine();

            if (confirm.equalsIgnoreCase("yes")) {
                playAgain = true;
                continue;
            } else {
                playAgain = false;
            }

        }

        // to worked on
        System.out.println("Number of Rounds: " + numberOfRounds);
        System.out.println("Rounds Won: " + roundsWon);
        System.out.println("Thanks for PLAYING!!");

    }
}
