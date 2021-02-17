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


    private String getStyle() {
        return style;
    }

    private String getName() {
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

    public void add(Offer oferta) {
        System.out.println("");
    }

    // Ya que deuelve una lista de tipo Offer la cual aún no está creada
    // mockearé a un String por ahora
    public String offers() {

        return "";
    }



    @Override
    public String toString() {
        return String.format("%s\n%s", this.getName(), this.getStyle());
    }

}
