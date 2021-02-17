package edu.pingpong.stockx.domain.item;

import static org.junit.Assert.*;
import org.junit.*;

public class BidTest {
    
    Offer bid = null;

    @Before
    public void setupBid() {

        String size = "13";
        Integer ask = 550;

        this.bid = new Bid(size, ask);
    }

    @Test
    public void constructorBid() {

        assertNotNull(this.bid);
    }

    @Test
    public void sizeTest() {

        assertEquals("13", this.bid.size());
        assertEquals(550, this.bid.value());
        
        // Otro Objeto bid
        String size = "6";
        Integer ask = 200;

        Offer nuevoBid = new Bid(size, ask);

        assertEquals("6", nuevoBid.size());
        assertEquals(200, nuevoBid.value());
    }
}
