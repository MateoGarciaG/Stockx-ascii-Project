package edu.pingpong.stockx.domain.item;

import java.util.*;

public class Sneaker implements Item {
    
    private String style = null;
    private String name = null;
    private int sale;
    private int ask;
    private int bid;

    private List<Offer> ofertas = new ArrayList<Offer>();

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

    @Override
    public int getSale() {
        return sale;
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }


    @Override
    public int getAsk() {
        return ask;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public int getBid() {
        return bid;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public void add(Offer oferta) {
        this.ofertas.add(oferta);
    }

    @Override
    public List<Offer> offers() {

        return this.ofertas;
    }



    @Override
    public String toString() {
        return String.format("%s %s", this.getName(), this.getStyle());
    }

}
