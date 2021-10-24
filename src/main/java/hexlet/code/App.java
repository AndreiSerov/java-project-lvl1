package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greet;

public class App {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();

        if (SC.nextInt() == 1) {
            greet(SC);
        }
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.println("Your choice:");
    }
}
