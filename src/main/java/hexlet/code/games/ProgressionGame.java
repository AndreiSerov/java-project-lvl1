package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.isPlayerLose;
import static hexlet.code.Engine.printCongratulations;
import static hexlet.code.Engine.printQuestion;
import static hexlet.code.Engine.randInt;

public class ProgressionGame {
    public static final int MIN_PROGRESSION_SIZE = 5;
    public static final int MAX_PROGRESSION_SIZE = 11;



    public static void play(Scanner sc, String playerName) {
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < GAME_COUNTS; i++) {
            int[] progression = generateProgression();
            int hiddenNumberIndex = randInt(progression.length);
            int hiddenNumber = progression[hiddenNumberIndex];
            printQuestion(getQuestion(progression, hiddenNumber));

            int actual = sc.nextInt();
            if (isPlayerLose(hiddenNumber, actual, playerName)) {
                return;
            }
        }

        printCongratulations(playerName);
    }

    private static StringBuilder getQuestion(int[] progression, int hiddenNumber) {
        StringBuilder question = new StringBuilder();
        for (int number : progression) {
            question.append(number == hiddenNumber ? ".. " : number + " ");
        }
        return question;
    }

    private static int[] generateProgression() {
        int[] result = new int[randInt(MAX_PROGRESSION_SIZE) + MIN_PROGRESSION_SIZE];
        int step = randInt();
        result[0] = step;
        for (int i = 1; i < result.length; i++) {
            result[i] = step + result[i - 1];
        }
        return result;
    }
}
