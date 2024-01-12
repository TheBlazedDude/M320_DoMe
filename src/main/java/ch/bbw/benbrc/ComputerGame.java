package ch.bbw.benbrc;

public class ComputerGame extends Game {

    private String platform;

    /**
     * Constructor for objects of class VideoGame
     */
    public ComputerGame(String theTitle, int time, int numberOfPlayer,
            String platform) {
        super(theTitle, time, numberOfPlayer);
        this.platform = platform;
    }

    @Override
    public String getInfo() {
        String output = "Computer Game: ";
        output += super.getInfo();
        output += "numberOfPlayer: " + super.getNumberOfPlayers() + ",platform: " + platform;
        output += "\n**********\n";
        return output;
    }

    @Override
    public String getAusleihefrist() {
        return "2 Wochen";
    }
}
