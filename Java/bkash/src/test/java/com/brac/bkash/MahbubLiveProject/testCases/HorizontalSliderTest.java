package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.HorizontalSliderPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTest{

    @Test
    public void horizontalSliderTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getSliderTestLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.HOR_SLIDER_URL );
        sleepTest(1000);

        HorizontalSliderPage hsp = new HorizontalSliderPage(driver);
        String headerText = hsp.getHorizontalSliderPageText().getText();
        Assert.assertEquals(headerText, Data.HOR_SLIDER_HEADER);
        sleepTest(1000);

        Actions act = new Actions(driver);
        act.dragAndDrop(hsp.getHorizontalSlider(),hsp.getHorizontalRange()).perform();
        sleepTest(2000);

        act.dragAndDropBy(hsp.getHorizontalSlider(), -3,0).perform();
        sleepTest(2000);


        driver.navigate().back();
        sleepTest(1000);

    }
}
