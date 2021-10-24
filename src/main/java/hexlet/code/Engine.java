package hexlet.code;

import java.util.Random;

public class Engine {
    private static final int RANDOM_RANGE = 100;
    public static final int GAME_COUNTS = 3;
    private static final Random RANDOM =  new Random();

    public static boolean isPlayerLose(Object expected, Object actual, String playerName) {
        if (expected.equals(actual)) {
            System.out.println("Correct!");
            return false;
        } else {
            System.out.println("'" + actual + "' is wrong answer ;(. Correct answer was '" + expected + "'.");
            System.out.printf("Let's try again, %s!%n", playerName);
            return true;
        }

    }

    public static void printCongratulations(String playerName) {
        System.out.printf("Congratulations, %s!%n", playerName);
    }
    public static void printQuestion(Object question) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
    }

    public static int randInt() {
        return RANDOM.nextInt(RANDOM_RANGE);
    }

    public static int randInt(int range) {
        return RANDOM.nextInt(range);
    }

}
