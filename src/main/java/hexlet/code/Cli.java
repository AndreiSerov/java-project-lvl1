package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String greet(Scanner sc) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.next();
        System.out.printf("Hello, %s!%n", name);
        return name;
    }
}
