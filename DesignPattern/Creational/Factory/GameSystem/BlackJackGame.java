package DesignPattern.Creational.Factory.GameSystem;

public class BlackJackGame {
    public static void main(String[] args) {
        IPlayer player1 = PlayerFactory.createPlayer("HUMAN", "DIXIT");
        IPlayer player2 = PlayerFactory.createPlayer("BOT", null);

        player1.makeMove();
        player2.makeMove();
    }
}
