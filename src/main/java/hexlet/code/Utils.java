package hexlet.code;

public final class Utils {
    public static int randomInt(int min, int max) {
        return min + ((int) (Math.random() * (max - min)));
    }

    public static int randomInt(int max) {
        return randomInt(0, max);
    }
}
