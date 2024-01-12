package ch.bbw.benbrc;

public abstract class Item {

    private String title;
    private int time;
    private boolean gotIt;
    private String comment;

    /**
     * Initialise the fields of the item.
     */
    public Item(String title, int time) {
        this.title = title;
        this.time = time;
        gotIt = false;
        comment = "<no comment>";
    }

    public abstract String getAusleihefrist();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isGotIt() {
        return gotIt;
    }

    public void setGotIt(boolean gotIt) {
        this.gotIt = gotIt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getInfo() {
        String output = "\ntitle: " + title + " (" + time + " mins)\n";
        if (gotIt) {
            output += "*\n";
        }
        output += comment + "\n";
        return output;
    }

}
