package edu.pingpong.stockx.domain.item;


import static org.junit.Assert.*;
import org.junit.*;


public class SaleTest {
    
    private Offer sale = null;

    @Before
    public void setUpSale() {
        String size = "6";
        Integer price = 352;
        this.sale = new Sale(size, price);
    }

    @Test
    public void constructor() {

        assertNotNull(this.sale);
    }

    @Test
    public void sizeTest() {

        assertEquals("6", this.sale.size());
        assertEquals(352, this.sale.value());
        
        // Otro Objeto bid
        String size = "9.5";
        Integer ask = 352;

        Offer nuevoSale = new Sale(size, ask);

        assertEquals("9.5", nuevoSale.size());
        assertEquals(352, nuevoSale.value());
    }

}
