package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.RANDOM_RANGE;
import static hexlet.code.Utils.randInt;

public class PrimeGame {

    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {
        String[][] questionsAndAnswers = new String[GAME_COUNTS][2];
        for (int i = 0; i < GAME_COUNTS; i++) {
            questionsAndAnswers[i] = generateQuestionAndAnswer();
        }
        Engine.play(RULE, questionsAndAnswers);
    }

    private static String[] generateQuestionAndAnswer() {
        int randomNumber = randInt(RANDOM_RANGE);
        String expected = isPrime(randomNumber) ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), expected};
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
