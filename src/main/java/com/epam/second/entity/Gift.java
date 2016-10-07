package com.epam.second.entity;

import java.util.LinkedList;
import java.util.List;

public class Gift {

    private LinkedList<Sweet> sweets;

    public Gift() {
        this.sweets = new LinkedList<>();
    }

    public List<Sweet> getSweets() {
        return sweets;
    }

    public boolean addSweet(Sweet sweet) {
        boolean result = false;
        if(sweet != null) {
            sweets.add(sweet);
            result = true;
        }

        return result;
    }

}
