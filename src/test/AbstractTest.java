package test;

import gameworld.Chess;
import gameworld.Game;
import gameworld.Ludo;

public class AbstractTest {
    public static void main(String[] args) {
        Game g = new Chess();

        g.startGame();

        g = new Ludo();

        g.play();

        g.endGame();
    }
}
