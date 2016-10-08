package com.epam.second.file;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FileWorkerTest {
    private static FileWorker worker;

    @BeforeClass
    public static void initFileWorker() {
        worker = new FileWorker();
    }

    @Test(expected = RuntimeException.class)
    public void readLinesFromFileTestIncorrectPath() {
        List<String> actual = null;
        actual = worker.readLinesFromFile("data/testReadLines.txt");
        Assert.assertNull(actual);
    }

    @Test(expected = RuntimeException.class)
    public void readLinesFromFileTestNullPath() {
        List<String> actual = null;
        actual = worker.readLinesFromFile(null);
        Assert.assertNull(actual);
    }

    @Test
    public void readLinesFromFileTestResult() {
        List<String> actual = null;
        actual = worker.readLinesFromFile("data/params.txt");
        Assert.assertNotNull(actual);
    }

    @Test(expected = RuntimeException.class)
    public void addLinesToFileTestNullPath() {
        List<String> lines = new ArrayList<>();
        worker.addLinesToFile(null, lines);
    }

    @Test(expected = RuntimeException.class)
    public void addLinesToFileTestNullLines() {
        worker.addLinesToFile("data/testAddLinesToFile.txt", null);
    }

    @Test(expected = RuntimeException.class)
    public void addLinesToFileTestNullLinesAndPath() {
        worker.addLinesToFile(null, null);
    }

    @Test
    public void addLinesToFileTestCorrectParams() {
        List<String> lines = new ArrayList<>();
        worker.addLinesToFile("data/testAddLinesToFile.txt", lines);
    }

    @Test(expected = RuntimeException.class)
    public void addDataToFileTestNullPath() {
        worker.addDataToFile(null, "Data");
    }

    @Test(expected = RuntimeException.class)
    public void addDataToFileTestNullData() {
        worker.addDataToFile("data/testAddDataToFile.txt", null);
    }

    @Test(expected = RuntimeException.class)
    public void addDataToFileTestNullPathAndData() {
        worker.addDataToFile(null, null);
    }

    @Test
    public void addDataToFileTestCorrectParams() {
        worker.addDataToFile("data/testAddDataToFile.txt", "Data");
    }
}