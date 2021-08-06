package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.ContextMenuPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest{

    @Test
    public void contextMenuTest (){

        LandingPage lp = new LandingPage(driver);
        lp.getContextMenuTest().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.CONTEXTMENU );
        sleepTest(1000);

        ContextMenuPage cmp = new ContextMenuPage(driver);
        String headerText = cmp.getContextHeadingText().getText();
        Assert.assertEquals(headerText, Data.CONTEXT_MENU_HEADER);
        sleepTest(1000);

        Actions act = new Actions(driver);
        act.contextClick(cmp.getContextZone()).perform();
        driver.switchTo().alert().accept();
        sleepTest(1000);

        driver.navigate().back();
        sleepTest(1000);

    }
}