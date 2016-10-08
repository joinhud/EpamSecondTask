package com.epam.second.entity;

import com.epam.second.type.TypeCandy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class GiftTest {
    private static Gift gift;

    @BeforeClass
    public static void initGift() {
        gift = new Gift();
    }

    @Test
    public void addSweetTestIncorrectParams() {
        boolean actual = gift.addSweet(null);
        Assert.assertFalse(actual);
    }

    @Test
    public void addSweetTestCorrectParams() {
        boolean actual = gift.addSweet(new Candy(1, "", 23, 23, 23, TypeCandy.LOLLIPOP));
        Assert.assertTrue(actual);
    }
}