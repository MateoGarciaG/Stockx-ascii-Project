package edu.pingpong.stockx.domain.criteria;

import static org.junit.Assert.*;
import org.junit.*;

import edu.pingpong.stockx.domain.item.*;

public class AsksTest {
    
    private Criteria ask = null;
    private Item sneaker = null;

    @Before
    public void setup() {
        this.ask = new Asks();
        this.sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void checkCriteriaTest() {

        this.sneaker.add(new Ask("6", 600));
        this.sneaker.add(new Ask("9.5", 333));
        this.sneaker.add(new Ask("9.5", 340));
        this.sneaker.add(new Ask("13", 330));

        assertEquals(4, this.ask.checkCriteria(this.sneaker).size());

        for (Offer oferta : this.ask.checkCriteria(this.sneaker)) {
            assertTrue(oferta instanceof Offer);
            assertTrue(oferta instanceof Ask);
        }

    }
}
