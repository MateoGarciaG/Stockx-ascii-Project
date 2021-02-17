package edu.pingpong.stockx.domain.item;

public class Sale implements Offer {
    
    private String size = null;
    private Integer price = null;


    public Sale(String size, Integer price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.size(), this.value());
    }
}
