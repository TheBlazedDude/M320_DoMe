package ch.bbw.benbrc;



/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Game extends Item {
    // instance variables - replace the example below with your own

    private int numberOfPlayers;

    /**
     * Constructor for objects of class Game
     */
    public Game(String title, int time,  int numberOfPlayers) {
        super(title, time);
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }
    
}
