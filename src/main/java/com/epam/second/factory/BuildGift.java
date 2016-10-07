package com.epam.second.factory;

import com.epam.second.action.GiftAction;
import com.epam.second.entity.Gift;
import com.epam.second.entity.Sweet;
import com.epam.second.exception.GiftLogicException;
import com.epam.second.file.FileWorker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class BuildGift {
    private static final Logger LOG = LogManager.getRootLogger();
    private static final String FILE_PATH = "data/params.txt";
    private static final String PARAM_SPLITTER = " ";
    private static final int SWEET_TYPE_POSITION = 0;
    private static final String CANDY_SWEET = "CANDY";
    private static final String CHOCOLATE_SWEET = "CHOCOLATE";

    public void buildGift(Gift gift) throws GiftLogicException {
        if (!new GiftAction().checkGift(gift)) {
            throw new GiftLogicException("Gift object is null.");
        }

        FileWorker worker = new FileWorker();
        List<String[]> params = splitStringParams(worker.readLinesFromFile(FILE_PATH));
        AbstractSweetFactory factory;

        for (String[] temp : params) {
            factory = parseTypeOfSweet(temp[SWEET_TYPE_POSITION]);
            if (!gift.addSweet(makeSweet(factory, temp))) {
                LOG.info("Sweet didn't add in Gift object. Incorrect parameters.");
            }
        }
    }

    private Sweet makeSweet(AbstractSweetFactory factory, String... param) {
        return factory != null ? factory.createSweet(param) : null;
    }

    private List<String[]> splitStringParams(List<String> lines) {
        List<String[]> stringParams = new ArrayList<>();

        for (String params : lines) {
            stringParams.add(params.split(PARAM_SPLITTER));
        }

        return stringParams;
    }

    private AbstractSweetFactory parseTypeOfSweet(String param) {
        AbstractSweetFactory factory;

        switch (param.toUpperCase()) {
            case CANDY_SWEET:
                factory = new CandyFactory();
                break;
            case CHOCOLATE_SWEET:
                factory = new ChocolateFactory();
                break;
            default:
                factory = null;
        }

        return factory;
    }
}
