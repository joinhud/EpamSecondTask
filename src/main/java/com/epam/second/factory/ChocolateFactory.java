package com.epam.second.factory;

import com.epam.second.entity.Chocolate;
import com.epam.second.entity.Sweet;

public class ChocolateFactory extends AbstractSweetFactory {
    @Override
    public Sweet createSweet() {
        return new Chocolate();
    }
}
