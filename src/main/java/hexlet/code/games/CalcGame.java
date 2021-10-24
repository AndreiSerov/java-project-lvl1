package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_COUNTS;
import static hexlet.code.Engine.isPlayerLoose;
import static hexlet.code.Engine.printAnswer;
import static hexlet.code.Engine.printCongratulations;
import static hexlet.code.Engine.printQuestion;
import static hexlet.code.Engine.randInt;
import static java.lang.String.format;

public class CalcGame {
    private static final char[] SIGNS = new char[] {'+', '-', '*'};

    public static void play(Scanner sc, String playerName) {
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < GAME_COUNTS; i++) {
            int x = randInt();
            int y = randInt();
            char sign = SIGNS[randInt(SIGNS.length)];
            printQuestion(format("%d %s %d", x, sign, y));

            int expected = sign == '+' ? x + y : sign == '-' ? x - y : x * y;
            int actual = sc.nextInt();
            printAnswer(actual);

            if (isPlayerLoose(expected, actual, playerName)) {
                return;
            }
        }

        printCongratulations(playerName);
    }

}
