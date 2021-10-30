package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int RANDOM_RANGE = 100;
    public static final int GAME_COUNTS = 3;
    private static String playerName;

    public static void play(Scanner sc, String rule, String[][] questionsAndAnswers) {
        welcomePlayerAndAskHisName();
        playerName = sc.next();
        sayHello();
        printRule(rule);
        for (int i = 0; i < GAME_COUNTS; i++) {
            printQuestion(questionsAndAnswers[i][0]);
            String playerAnswer = sc.next();
            if (isPlayerLose(questionsAndAnswers[i][1], playerAnswer)) {
                return;
            }
        }
        printCongratulations();
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

    private static void printCongratulations() {
        System.out.printf("Congratulations, %s!%n", playerName);
    }

    private static void printQuestion(Object question) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
    }

    private static void welcomePlayerAndAskHisName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
    }

    private static void printRule(String rule) {
        System.out.println(rule);
    }

    private static void sayHello() {
        System.out.printf("Hello, %s!%n", playerName);
    }
}
