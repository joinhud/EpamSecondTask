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
        setId(id);
        setName(name);
        setWeight(weight);
        setSugar(sugar);
        setCalories(calories);
    }

    public int getId() {
        return sweetId;
    }

    public void setId(int sweetId) {
        this.sweetId = sweetId >= 0 ? sweetId : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name : "no name";
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight >= 0 ? weight : 0;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar >= 0 ? sugar : 0;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories >= 0 ? calories : 0;
    }

    public abstract String defineType();

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

    @Override
    public String toString() {
        return "Sweet{" +
                "Id=" + sweetId +
                ", name='" + name + '\'' +
                ", weight=" + weight + " g" +
                ", sugar=" + sugar + " %" +
                ", calories=" + calories +
                ", type=" + defineType() + '}';
    }
}
