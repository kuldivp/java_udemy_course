import java.util.Random;
import java.util.Scanner;

class Game {
    int numberToGuess;
    int score;

    Game() {
        Random rand = new Random();
        numberToGuess = rand.nextInt(100) + 1;
        score = 0;
    }

    // Method that takes user input as argument
    boolean checkGuess(int userInput) {
        score++;
        if (userInput < numberToGuess) {
            System.out.println("Too low. Try again.");
            return false;
        } else if (userInput > numberToGuess) {
            System.out.println("Too high. Try again.");
            return false;
        } else {
            System.out.println("🎉 Correct! You guessed it in " + score + " tries.");
            return true;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g = new Game();

        boolean isCorrect = false;

        System.out.println("Guess the number between 1 to 100:");

        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            int input = sc.nextInt();
            isCorrect = g.checkGuess(input); // Passing input to Game class method
        }

        sc.close();
    }
}
