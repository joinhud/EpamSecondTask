package com.epam.second.entity;

public class Chocolate extends Sweet {
    private ChocolateColor color;

    public Chocolate() {
        this.color = ChocolateColor.NONE;
    }

    public Chocolate(int id, String name, int weight, int sugar, int calories, ChocolateColor color) {
        super(id, name, weight, sugar, calories);
        this.color = color;
    }

    public ChocolateColor getColor() {
        return color;
    }

    public void setColor(ChocolateColor color) {
        this.color = color;
    }
}
