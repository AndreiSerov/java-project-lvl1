package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.RANDOM_RANGE;
import static hexlet.code.Utils.randInt;

public class EvenGame {

    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final String[][] QUESTIONS_AND_ANSWERS = new String[GAME_COUNTS][2];

    public static void play(Scanner sc) {
        for (int i = 0; i < GAME_COUNTS; i++) {
            QUESTIONS_AND_ANSWERS[i] = generateQuestionAndAnswer();
        }
        Engine.play(sc, RULE, QUESTIONS_AND_ANSWERS);
    }

    private static String[] generateQuestionAndAnswer() {
        int randomNumber = randInt(RANDOM_RANGE);
        String expected = randomNumber % 2 == 0 ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), expected};
    }
}
