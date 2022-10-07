import java.util.Random;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        // User section area
        System.out.println("----------------------------------");
        System.out.println(" hii this is a number guessing program so Pick/chooes a number between 1 to 100 ");
        System.out.println("----------------------------------");
        System.out.println();

        Random rand = new Random();
        int random_number = rand.nextInt(99) + 1;

        Scanner myKeyboard = new Scanner(System.in);
        System.out.println("Pick a number between 0 to 100 (you have 5 guesses): ");
        int guess;
        int numberOfTries = 1;
        boolean win = false;
        while (win == false) {
            guess = myKeyboard.nextInt();

            if (numberOfTries < 5) {
                if (guess == random_number) {
                    System.out.println();
                    System.out.println("You guessed it correct ! The Number is : " + random_number);
                    System.out.println("It only took you ,you have  " + numberOfTries + "guesses to get it right!");
                    myKeyboard.close();
                    win = true;
                } else if (guess < random_number) {
                    System.out.println("You are too low! 👀Pick another number");
                    System.out.println();
                    System.out.println(" please Guess again: ");
                } else if (guess > random_number) {
                    System.out.println("You are too high! 👀Pick another number");
                    System.out.println();
                    System.out.println("please Guess Again");
                }
            } else if (numberOfTries == 5) {
                if (guess == random_number) {
                    System.out.println();
                    System.out.println(" congrats 🎉You guessed it correct ! The Number is : " + random_number);
                    System.out.println("It only took you,you have " + numberOfTries + " guesses to get it right!");
                    myKeyboard.close();
                    win = true;
                }
                if (guess != random_number) {
                    System.out.println();
                    System.out.println("Sorry dear you ran out of attempts. The correct number is : ");
                    System.out.println(random_number);
                    System.out.println(" Better luck next time ❤️👍");
                }
            }
        }
    }
}