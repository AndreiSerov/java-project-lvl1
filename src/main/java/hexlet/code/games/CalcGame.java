package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.RANDOM_RANGE;
import static hexlet.code.Utils.randInt;
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
        int x = randInt(RANDOM_RANGE);
        int y = randInt(RANDOM_RANGE);
        char sign = SIGNS[randInt(SIGNS.length)];
        int expected = switch (sign) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            default  -> '+'; // i dont know what is Exceptions yet =)
        };
        return new String[]{format("%d %s %d", x, sign, y), String.valueOf(expected)};
    }
}
