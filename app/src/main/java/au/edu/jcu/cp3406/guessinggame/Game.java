package au.edu.jcu.cp3406.guessinggame;

import java.util.Random;

public class Game {

    int randomNumber;

    Game() {
        Random random = new Random();
        randomNumber = random.nextInt(10) + 1;

    }

    public boolean check(int guess) {
        return guess == randomNumber;
    }

}
