package gameworld;

public class Chess extends Game{
    public Chess()
    {
        super("Chess");
    }

    @Override
    public void startGame() {
        super.startGame();

        System.out.println("Starting the chess game");
    }

    @Override
    public void play() {
        System.out.println("Playing chess");
    }

    public void makeMove(){
        System.out.println("Making the move");
    }

    @Override
    public void endGame() {
        System.out.println("Ending the chess game");
    }
}
