package com.epam.second.entity;

public abstract class Sweet {
    private int sweetId;
    private String name;
    private int weight;
    private int sugar;
    private int calories;

    Sweet() {
        this.sweetId = 0;
        this.name = "no name";
        this.weight = 0;
        this.sugar = 0;
        this.calories = 0;
    }

    Sweet(int id, String name, int weight, int sugar, int calories) {
        this.sweetId = id;
        this.name = name;
        this.weight = weight;
        this.sugar = sugar;
        this.calories = calories;
    }

    public int getId() {
        return sweetId;
    }

    public void setId(int sweetId) {
        this.sweetId = sweetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sweet sweet = (Sweet) o;

        if (sweetId != sweet.sweetId) return false;
        if (weight != sweet.weight) return false;
        if (sugar != sweet.sugar) return false;
        if (calories != sweet.calories) return false;
        return name.equals(sweet.name);

    }

    @Override
    public int hashCode() {
        int result = sweetId;
        result = 31 * result + name.hashCode();
        result = 31 * result + weight;
        result = 31 * result + sugar;
        result = 31 * result + calories;
        return result;
    }
}
