package ch.bbw.benbrc;

/**
 * The Video class represents a video object. Information about the video is
 * stored and can be retrieved.
 */
public class Video extends Item {

    private String director;

    /**
     * Constructor for objects of class Video
     */
    public Video(String theTitle, String theDirector, int time) {
        super(theTitle, time);
        director = theDirector;
    }

    @Override
    public String getInfo() {
        String output = "Video: ";
        output += super.getInfo();
        output += "director: " + director;
        output += "\n**********\n";
        return output;
    }

    @Override
    public String getAusleihefrist() {
        return "1 Woche";
    }
}
