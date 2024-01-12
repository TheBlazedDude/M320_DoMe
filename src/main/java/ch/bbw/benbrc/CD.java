package ch.bbw.benbrc;

/**
 * The CD class represents a CD object. Information about the CD is stored and
 * can be retrieved.
 */
public class CD extends Item {

    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time) {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }

    @Override
    public String getInfo() {
        String output = "CD: ";
        output += super.getInfo();
        output += "artist: " + artist + ", " + "tracks: " + numberOfTracks;
        output +="\n**********\n";
        return output;
    }

    @Override
    public String getAusleihefrist() {
        return "3 Wochen";
    }
}
