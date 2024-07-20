import java.util.Scanner;

public class Guess_Number {

    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int K = 8;
        int i, guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");
        System.out.println("You have 8 chances to guess it correctly!");
        System.out.println("Go ahead and take your first guess!");

        for (i = 0; i < K; i++) {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("WOOHOO! You guessed it correctly!");
                System.out.println("You won in " + (i+1) + " tries!");
                break;
            } else if (number > guess && i != K - 1) {
                System.out.println("Oops, your guess is too low!");
                System.out.println("Try again, you have " + (K-i-1) + " chances left!");
            } else if (number < guess && i != K - 1) {
                System.out.println("Oops, your guess is too high!");
                System.out.println("Try again, you have " + (K-i-1) + " chances left!");
            }
        }

        if (i == K) {
            System.out.println("Aww, you ran out of tries :(");
            System.out.println("The number was " + number);
            System.out.println("Better luck next time :)");
        }

        sc.close();
    }

    public static void main(String arg[]) {
        guessingNumberGame();
    }
}