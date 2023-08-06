import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Player[] players = {new Player("Player 1"), new Player("Player 1")};
        int N = 5;

        Game game = new Game(N, players);
        game.playGame();
    }
}