package edu.pingpong.stockx.domain.criteria;

import java.util.*;

import edu.pingpong.stockx.domain.item.*;

public class Asks implements Criteria {
    
    @Override
    public List<Offer> checkCriteria(Item item) {

        List<Offer> listaBids = new ArrayList<>();

        for (Offer offer : item.offers()) {
            if (offer instanceof Ask){
                listaBids.add(offer);
            }
        }

        return listaBids;
    }
}
