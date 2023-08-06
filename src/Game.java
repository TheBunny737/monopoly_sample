public class Game {
    private int roundCnt;
    private int N;
    private Player[] players;

    public Game(int N, Player[] players) {
        this.roundCnt = 0;
        this.N = N;
        this.players = players;
    }

    public void playGame() {
        while (roundCnt < N) {
            playRound();
        }
        takeTurn();
    }

    public void playRound() {
        // PlayRound
    }

    public void takeTurn() {
        for (Player player : players) {
            player.takeTurn();
        }
    }
}
