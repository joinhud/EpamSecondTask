package com.epam.second.entity;

import java.util.LinkedList;

public class Gift {

    private LinkedList<Sweet> sweets;

    public Gift() {
        this.sweets = new LinkedList<Sweet>();
    }

    public LinkedList<Sweet> getSweets() {
        return sweets;
    }

    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

}
