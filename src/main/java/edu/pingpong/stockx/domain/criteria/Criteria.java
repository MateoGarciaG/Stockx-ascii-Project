package edu.pingpong.stockx.domain.criteria;

import java.util.List;

import edu.pingpong.stockx.domain.item.*;

public interface Criteria {

    public List<Offer> checkCriteria(Item item);
    
}
