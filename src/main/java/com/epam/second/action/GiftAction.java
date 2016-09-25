package com.epam.second.action;

import com.epam.second.entity.Gift;
import com.epam.second.entity.Sweet;
import com.epam.second.entity.SweetComparator;

import java.util.Collections;
import java.util.HashSet;

public class GiftAction {
    public int getGiftWeight(Gift gift) {
        int result = 0;

        for(Sweet temp : gift.getSweets()) {
            result += temp.getWeight();
        }

        return result;
    }

    public void sortByWeight(Gift gift) {
        Collections.sort(gift.getSweets(), new SweetComparator());
    }

    public HashSet<Sweet> getBySugar(Gift gift, int min, int max) {
        HashSet<Sweet> result = new HashSet<Sweet>();

        for(Sweet temp : gift.getSweets()) {
            if(temp.getSugar() < max && temp.getSugar() > min) {
                result.add(temp);
            }
        }

        return result;
    }
}
