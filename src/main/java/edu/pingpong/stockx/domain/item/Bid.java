package edu.pingpong.stockx.domain.item;

public class Bid implements Offer {
    

    private String size = null;
    private Integer ask = null;


    public Bid(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.ask;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.size, this.ask);
    }

}
