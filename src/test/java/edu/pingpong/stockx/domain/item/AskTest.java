package edu.pingpong.stockx.domain.item;

import static org.junit.Assert.*;
import org.junit.*;

public class AskTest {

    private Offer ask = null;

    @Before
    public void setUpAsk() {
        String size = "13";
        Integer ask = 288;
        this.ask = new Ask(size, ask);
    }

    @Test
    public void constructor() {

        assertNotNull(this.ask);
    }

    @Test
    public void sizeTest() {

        assertEquals("13", this.ask.size());
        assertEquals(288, this.ask.value());
        
        // Otro Objeto bid
        String size = "6";
        Integer ask = 600;

        Offer nuevoAsk = new Ask(size, ask);

        assertEquals("6", nuevoAsk.size());
        assertEquals(600, nuevoAsk.value());
    }
    
}
