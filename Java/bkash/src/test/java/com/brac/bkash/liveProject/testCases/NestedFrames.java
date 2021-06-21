package com.brac.bkash.liveProject.testCases;

import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.tc.BaseTest;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrames extends BaseTest {

    @Test
    public void nestedFrames(){

        //Navigate to the URL
        LandingPage lp = new LandingPage(driver);
        lp.getNestedFramesLink().click();
        sleepTest(1000);

        //Validate Frames URL
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.NESTED_FRAMES);
        sleepTest(2000);

//        //Validate Nested Frames
//        WebElement NestedFrames = driver.findElement(By.xpath("//div[@id='content']//ul//a[@href='/nested_frames']"));
//        NestedFrames.click();
        driver.switchTo().frame("LEFT");
        System.out.println (driver.findElement(By.xpath("/html/body")).getText());
        driver.switchTo().frame("MIDDLE");
        System.out.println (driver.findElement(By.xpath("/html/body")).getText());
        driver.switchTo().frame("RIGHT");
        System.out.println (driver.findElement(By.xpath("/html/body")).getText());
        driver.switchTo().frame("BOTTOM");
        System.out.println (driver.findElement(By.xpath("/html/body")).getText());
        sleepTest(2000);

    }
}
