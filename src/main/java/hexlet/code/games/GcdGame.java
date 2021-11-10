package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.RANDOM_RANGE;
import static hexlet.code.Utils.randInt;
import static java.lang.String.format;

public class GcdGame {

    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void play() {
        String[][] questionsAndAnswers = new String[GAME_COUNTS][2];
        for (int i = 0; i < GAME_COUNTS; i++) {
            questionsAndAnswers[i] = generateQuestionAndAnswer();
        }
        Engine.play(RULE, questionsAndAnswers);
    }

    private static String[] generateQuestionAndAnswer() {
        int x = randInt(RANDOM_RANGE);
        int y = randInt(RANDOM_RANGE);
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
