package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.Data.Data;
import com.brac.bkash.MahbubLiveProject.pages.InputPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputTest extends BaseTest{

    @Test
    public void inputTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getInputsTestLink().click();
        sleepTest(2000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.INPUT_URL);
        sleepTest(1000);

        InputPage ip = new InputPage(driver);
        String headerText = ip.getInputHeadingText().getText();
        Assert.assertEquals(headerText, Data.INPUT_HEADER_TEXT);
        sleepTest(1000);

        Actions action = new Actions(driver);
        ip.getInputBox().click();
        action.sendKeys("123e++").perform();
        sleepTest(2000);

        driver.navigate().back();
        sleepTest(1000);
    }
}