package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.RANDOM_RANGE;
import static hexlet.code.Utils.randInt;

public class ProgressionGame {

    private static final String RULE = "What number is missing in the progression?";
    public static final int MIN_PROGRESSION_SIZE = 5;
    public static final int MAX_PROGRESSION_SIZE = 11;

    public static void play() {
        String[][] questionsAndAnswers = new String[GAME_COUNTS][2];
        for (int i = 0; i < GAME_COUNTS; i++) {
            questionsAndAnswers[i] = generateQuestionAndAnswer();
        }
        Engine.play(RULE, questionsAndAnswers);
    }

    private static String[] generateQuestionAndAnswer() {
        int[] progression = generateProgression(
            randInt(MIN_PROGRESSION_SIZE, MAX_PROGRESSION_SIZE),
            randInt(RANDOM_RANGE)
        );
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

    private static int[] generateProgression(int progressionSize, int step) {
        int[] result = new int[progressionSize];
        result[0] = randInt(RANDOM_RANGE);
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] + step;
        }
        return result;
    }
}
