package ch.bbw.benbrc;

/**
 * @uml.dependency supplier="Database"
 */
public class TestDatabase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create database
		Database database = new Database();

		// create cd
		CD acdcHv = new CD("high voltage", "acdc", 12, 45);
		// add cd . . . to the list
		database.addItem(acdcHv);

		// create video
		Video dieHard = new Video("Die Hard", "John M.....", 180);
		// add video to list
		database.addItem(dieHard);

		// create videogame
		ComputerGame anno2070 = new ComputerGame("Anno 2070", 0,  1, "Windows 7");
		// add videogame to list
		database.addItem(anno2070);

		// create boardgame
		BoardGame schach = new BoardGame("Schach", 0, 2);
		// add boardgame to list
		database.addItem(schach);

		// show list
		database.list();
	}

}
