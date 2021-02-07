import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Guessing Game");
        System.out.println("Guess a number between 1 and 10:");

        Scanner keyboard = new Scanner(System.in);
        int guess = keyboard.nextInt();
        int secretNumber = (int)( 10 * Math.random()) +1;
        int numExit = -1;

        // TRY COUNT METHOD? LOOP?
        // int tryCount;
        //tryCount = 0;

        if (guess == 7)
        { System.out.println("Lucky number 7! You won"); }

        else if (guess == numExit)
        { System.exit(0); }

        else if (guess == secretNumber)
        { System.out.println("Congratulations! You guessed the secret number"); }

        else if (guess == 0)
        { System.out.println("Oops. You must enter a number between 1 and 10:"); }

        else if (guess > secretNumber)
        { System.out.println("Your guess is larger than the secret number"); }

        else if (guess < secretNumber)
        { System.out.println("Your guess is smaller than the secret number"); }

        { System.out.println("The secret number is " + secretNumber); }
    }

}
