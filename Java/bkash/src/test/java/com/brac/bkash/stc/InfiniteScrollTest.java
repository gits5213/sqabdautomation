package com.brac.bkash.stc;

import com.brac.bkash.Spages.LandingPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class InfiniteScrollTest extends BaseTest{
    @Test
    public void InfiniteScrollTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getInfiniteScrollLink().click();
        sleepTest(20000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000000);");
        sleepTest(5000);


        driver.navigate().back();
        sleepTest(1000);

    }

}
