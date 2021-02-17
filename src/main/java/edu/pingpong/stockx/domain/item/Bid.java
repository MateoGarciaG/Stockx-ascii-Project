package edu.pingpong.stockx.domain.item;

public class Bid implements Offer {
    

    private String size = null;
    private Integer bid = null;


    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.bid;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.size(), this.value());
    }

}
