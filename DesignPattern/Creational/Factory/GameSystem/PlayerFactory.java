package DesignPattern.Creational.Factory.GameSystem;

public class PlayerFactory {
    public static IPlayer createPlayer(String type, String name){
        if(type.equalsIgnoreCase("HUMAN")){
            return new HumanPlayer(name);
        }else if(type.equalsIgnoreCase("BOT")) return new BotPlayer();
        throw new IllegalArgumentException("Unknown player type "+type);
    }
}
