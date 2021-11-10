package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.RANDOM_RANGE;
import static hexlet.code.Utils.randInt;
import static java.lang.String.format;

public class CalcGame {

    private static final String RULE = "What is the result of the expression?";
    private static final char[] SIGNS = new char[] {'+', '-', '*'};

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
        char sign = SIGNS[randInt(SIGNS.length)];
        int expected = 0;
        switch (sign) {
            case '+':
                expected = x + y;
                break;
            case '-':
                expected = x - y;
                break;
            case '*':
                expected = x * y;
                break;
            default:
                System.out.println("Wrong sign");
                break;
        }
        return new String[]{format("%d %s %d", x, sign, y), String.valueOf(expected)};
    }
}
