package DesignPattern.Creational.Factory.GameSystem;

public class HumanPlayer implements IPlayer {
    private String name;
    public HumanPlayer(String name) {
        this.name = name;
    }
    public void makeMove(){
        System.out.println(name + " is making move");
    }
}
