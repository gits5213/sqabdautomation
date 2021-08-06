package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.Data.Data;
import com.brac.bkash.MahbubLiveProject.pages.DissapearingElementsPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DissapearingElements extends BaseTest {


    @Test
    public void dissapearingElements () {

        LandingPage lp = new LandingPage(driver);
        lp.getDisappearingElementLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.DISAPPEARING_ELEMENTS_URL);
        sleepTest(1000);

        DissapearingElementsPage dep = new DissapearingElementsPage(driver);
        String headerText = dep.getDisappearElementHeadingText().getText();
        Assert.assertEquals(headerText, Data.DISAPPEARING_ELEMENTS_HEADER);
        sleepTest(1000);

        String paraText = dep.getDisappearElementParaText().getText();
        Assert.assertEquals(paraText, Data.DISAPPEARING_ELEMENTS_PARA_TEXT);
        sleepTest(1000);

        dep.getHomeMenu().click();
        driver.navigate().back();
        sleepTest(1000);


        dep.getAboutMenu().click();
        driver.navigate().back();
        sleepTest(1000);

        dep.getContactUsMenu().click();
        sleepTest(1000);
        driver.navigate().back();

        dep.getPortfolioMenu().click();
        sleepTest(1000);
        driver.navigate().back();
        sleepTest(1000);

        dep.getGalleryMenu().click();
        sleepTest(1000);
        driver.navigate().back();
        driver.navigate().back();




    }
}
