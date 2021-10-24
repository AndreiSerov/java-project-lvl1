package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.isPlayerLose;
import static hexlet.code.Engine.printCongratulations;
import static hexlet.code.Engine.printQuestion;
import static hexlet.code.Engine.randInt;

public class PrimeGame {

    public static void play(Scanner sc, String playerName) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < GAME_COUNTS; i++) {
            int randomNumber = randInt();
            printQuestion(randomNumber);

            String expected = isPrime(randomNumber) ? "yes" : "no";
            String actual = sc.next();

            if (isPlayerLose(expected, actual, playerName)) {
                return;
            }
        }

        printCongratulations(playerName);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
