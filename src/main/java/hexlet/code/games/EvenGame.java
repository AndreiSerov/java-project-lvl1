package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.isPlayerLose;
import static hexlet.code.Engine.printCongratulations;
import static hexlet.code.Engine.printQuestion;
import static hexlet.code.Engine.randInt;

public class EvenGame {

    public static void play(Scanner sc, String playerName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < GAME_COUNTS; i++) {
            int randomNumber = randInt();
            printQuestion(randomNumber);

            String expected = randomNumber % 2 == 0 ? "yes" : "no";
            String actual = sc.next();

            if (isPlayerLose(expected, actual, playerName)) {
                return;
            }
        }

        printCongratulations(playerName);
    }
}
