package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import static hexlet.code.GlobalObjects.SC;

public class App {

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
            case EVEN        -> EvenGame.play();
            case CALC        -> CalcGame.play();
            case GCD         -> GcdGame.play();
            case PROGRESSION -> ProgressionGame.play();
            case PRIME       -> PrimeGame.play();
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
