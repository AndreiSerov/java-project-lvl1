package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greet(Scanner sc) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        System.out.printf("Hello, %s!", sc.next());
    }
}
