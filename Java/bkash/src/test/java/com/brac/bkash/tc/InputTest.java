package com.brac.bkash.tc;

import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.pages.LandingPage;
import org.testng.annotations.Test;

public class InputTest extends BaseTest {

    @Test
    public void inputTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getInputsTestLink().click();
        sleepTest(5000);










        driver.navigate().back();
        sleepTest(1000);
    }
}
