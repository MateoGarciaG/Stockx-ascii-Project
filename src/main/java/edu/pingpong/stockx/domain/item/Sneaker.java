package edu.pingpong.stockx.domain.item;

public class Sneaker implements Item {
    
    private String style = null;
    private String name = null;
    private int sale;
    private int ask;
    private int bid;


    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;

    }


    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    
    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }



    public int getAsk() {
        return ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s", this.getName(), this.getStyle());
    }

}
