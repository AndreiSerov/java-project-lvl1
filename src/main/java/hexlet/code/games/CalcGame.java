package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.randInt;
import static java.lang.String.format;

public class CalcGame {

    private static final String RULE = "What is the result of the expression?";
    private static final char[] SIGNS = new char[] {'+', '-', '*'};
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
        char sign = SIGNS[randInt(SIGNS.length)];
        int expected = switch (sign) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            default  -> throw new IllegalStateException("Unexpected value: " + sign);
        };
        return new String[]{format("%d %s %d", x, sign, y), String.valueOf(expected)};
    }
}
