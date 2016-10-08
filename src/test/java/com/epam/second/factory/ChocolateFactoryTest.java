package com.epam.second.factory;

import com.epam.second.entity.Sweet;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChocolateFactoryTest {
    private static ChocolateFactory factory;

    @BeforeClass
    public static void initFactory() {
        factory = new ChocolateFactory();
    }

    @Test
    public void createSweetTestIdIncorrectType() {
        Sweet actual = factory.createSweet("", "asf", "AlpenGold", "200", "30", "130", "BLACK_CHOCOLATE");
        Assert.assertNull(actual);
    }

    @Test
    public void createSweetTestIdIncorrectValue() {
        Sweet sweet = factory.createSweet("", "-7", "AlpenGold", "200", "30", "130", "BLACK_CHOCOLATE");
        int expected = 0;
        int actual = sweet.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createSweetTestNameIncorrectValue() {
        Sweet sweet = factory.createSweet("", "19", null, "200", "30", "130", "BLACK_CHOCOLATE");
        String expected = "no name";
        String actual = sweet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createSweetTestWeightIncorrectType() {
        Sweet actual = factory.createSweet("", "20", "AlpenGold", "ghj", "30", "130", "BLACK_CHOCOLATE");
        Assert.assertNull(actual);
    }

    @Test
    public void createSweetTestWeightIncorrectValue() {
        Sweet sweet = factory.createSweet("", "19", "AlpenGold", "-200", "30", "130", "BLACK_CHOCOLATE");
        int expected = 0;
        int actual = sweet.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createSweetTestSugarIncorrectType() {
        Sweet actual = factory.createSweet("", "20", "AlpenGold", "200", "q", "130", "BLACK_CHOCOLATE");
        Assert.assertNull(actual);
    }

    @Test
    public void createSweetTestSugarIncorrectValue() {
        Sweet sweet = factory.createSweet("", "19", "AlpenGold", "200", "-30", "130", "BLACK_CHOCOLATE");
        int expected = 0;
        int actual = sweet.getSugar();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createSweetTestCaloriesIncorrectType() {
        Sweet actual = factory.createSweet("", "20", "AlpenGold", "200", "30", "ytu", "BLACK_CHOCOLATE");
        Assert.assertNull(actual);
    }

    @Test
    public void createSweetTestCaloriesIncorrectValue() {
        Sweet sweet = factory.createSweet("", "19", "AlpenGold", "200", "30", "-130", "BLACK_CHOCOLATE");
        int expected = 0;
        int actual = sweet.getCalories();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createSweetTestTypeIncorrect() {
        Sweet actual = factory.createSweet("", "20", "AlpenGold", "200", "30", "130", "ChewInG_GUM");
        Assert.assertNull(actual);
    }

    @Test
    public void createSweetTestIncorrectParamsValue() {
        Sweet actual = factory.createSweet("", "qwe", "AlpenGold", "qwe;das", "w", "nbnm", "123312");
        Assert.assertNull(actual);
    }

    @Test
    public void createSweetTestIncorrectParamsCount() {
        Sweet actual = factory.createSweet("", "20", "AlpenGold", "200");
        Assert.assertNull(actual);
    }

    @Test
    public void createSweetTestCorrectParams() {
        Sweet actual = factory.createSweet("", "20", "AlpenGold", "200", "30", "130", "BLacK_ChOcOLatE");
        Assert.assertNotNull(actual);
    }
}