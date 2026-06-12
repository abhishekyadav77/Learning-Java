package Java_Oops;
import java.util.Random;
import java.util.Scanner;

class Game {
    private int number;        // random number
    private int noOfGuesses;   // count guesses
    private int inputNumber;   // user input

    // Constructor
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100); // number between 0-99
        this.noOfGuesses = 0;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    void takeUserInput() {
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        noOfGuesses++;
    }

    boolean isCorrectNumber() {
        if (inputNumber == number) {
            System.out.println(" Correct! You guessed it in " + noOfGuesses + " tries.");
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too Low");
        } else {
            System.out.println("Too High");
        }
        return false;
    }
}

public class cwh_50_ex_3_solution {
    public static void main(String[] args) {
        Game g = new Game();
        boolean correct = false;

        while (!correct) {
            g.takeUserInput();
            correct = g.isCorrectNumber();
        }
    }
}

