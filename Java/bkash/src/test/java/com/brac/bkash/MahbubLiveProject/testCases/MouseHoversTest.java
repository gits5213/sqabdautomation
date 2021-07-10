package com.brac.bkash.MahbubLiveProject.testCases;


import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.pages.MouseHoversPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseHoversTest extends BaseTest{

        @Test
        public void mouseHoversTest(){
        LandingPage lp = new LandingPage(driver);
        lp.getMouseHoversTestLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.HOVERS_URL );
        sleepTest(1000);

        MouseHoversPage mh = new MouseHoversPage(driver);
        String headerText = mh.getMouseHeadingText().getText();
        Assert.assertEquals(headerText, Data.HOVERS_HEADER);
        sleepTest(1000);



        Actions action = new Actions(driver);

        action.moveToElement(mh.getProfile1()).perform();
        sleepTest(500);
        mh.getViewProfile1().click();
        sleepTest(500);
        driver.navigate().back();



        action.moveToElement(mh.getProfile2()).perform();
        sleepTest(1000);
        mh.getViewProfile2().click();
        sleepTest(500);
        driver.navigate().back();



        action.moveToElement(mh.getProfile3()).perform();
        sleepTest(1000);
        mh.getViewProfile3().click();
        sleepTest(500);
        driver.navigate().back();



        driver.navigate().back();
        sleepTest(1000);

    }
}
