package com.epam.second.report;


import com.epam.second.entity.Sweet;
import com.epam.second.exception.GiftLogicException;
import com.epam.second.file.FileWorker;

import java.util.List;
import java.util.Set;

public class Report {
    private static final String FILE_PATH = "data/report.txt";
    private static final String GIFT_TITLE = "------------------------ Gift ------------------------\n";
    private static final String GIFT_WEIGHT_TITLE = "--------------------- Gift Weight --------------------\n";
    private static final String SWEETS_TITLE = "-------------- Sweets with definite sugar ------------\n";
    private static final String ENDER = "------------------------------------------------------\n";
    private FileWorker worker;

    public Report() {
        this.worker = new FileWorker();
    }

    public void writeGiftDataReport(List<String> data) throws GiftLogicException {
        if (data == null) {
            throw new GiftLogicException("Gift data is null.");
        }

        worker.addDataToFile(FILE_PATH, GIFT_TITLE);
        worker.addLinesToFile(FILE_PATH, data);
        worker.addDataToFile(FILE_PATH, ENDER);
    }

    public void writeGiftWeightReport(int weight) {
        worker.addDataToFile(FILE_PATH, GIFT_WEIGHT_TITLE);
        worker.addDataToFile(FILE_PATH, "Weight = " + weight + " g\n");
        worker.addDataToFile(FILE_PATH, ENDER);
    }

    public void writeSweetsWithDefiniteSugarReport(Set<Sweet> data) throws GiftLogicException {
        if (data == null) {
            throw new GiftLogicException("Sweets data with define sugar is null.");
        }

        worker.addDataToFile(FILE_PATH, SWEETS_TITLE);
        data.forEach(sweet -> worker.addDataToFile(FILE_PATH, sweet.toString() + "\n"));
        worker.addDataToFile(FILE_PATH, ENDER);
    }
}
