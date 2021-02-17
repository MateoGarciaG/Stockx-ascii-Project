package edu.pingpong.stockx.domain.criteria;

import static org.junit.Assert.*;
import org.junit.*;

import edu.pingpong.stockx.domain.item.*;

public class BidsTest {
    
    private Criteria bid = null;
    private Item sneaker = null;

    @Before
    public void setup() {
        this.bid = new Bids();
        this.sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void checkCriteriaTest() {

        this.sneaker.add(new Bid("6", 200));
        this.sneaker.add(new Bid("9.5", 479));
        this.sneaker.add(new Bid("13", 338));
        this.sneaker.add(new Bid("9.5", 480));

        assertEquals(4, this.bid.checkCriteria(this.sneaker).size());

        for (Offer oferta : this.bid.checkCriteria(this.sneaker)) {
            assertTrue(oferta instanceof Offer);
            assertTrue(oferta instanceof Bid);
        }

    }
}
