package com.epam.second.entity;

import com.epam.second.type.TypeCandy;

public class Candy extends Sweet {

    private TypeCandy type;

    public Candy(int id, String name, int weight, int sugar, int calories, TypeCandy type) {
        super(id, name, weight, sugar, calories);
        setType(type);
    }

    public TypeCandy getType() {
        return type;
    }

    public void setType(TypeCandy type) {
        this.type = type;
    }

    @Override
    public String defineType() {
        return type.toString();
    }
}
