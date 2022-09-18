import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuessess = 0;

    Game() {
        Random rand = new Random();
        number = rand.nextInt(50);
    }

    void takeUserInput() {
        System.out.println("Enter the number between 1-50");
        try (Scanner sc = new Scanner(System.in)) {
            inputNumber = sc.nextInt();
        }
    }

    boolean isCorrectNumber() {
        noOfGuessess++;
        if (inputNumber == number) {
            System.out.println(
                    "Yeah you guess it right, your number is %d " +number +"and you have taken this much step to reach it out %d" +noOfGuessess);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Number is too low....");
        } else if (inputNumber > number) {
            System.out.println("Number is too high....");
        }
        return false;

    }
}

public class GuesstheGame {
    public static void main(String[] args) {
        boolean b = false;
        while(!b) {
            Game code = new Game();
            code.takeUserInput();
            b=code.isCorrectNumber();
        }
    }
}
