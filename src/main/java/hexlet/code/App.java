package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    private static final Scanner SC = new Scanner(System.in);

    private static final int EXIT = 0;
    private static final int EVEN = 2;
    private static final int CALC = 3;

    public static void main(String[] args) {
        printMenu();
        int choice = SC.nextInt();
        if (choice == EXIT) {
            return;
        }

        String playerName = Cli.greet(SC);
        if (choice == EVEN) {
            EvenGame.play(SC, playerName);
        } else if (choice == CALC) {
            CalcGame.play(SC, playerName);
        }
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.println("Your choice:");
    }
}
