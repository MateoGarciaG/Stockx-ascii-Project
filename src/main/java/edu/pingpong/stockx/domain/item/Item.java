package edu.pingpong.stockx.domain.item;

import java.util.List;

public interface Item {
    
    int getBid();
    int getAsk();
    int getSale();
    void add(Offer oferta);
    List<Offer> offers();
    void setBid(int bid);
    void setAsk(int ask);
    void setSale(int sale);
    

}
