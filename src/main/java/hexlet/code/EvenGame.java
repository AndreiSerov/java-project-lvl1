package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final int RANDOM_RANGE = 123;
    private static final int GAME_COUNTS = 3;

    public static void play(Scanner sc, String playerName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < GAME_COUNTS; i++) {
            int randomNumber = new Random().nextInt(RANDOM_RANGE);
            String expectedAnswer = randomNumber % 2 == 0 ? "yes" : "no";

            System.out.printf("Question: %d%n", randomNumber);
            String actualAnswer = sc.next();
            System.out.printf("Your answer: %s%n", actualAnswer);

            if (actualAnswer.equals(expectedAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("Let's try again, %s!%n", playerName);
                return;
            }
        }

        System.out.printf("Congratulations, %s!%n", playerName);
    }
}
