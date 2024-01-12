package ch.bbw.benbrc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Database database = new Database();
        CD asdf = new CD("asdf", "A, S, D, F", 12, 35);
        CD xyz = new CD("xyz", "X, Y, Z", 11, 35);
        CD bornToDie = new CD("born to Die", "Lana del Ray", 14, 51);
        CD thinkLater = new CD("Think Later", "Tate McRae", 12, 42);

        database.addItem(asdf);
        database.addItem(xyz);
        database.addItem(bornToDie);
        database.addItem(thinkLater);

        Video dieHard = new Video("Die Hard", "John M.....", 180);
        Video Interstellar = new Video("interstellar", "Christopher Nolan", 180);
        Video inception = new Video("inception", "Christopher Nolan", 180);
        Video adAstra = new Video("ad Astra", "James Gray", 180);

        database.addItem(dieHard);
        database.addItem(Interstellar);
        database.addItem(inception);
        database.addItem(adAstra);

        database.list();
    }
}
