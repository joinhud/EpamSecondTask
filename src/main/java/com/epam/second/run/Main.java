package com.epam.second.run;

import com.epam.second.action.GiftAction;
import com.epam.second.entity.Gift;
import com.epam.second.exception.GiftActionLogicException;
import com.epam.second.exception.GiftLogicException;
import com.epam.second.factory.BuildGift;
import com.epam.second.report.Report;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOG = LogManager.getRootLogger();

    public static void main(String param[]) {
        Gift gift = new Gift();
        BuildGift builder = new BuildGift();
        GiftAction action = new GiftAction();
        Report report = new Report();

        try {
            builder.buildGift(gift);
            report.writeGiftDataReport(action.composeGiftDataToStringList(gift));
            report.writeGiftWeightReport(action.defineGiftWeight(gift));
            action.sortGiftByWeight(gift);
            report.writeGiftDataReport(action.composeGiftDataToStringList(gift));
            report.writeSweetsWithDefiniteSugarReport(action.findSweetsBySugar(gift, 25, 35));
        } catch (GiftActionLogicException | GiftLogicException e) {
            LOG.log(Level.ERROR, e);
        }
    }
}
