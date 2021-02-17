package edu.pingpong.stockx.domain.criteria;

import java.util.*;

import edu.pingpong.stockx.domain.item.*;

public class Bids implements Criteria {
    
    @Override
    public List<Offer> checkCriteria(Item item) {

        List<Offer> listaBids = new ArrayList<>();

        for (Offer offer : item.offers()) {
            if (offer instanceof Bid) {
                listaBids.add(offer);
            } else {
                continue;
            }
        }

        return listaBids;
    }
}
