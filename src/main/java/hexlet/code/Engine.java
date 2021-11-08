package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int RANDOM_RANGE = 100;
    public static final int GAME_COUNTS = 3;
    // если playerName оставить здесь то он точно не создаст никакой ошибки при многократном запуске игры =)

    public static void play(Scanner sc, String rule, String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = sc.next();
        System.out.printf("Hello, %s!%n", playerName);
        System.out.println(rule);
        for (int i = 0; i < GAME_COUNTS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String playerAnswer = sc.next();
            if (questionsAndAnswers[i][1].equals(playerAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + questionsAndAnswers[i][1] + "' is wrong answer ;(. Correct answer was '"
                    + playerAnswer + "'.");
                System.out.printf("Let's try again, %s!%n", playerName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!%n", playerName);
    }
}
