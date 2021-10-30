package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM =  new Random();

    public static int randInt(int range) {
        return RANDOM.nextInt(range);
    }

    public static int randInt(int start, int end) {
        return randInt(end) + start;
    }
}
