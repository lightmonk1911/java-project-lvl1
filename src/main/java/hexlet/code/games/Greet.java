package hexlet.code.games;

import hexlet.code.Cli;

public class Greet {
    public static void play() {
        String userName = Cli.askName();
        Cli.greet(userName);
    }
}
