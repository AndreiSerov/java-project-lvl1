package hexlet.code;


import static hexlet.code.GlobalObjects.SC;

public class Cli {

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = SC.next();
        System.out.printf("Hello, %s!%n", name);
    }
}
