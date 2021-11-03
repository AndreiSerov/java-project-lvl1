package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    // One scanner for the whole app. It means it keeps one memory address which produce better performance
    private static final Scanner SC = new Scanner(System.in);

    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        printMenu();
        int choice = SC.nextInt();
        switch (choice) {
            case GREET       -> Cli.greet(SC);
            case EVEN        -> EvenGame.play(SC);
            case CALC        -> CalcGame.play(SC);
            case GCD         -> GcdGame.play(SC);
            case PROGRESSION -> ProgressionGame.play(SC);
            case PRIME       -> PrimeGame.play(SC);
            // Cant use break here https://github.com/AndreiSerov/java-project-lvl1/issues/2
            default          -> System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println("Your choice:");
    }
}
