package ch.bbw.benbrc;

import static org.junit.Assert.*;
import org.junit.Test;
import ch.bbw.benbrc.BoardGame;

public class BoardGameTest {

    @Test
    public void testConstructor() {
        BoardGame game = new BoardGame("Schach", 30, 2);
        assertNotNull(game);
        assertEquals("Schach", game.getTitle());
        assertEquals(30, game.getTime());
        assertEquals(2, game.getNumberOfPlayers());
    }

    @Test
    public void testGetInfo() {
        BoardGame game = new BoardGame("Schach", 30, 2);
        String info = game.getInfo();
        assertTrue(info.contains("Board Game:"));
        assertTrue(info.contains("Schach"));
        assertTrue(info.contains("2"));
    }

    @Test
    public void testGetAusleihefrist() {
        BoardGame game = new BoardGame("Schach", 30, 2);
        assertEquals("3 Wochen", game.getAusleihefrist());
    }
}
