package com.epam.second.factory;

import com.epam.second.entity.Chocolate;
import com.epam.second.entity.Sweet;
import com.epam.second.type.ChocolateColor;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChocolateFactory extends AbstractSweetFactory {
    private static final int ID_POSITION = 1;
    private static final int NAME_POSITION = 2;
    private static final int WEIGHT_POSITION = 3;
    private static final int SUGAR_POSITION = 4;
    private static final int CALORIES_POSITION = 5;
    private static final int COLOR_POSITION = 6;
    private static final Logger LOG = LogManager.getRootLogger();

    @Override
    public Sweet createSweet(String... param) {
        try {
            int sweetId = Integer.parseInt(param[ID_POSITION]);
            String name = param[NAME_POSITION];
            int weight = Integer.parseInt(param[WEIGHT_POSITION]);
            int sugar = Integer.parseInt(param[SUGAR_POSITION]);
            int calories = Integer.parseInt(param[CALORIES_POSITION]);
            ChocolateColor type = ChocolateColor.valueOf(param[COLOR_POSITION].toUpperCase());

            return new Chocolate(sweetId, name, weight, sugar, calories, type);
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            LOG.log(Level.ERROR, e);
            return null;
        }
    }
}
