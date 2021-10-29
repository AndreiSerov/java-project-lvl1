package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.randInt;
import static java.lang.String.format;

public class GcdGame {

    private static final String RULE = "Find the greatest common divisor of given numbers.";
    private static final String[][] QUESTIONS_AND_ANSWERS = new String[GAME_COUNTS][2];

    public static void play(Scanner sc) {
        for (int i = 0; i < GAME_COUNTS; i++) {
            QUESTIONS_AND_ANSWERS[i] = generateQuestionAndAnswer();
        }
        Engine.play(sc, RULE, QUESTIONS_AND_ANSWERS);
    }

    private static String[] generateQuestionAndAnswer() {
        int x = randInt();
        int y = randInt();
        int expected = calculateGcd(x, y);
        return new String[]{format("%d %d", x, y), String.valueOf(expected)};
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
