package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int RANDOM_RANGE = 100;
    public static final int GAME_COUNTS = 3;
    private static String playerName;

    public static void play(Scanner sc, String rule, String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = sc.next();
        System.out.printf("Hello, %s!%n", playerName);
        System.out.println(rule);
        for (int i = 0; i < GAME_COUNTS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String playerAnswer = sc.next();
            if (isPlayerLose(questionsAndAnswers[i][1], playerAnswer)) {
                return;
            }
        }
        System.out.printf("Congratulations, %s!%n", playerName);
    }

    private static boolean isPlayerLose(Object expected, Object actual) {
        if (expected.equals(actual)) {
            System.out.println("Correct!");
            return false;
        } else {
            System.out.println("'" + actual + "' is wrong answer ;(. Correct answer was '" + expected + "'.");
            System.out.printf("Let's try again, %s!%n", playerName);
            return true;
        }
    }
}
