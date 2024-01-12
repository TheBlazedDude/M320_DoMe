package ch.bbw.benbrc;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class BoardGame extends Game {
    
    private String ausleihfrist;

    public BoardGame(String title, int time, int numberOfPlayers) {
        super(title, time, numberOfPlayers);
        this.ausleihfrist = "3 Wochen";

    }

    @Override
    public String getInfo() {
        String output = "Board Game: ";
        output += super.getInfo();
        output += "numberOfPlayer: " + super.getNumberOfPlayers();
        output += "\n**********\n";
        return output;
    }

    @Override
    public String getAusleihefrist() {
        return this.ausleihfrist;
    }
}
