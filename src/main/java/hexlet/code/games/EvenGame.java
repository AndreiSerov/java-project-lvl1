package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.RANDOM_RANGE;
import static hexlet.code.Utils.randInt;

public class EvenGame {

    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        String[][] questionsAndAnswers = new String[GAME_COUNTS][2]; // game
        for (int i = 0; i < GAME_COUNTS; i++) {
            questionsAndAnswers[i] = generateQuestionAndAnswer();
        }
        Engine.play(RULE, questionsAndAnswers);
    }

    private static String[] generateQuestionAndAnswer() {
        int randomNumber = randInt(RANDOM_RANGE);
        String expected = randomNumber % 2 == 0 ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), expected};
    }
}
