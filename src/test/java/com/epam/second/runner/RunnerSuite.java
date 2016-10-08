package com.epam.second.runner;

import com.epam.second.entity.GiftTest;
import com.epam.second.factory.BuildGiftTest;
import com.epam.second.factory.CandyFactoryTest;
import com.epam.second.factory.ChocolateFactoryTest;
import com.epam.second.file.FileWorkerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({GiftTest.class, BuildGiftTest.class,
        CandyFactoryTest.class, ChocolateFactoryTest.class, FileWorkerTest.class})
@RunWith(Suite.class)
public class RunnerSuite {
}
