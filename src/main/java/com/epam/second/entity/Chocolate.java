package com.epam.second.entity;

import com.epam.second.type.ChocolateColor;

public class Chocolate extends Sweet {
    private ChocolateColor color;

    public Chocolate(int id, String name, int weight, int sugar, int calories, ChocolateColor color) {
        super(id, name, weight, sugar, calories);
        setColor(color);
    }

    public ChocolateColor getColor() {
        return color;
    }

    public void setColor(ChocolateColor color) {
        this.color = color;
    }

    @Override
    public String defineType() {
        return color.toString();
    }
}
