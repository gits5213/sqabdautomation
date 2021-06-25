package com.brac.bkash.tc;

import com.brac.bkash.liveProject.testCases.BaseTest;
import com.brac.bkash.pages.HorizontalSliderPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends BaseTest {

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

        WebElement slider = driver.findElement(By.xpath("/html//div[@id='content']//input[@value='0']"));
        WebElement range = driver.findElement(By.xpath("/html//span[@id='range']"));

        Actions act = new Actions(driver);
        act.dragAndDrop(slider,range).perform();
        sleepTest(2000);

        act.dragAndDropBy(slider,-3,0).perform();
        sleepTest(2000);


        driver.navigate().back();
        sleepTest(1000);

    }
}
