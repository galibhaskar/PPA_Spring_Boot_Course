package gameworld;

public class Ludo extends Game{
    public Ludo()
    {
        super("Ludo");
    }

    @Override
    public void startGame() {
        super.startGame();

        System.out.println("Starting Ludo game");
    }

    @Override
    public void play() {
        System.out.println("Playing the Ludo game");
    }

    @Override
    public void endGame() {
        System.out.println("Ending the Ludo game");
    }
}
