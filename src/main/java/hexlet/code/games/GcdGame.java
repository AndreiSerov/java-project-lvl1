package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.isPlayerLose;
import static hexlet.code.Engine.printCongratulations;
import static hexlet.code.Engine.printQuestion;
import static hexlet.code.Engine.randInt;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.String.format;

public class GcdGame {

    public static void play(Scanner sc, String playerName) {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < GAME_COUNTS; i++) {
            int x = randInt();
            int y = randInt();
            printQuestion(format("%d %d", x, y));

            int expected = calculateGcd(x, y);
            String actual = sc.next();
            if (isPlayerLose(expected, actual, playerName)) {
                return;
            }
        }

        printCongratulations(playerName);
    }

    private static int calculateGcd(int biggerNumber, int lessNumber) {
        if (biggerNumber < lessNumber) {
            biggerNumber += lessNumber;
            lessNumber = biggerNumber - lessNumber;
            biggerNumber -= lessNumber;
        }
        return lessNumber == 0 ? biggerNumber : calculateGcd(lessNumber, biggerNumber % lessNumber);
    }
}
