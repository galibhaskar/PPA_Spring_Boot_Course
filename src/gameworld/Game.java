package gameworld;

public abstract class Game {
    public String name;

    public Game(String n)
    {
        this.name = n;
    }

    public abstract void play();

    public void startGame()
    {
        System.out.println("Starting the game....");
    }

    public abstract void endGame();
}
