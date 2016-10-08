package com.epam.second.factory;

import com.epam.second.entity.Gift;
import com.epam.second.exception.GiftLogicException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BuildGiftTest {
    private static BuildGift builder;

    @BeforeClass
    public static void initBuilder() {
        builder = new BuildGift();
    }

    @Test(expected = GiftLogicException.class)
    public void buildGiftTestIncorrectParams() throws GiftLogicException {
        builder.buildGift(null);
    }

    @Test
    public void buildGiftTestCorrectParams() throws GiftLogicException {
        Gift gift = new Gift();
        builder.buildGift(gift);
        Assert.assertFalse(gift.getSweets().isEmpty());
    }
}