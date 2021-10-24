package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static final Scanner sc = new Scanner(System.in);

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        System.out.printf("Hello, %s!", sc.next());
    }
}
