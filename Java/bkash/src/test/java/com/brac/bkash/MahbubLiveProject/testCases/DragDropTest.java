package com.brac.bkash.MahbubLiveProject.testCases;

import com.brac.bkash.MahbubLiveProject.pages.DragDropPage;
import com.brac.bkash.MahbubLiveProject.pages.LandingPage;
import com.brac.bkash.MahbubLiveProject.Data.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DragDropTest extends BaseTest{
    @Test
    public void dragDropTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getDragDropTest().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.DRAG_DROP );
        sleepTest(1000);

        DragDropPage ddp = new DragDropPage(driver);
        String headerText = ddp.getDragDropHeadText().getText();
        Assert.assertEquals(headerText, Data.DRAG_DROP_HEADER);
        sleepTest(1000);

        WebElement src = ddp.dragDropSrc;
        WebElement dest = ddp.dragDropDest;

        Actions act = new Actions(driver);
        act.clickAndHold(src)
                .pause(Duration.ofSeconds(1))
                .moveToElement(dest)
                .pause(Duration.ofSeconds(1))
                .release()
                .pause(Duration.ofSeconds(1))
                .build()
                .perform();




        driver.navigate().back();
        sleepTest(1000);
    }
}
