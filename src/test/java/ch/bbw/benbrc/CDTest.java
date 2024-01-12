package ch.bbw.benbrc;

import static org.junit.Assert.*;
import org.junit.Test;
import ch.bbw.benbrc.CD;

public class CDTest {

    @Test
    public void testConstructor() {
        CD cd = new CD("The Dark Side of the Moon", "Pink Floyd", 10, 42);
        assertNotNull(cd);
        assertEquals("The Dark Side of the Moon", cd.getTitle());
        assertEquals(42, cd.getTime());
        // Weitere Überprüfungen für Künstler und Trackanzahl
    }

    @Test
    public void testGetInfo() {
        CD cd = new CD("The Dark Side of the Moon", "Pink Floyd", 10, 42);
        String info = cd.getInfo();
        assertTrue(info.contains("CD:"));
        assertTrue(info.contains("The Dark Side of the Moon"));
        assertTrue(info.contains("Pink Floyd"));
        // Weitere Überprüfungen für die Info-Ausgabe
    }

    @Test
    public void testGetAusleihefrist() {
        CD cd = new CD("The Dark Side of the Moon", "Pink Floyd", 10, 42);
        assertEquals("3 Wochen", cd.getAusleihefrist());
    }
}
