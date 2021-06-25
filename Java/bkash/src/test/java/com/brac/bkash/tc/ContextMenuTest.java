package com.brac.bkash.tc;

import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenuTest (){

        LandingPage lp = new LandingPage(driver);
        lp.getContextMenuTest().click();
        sleepTest(2000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.CONTEXTMENU );
        sleepTest(2000);

        ///////////////////////////
        Actions act = new Actions(driver);
        act.contextClick(driver.findElement(By.xpath("/html//div[@id='hot-spot']"))).perform();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        sleepTest(2000);


    //Back
        driver.navigate().back();
        sleepTest(1000);

    }
}
