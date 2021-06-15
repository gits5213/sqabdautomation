package com.brac.bkash.tc;

import com.brac.bkash.pages.InScrollPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InScrollTest extends BaseTest{

    @Test
    public void inScrollTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getInScrollTestLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.IN_SCROLL_URL );
        sleepTest(1000);

        InScrollPage inp = new InScrollPage(driver);
        String headerText = inp.getInScrollHeadingText().getText();
        Assert.assertEquals(headerText, Data.IN_SCROLL_HEADER);
        sleepTest(1000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        long initialHeight = (long)(jse.executeScript("return document.body.scrollHeight"));

        while (true){
            jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            sleepTest(2000);
            long currentHeight = (long)(jse.executeScript("return document.body.scrollHeight"));
            if (initialHeight==currentHeight) {
                break;
            }
        }

        driver.navigate().back();
        sleepTest(1000);


    }
}
