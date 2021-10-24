package hexlet.code;

import java.util.Scanner;

public class App {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();

        int choice = SC.nextInt();
        if (choice == 1) {
            Cli.greet(SC);
        } else if (choice == 2) {
            String playerName = Cli.greet(SC);
            EvenGame.play(SC, playerName);
        }
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.println("Your choice:");
    }
}
