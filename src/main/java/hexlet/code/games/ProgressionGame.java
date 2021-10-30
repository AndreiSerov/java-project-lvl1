package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.RANDOM_RANGE;
import static hexlet.code.Utils.randInt;

public class ProgressionGame {

    private static final String RULE = "What number is missing in the progression?";
    public static final int MIN_PROGRESSION_SIZE = 5;
    public static final int MAX_PROGRESSION_SIZE = 11;
    private static final String[][] QUESTIONS_AND_ANSWERS = new String[GAME_COUNTS][2];

    public static void play(Scanner sc) {
        for (int i = 0; i < GAME_COUNTS; i++) {
            QUESTIONS_AND_ANSWERS[i] = generateQuestionAndAnswer();
        }
        Engine.play(sc, RULE, QUESTIONS_AND_ANSWERS);
    }

    private static String[] generateQuestionAndAnswer() {
        int[] progression = generateProgression(MIN_PROGRESSION_SIZE, MAX_PROGRESSION_SIZE);
        int hiddenNumberIndex = randInt(progression.length);
        int hiddenNumber = progression[hiddenNumberIndex];
        StringBuilder question = getQuestion(progression, hiddenNumber);
        return new String[]{question.toString(), String.valueOf(hiddenNumber)};
    }

    private static StringBuilder getQuestion(int[] progression, int hiddenNumber) {
        StringBuilder question = new StringBuilder();
        for (int number : progression) {
            question.append(number == hiddenNumber ? ".. " : number + " ");
        }
        return question;
    }

    private static int[] generateProgression(int start, int end) {
        int[] result = new int[randInt(start, end)];
        int step = randInt(RANDOM_RANGE);
        result[0] = step;
        for (int i = 1; i < result.length; i++) {
            result[i] = step + result[i - 1];
        }
        return result;
    }
}
