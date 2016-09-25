package com.epam.second.factory;


import com.epam.second.entity.Candy;
import com.epam.second.entity.Sweet;

public class CandyFactory extends AbstractSweetFactory {
    public Sweet createSweet() {
        return new Candy();
    }
}
