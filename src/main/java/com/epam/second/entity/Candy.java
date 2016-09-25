package com.epam.second.entity;

public class Candy extends Sweet {

    private TypeCandy type;

    public Candy() {
        this.type = TypeCandy.NONE;
    }

    public Candy(int id, String name, int weight, int sugar, int calories, TypeCandy type) {
        super(id, name, weight, sugar, calories);
        this.type = type;
    }

    public TypeCandy getType() {
        return type;
    }

    public void setType(TypeCandy type) {
        this.type = type;
    }
}
