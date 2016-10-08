package com.epam.second.action;

import com.epam.second.comparator.SweetWeightComparator;
import com.epam.second.entity.Gift;
import com.epam.second.entity.Sweet;
import com.epam.second.exception.GiftActionLogicException;
import com.epam.second.exception.GiftLogicException;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class GiftAction {

    public boolean checkGift(Gift gift) {
        return !(gift == null);
    }

    public int defineGiftWeight(Gift gift) throws GiftLogicException {
        if (!checkGift(gift)) {
            throw new GiftLogicException("Gift object is null.");
        }
        int result = 0;

        for (Sweet temp : gift.getSweets()) {
            result += temp.getWeight();
        }

        return result;
    }

    public void sortGiftByWeight(Gift gift) throws GiftLogicException {
        if (!checkGift(gift)) {
            throw new GiftLogicException("Gift object is null.");
        }
        Collections.sort(gift.getSweets(), new SweetWeightComparator());
    }

    public HashSet<Sweet> findSweetsBySugar(Gift gift, int min, int max)
            throws GiftLogicException, GiftActionLogicException {
        if (!checkGift(gift)) {
            throw new GiftLogicException("Gift object is null.");
        }
        if (max <= min) {
            throw new GiftActionLogicException("Incorrect sugar range in findSweetsBySugar() method.");
        }

        HashSet<Sweet> result = new HashSet<>();

        for (Sweet temp : gift.getSweets()) {
            if (temp.getSugar() < max && temp.getSugar() > min) {
                result.add(temp);
            }
        }

        return result;
    }

    public List<String> composeGiftDataToStringList(Gift gift) throws GiftLogicException {
        if (!checkGift(gift)) {
            throw new GiftLogicException("Gift object is null.");
        }

        return gift.getSweets().stream()
                .map(Sweet::toString)
                .collect(Collectors.toList());
    }
}
