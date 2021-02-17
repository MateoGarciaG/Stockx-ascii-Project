package edu.pingpong.stockx.domain.item;

import static org.junit.Assert.*;
import org.junit.*;

public class SneakerTest {
    

    private Item sneaker = null;

    @Before
    public void setupSneaker() {

        this.sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void constructorTest() {

        assertNotNull(this.sneaker);
    }

    @Test
    public void toStringTest() {

        assertEquals("Jordan 1 Retro High Dark Mocha\n555088-105", this.sneaker.toString());
    }

    @Test
    public void addTest() {

        Offer bid = new Bid("13", 550);

        sneaker.add(bid);

        assertEquals(1, this.sneaker.getBid());

    }


}
