package com.epam.second.action;

import com.epam.second.entity.Gift;
import com.epam.second.entity.Sweet;
import com.epam.second.comparator.SweetWeightComparator;

import java.util.Collections;
import java.util.HashSet;

public class GiftAction {
    public int defineGiftWeight(Gift gift) {
        int result = 0;

        for(Sweet temp : gift.getSweets()) {
            result += temp.getWeight();
        }

        return result;
    }

    public void sortGiftByWeight(Gift gift) {
        Collections.sort(gift.getSweets(), new SweetWeightComparator());
    }

    public HashSet<Sweet> findSweetsBySugar(Gift gift, int min, int max) {
        HashSet<Sweet> result = new HashSet<Sweet>();

        for(Sweet temp : gift.getSweets()) {
            if(temp.getSugar() < max && temp.getSugar() > min) {
                result.add(temp);
            }
        }

        return result;
    }
}
