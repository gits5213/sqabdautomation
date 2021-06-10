package com.brac.bkash.tc;

import com.brac.bkash.pages.FrameTestPage;
import com.brac.bkash.pages.LandingPage;
import com.brac.bkash.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest{

    @Test
    public void frameTest(){

        LandingPage lp = new LandingPage(driver);
        lp.getFrameTestLink().click();
        sleepTest(1000);

        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, Data.BASE_URL + Data.FRAME_URL );
        sleepTest(1000);

        FrameTestPage frameTestPage = new FrameTestPage(driver);
        String headerText = frameTestPage.getFrameTestHeadingText().getText();
        Assert.assertEquals(headerText, Data.FRAME_HEADER);
        sleepTest(1000);

//        Validating Frames
        driver.findElement(By.xpath("//div[@id='content']//ul//a[@href='/nested_frames']")).click();


       driver.switchTo().frame(0);
//        driver.switchTo().frame(1);
//        driver.switchTo().frame(2);
//        driver.switchTo().frame(3);
//       driver.findElement(By.xpath("//frameset[@name='frameset-middle']/frame[@name='frame-left']"));
        System.out.println(driver.getTitle());
        sleepTest(2000);

//        Validate iframe
        driver.findElement(By.xpath("//div[@id='content']//ul//a[@href='/iframe']"));



        driver.navigate().back();
        sleepTest(1000);
    }
}
